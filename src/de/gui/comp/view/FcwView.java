package de.gui.comp.view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

import de.gui.comp.FwcViewPnl;

public class FcwView extends JPanel
{
	/** default id */
	private static final long	serialVersionUID	= 1L;

	/** Max width of the workplace to draw at. */
	private static final int	WORKPLACE_WIDTH		= 10000;
	/** Max height of the workplace to draw at. */
	private static final int	WORKPLACE_HEIGHT	= 10000;

	/**
	 * The image for buffering the the whole drawing.<br>
	 * Everything to draw will first be drawn on this image, which will afterwards be drawn zoomed
	 * and translated on this component.
	 */
	private Image				bufferImage;
	/** boolean indicating whether this component is currently painting */
	private boolean				painting;

	/** The viewpanel this view is placed in. */
	private FwcViewPnl			parent;

	/** The dimensions to be drawn onto this view */
	private Dimensions			drawDim;

	/**
	 * Create a default view and link it with the given viewpanel
	 * 
	 * @param parent
	 *            The parent to correspond to.
	 */
	public FcwView(FwcViewPnl parent)
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
				super.mouseClicked(e);
			}

			@Override
			public void mousePressed(MouseEvent e)
			{
				p = e.getPoint();
			}

			@Override
			public void mouseReleased(MouseEvent e)
			{
				super.mouseReleased(e);
			}

			@Override
			public void mouseEntered(MouseEvent e)
			{
				super.mouseEntered(e);
			}

			@Override
			public void mouseExited(MouseEvent e)
			{
				super.mouseExited(e);
			}

			@Override
			public void mouseWheelMoved(MouseWheelEvent e)
			{
				super.mouseWheelMoved(e);
			}

			@Override
			public void mouseDragged(MouseEvent e)
			{
				Point p = e.getPoint();

				drawDim.translate((int)(p.getX() - this.p.getX()), (int)(p.getY() - this.p.getY()));
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

		// XXX implement real drawing
		// TODO just test drawing
		{
			g2.setColor(Color.BLACK);
			g2.fillOval(0, 0, 100, 100);
		}

		g2.dispose();

		g.drawImage(bufferImage, 0, 0, getWidth(), getHeight(), -drawDim.getX(), -drawDim.getY(),
			-drawDim.getX() + drawDim.getWidth(), -drawDim.getY() + drawDim.getHeight(), this);
	}
}
