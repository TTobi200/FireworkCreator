package de.gui.comp.view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.dnd.DnDConstants;
import java.awt.dnd.DropTarget;
import java.awt.dnd.DropTargetDragEvent;
import java.awt.dnd.DropTargetDropEvent;
import java.awt.dnd.DropTargetEvent;
import java.awt.dnd.DropTargetListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

import de.fw.FwcFwArticle;
import de.gui.comp.FwcViewPnl;
import de.gui.comp.tools.FwcArtTransfHandler;
import de.gui.comp.view.draw.FwcDrawableArticle;
import de.gui.comp.view.draw.FwcDrawableComponent;

public class FwcView extends JPanel implements DropTargetListener
{
	/** default id */
	private static final long			serialVersionUID	= 1L;

	/** Max width of the workplace to draw at. */
	private static final int			WORKPLACE_WIDTH		= 10000;
	/** Max height of the workplace to draw at. */
	private static final int			WORKPLACE_HEIGHT	= 10000;

	/**
	 * The image for buffering the the whole drawing.<br>
	 * Everything to draw will first be drawn on this image, which will afterwards be drawn zoomed
	 * and translated on this component.
	 */
	private Image						bufferImage;
	/** boolean indicating whether this component is currently painting */
	private boolean						painting;

	/** The viewpanel this view is placed in. */
	private FwcViewPnl					parent;

	/** The dimensions to be drawn onto this view */
	private Dimensions					drawDim;
	// TODO first implement, maybe remove later
	/** indicating whether user is currently dragging */
	@SuppressWarnings("unused")
	private boolean						isDragging;

	private List<FwcDrawableComponent>	listDrawables;

	/**
	 * Create a default view and link it with the given viewpanel
	 * 
	 * @param parent
	 *            The parent to correspond to.
	 */
	public FwcView(FwcViewPnl parent)
	{
		this.parent = parent;

		init();

		addListener();
	}

	/**
	 * Initialize this component
	 */
	private void init()
	{
		createImage();

		drawDim = new Dimensions();

		setBackground(Color.WHITE);

		setDropTarget(new DropTarget(this, this));

		listDrawables = new ArrayList<>();
	}

	/**
	 * Add all the listeners needed to run this component
	 */
	private void addListener()
	{
		MouseAdapter ma = new MouseAdapter()
		{
			/** The last saved Mouse-position */
			private Point	p;

			@Override
			public void mouseClicked(MouseEvent e)
			{
			}

			@Override
			public void mousePressed(MouseEvent e)
			{
				p = e.getPoint();
			}

			@Override
			public void mouseReleased(MouseEvent e)
			{
			}

			@Override
			public void mouseEntered(MouseEvent e)
			{
			}

			@Override
			public void mouseExited(MouseEvent e)
			{
			}

			@Override
			public void mouseWheelMoved(MouseWheelEvent e)
			{
			}

			@Override
			public void mouseDragged(MouseEvent e)
			{
				Point p = e.getPoint();

				int dx = (int)(this.p.getX() - p.getX());
				int dy = (int)(this.p.getY() - p.getY());

				// limit x
				if (dx < 0 && drawDim.getX() != 0 || dx > 0
						&& drawDim.getX() < WORKPLACE_WIDTH - drawDim.getWidth())
				{
					dx += drawDim.getX();

					if (dx < 0)
					{
						dx = 0;
					}
					else if (dx > WORKPLACE_WIDTH - drawDim.getWidth())
					{
						dx = WORKPLACE_WIDTH - drawDim.getWidth();
					}

					drawDim.setX(dx);
				}

				// limit y
				if (dy < 0 && drawDim.getY() != 0 || dy > 0
						&& drawDim.getY() < WORKPLACE_HEIGHT - drawDim.getHeight())
				{
					dy += drawDim.getY();

					if (dy < 0)
					{
						dy = 0;
					}
					else if (dy > WORKPLACE_HEIGHT - drawDim.getHeight())
					{
						dy = WORKPLACE_HEIGHT - drawDim.getHeight();
					}

					drawDim.setY(dy);
				}

				// drawDim.translate((int)(p.getX() - this.p.getX()), (int)(p.getY() -
				// this.p.getY()));
				// drawDim.x += p.getX() - this.p.getX();
				// drawDim.y += p.getY() - this.p.getY();

				this.p = p;

				repaint();
			}

			@Override
			public void mouseMoved(MouseEvent e)
			{
				super.mouseMoved(e);
			}
		};

		ComponentAdapter ca = new ComponentAdapter()
		{
			@Override
			public void componentResized(ComponentEvent e)
			{
				recalcDrawDimensions();
			}

			@Override
			public void componentShown(ComponentEvent e)
			{
				recalcDrawDimensions();
			}
		};

		addMouseListener(ma);
		addMouseMotionListener(ma);
		addComponentListener(ca);
	}

	/**
	 * INform this view that the zoom to be applied has changed.
	 */
	public void notifyZoomChanged()
	{
		recalcDrawDimensions();
	}

	/**
	 * Recalculate the rectangle for drawing of this class.<br>
	 * This method is specially needed every time this' component's size or the zoom has changed.
	 */
	private void recalcDrawDimensions()
	{
		drawDim.setWidth((int)(getWidth() / parent.getZoom()));
		drawDim.setHeight((int)(getHeight() / parent.getZoom()));

		repaint();
	}

	/**
	 * Create the image for backbuffering of this view.
	 */
	private void createImage()
	{
		Image bufferImage = new BufferedImage(WORKPLACE_WIDTH, WORKPLACE_HEIGHT,
				BufferedImage.TYPE_INT_ARGB);

		// don't replace img while painting
		while(painting);
		this.bufferImage = bufferImage;
	}

	@Override
	protected void paintComponent(Graphics g)
	{
		painting = true;
		super.paintComponent(g);

		Graphics g2 = bufferImage.getGraphics();

		// TODO just test drawing
		{
			g2.setColor(Color.BLACK);
			g2.fillOval(0, 0, 100, 100);
		}

		for(FwcDrawableComponent d : listDrawables)
		{
			if (d.getDimensions().intersects(drawDim))
			{
				d.draw(g2);
			}
		}

		g2.dispose();

		g.drawImage(bufferImage, 0, 0, getWidth(), getHeight(), drawDim.getX(), drawDim.getY(),
			drawDim.getMaxX(), drawDim.getMaxY(), this);
	}

	@Override
	public void dragEnter(DropTargetDragEvent dtde)
	{
		isDragging = true;
	}

	@Override
	public void dragOver(DropTargetDragEvent dtde)
	{
		isDragging = true;
	}

	@Override
	public void dropActionChanged(DropTargetDragEvent dtde)
	{
		// TODO ???
	}

	@Override
	public void dragExit(DropTargetEvent dte)
	{
		isDragging = false;
	}

	@Override
	@SuppressWarnings("unchecked")
	public void drop(DropTargetDropEvent dtde)
	{
		isDragging = false;

		dtde.acceptDrop(DnDConstants.ACTION_COPY);

		BufferedImage img = null;

		Transferable trans = dtde.getTransferable();
		try
		{
			if (trans.isDataFlavorSupported(FwcArtTransfHandler.fwcArtFlavor))
			{
				// TODO $DH: use article in view  
				// NOTE: art can be null when selected node has no article
				// (Check this first, otherwise do nothing)
				FwcFwArticle art = (FwcFwArticle)trans.getTransferData(FwcArtTransfHandler.fwcArtFlavor);
				img = FwcImageLoader.loadImage(art.getImgPath());
			}
			else if (trans.isDataFlavorSupported(DataFlavor.imageFlavor))
			{
				img = (BufferedImage)trans.getTransferData(DataFlavor.imageFlavor);
			}
			else if (trans.isDataFlavorSupported(DataFlavor.javaFileListFlavor))
			{
				List<File> listFiles = (List<File>)trans
						.getTransferData(DataFlavor.javaFileListFlavor);

				for(File f : listFiles)
				{
					if (f.exists() && f.isFile())
					{
						img = FwcImageLoader.loadImage(f);

						if (img != null)
						{
							break;
						}
					}
				}
			}
			else if (dtde.getTransferable().isDataFlavorSupported(DataFlavor.stringFlavor))
			{
				String imgPath = (String)trans.getTransferData(DataFlavor.stringFlavor);

				img = FwcImageLoader.loadImage(imgPath);
			}
			else if (dtde.getTransferable().isDataFlavorSupported(
				DataFlavor.getTextPlainUnicodeFlavor()))
			{
				String imgPath = (String)trans.getTransferData(DataFlavor
						.getTextPlainUnicodeFlavor());

				img = FwcImageLoader.loadImage(imgPath);
			}
		}
		catch(UnsupportedFlavorException | IOException e)
		{
			return;
		}

		if (img == null)
		{
			return;
		}

		FwcDrawableArticle d = new FwcDrawableArticle(null, img, new Dimensions(dtde.getLocation().x,
				dtde.getLocation().y, img.getWidth(), img.getHeight()));
		
		listDrawables.add(d);
		
		repaint();
		// TODO add Image
	}
}
