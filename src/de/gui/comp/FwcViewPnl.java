package de.gui.comp;

import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseWheelEvent;

import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import de.gui.comp.view.FcwView;

/**
 * A panel showing the firework-plan graphically
 * 
 * @author ddd
 * @version 0.1
 */
public class FwcViewPnl extends JPanel
{
	/** %-points to change the zoom on each tick when moving the mousewheel */
	private static final int ZOOM_PER_WHEEL_TICK = 5;
	
	/** default id */
	private static final long serialVersionUID = 1L;

	/** Slider for adjusting the zoom */
	private JSlider			slider;
	/** The view for displaying the whole firework-plan graphically */
	private FcwView	visual;

	/** The zoom-factor for the view */
	private double			zoom;
	
	/**
	 * Create a ViewPanel with the default view and a slider for adjusting the zoom
	 */
	public FwcViewPnl()
	{
		init();

		addListener();
	}
	
	/**
	 * Add all the listeners needed for this component
	 */
	private void addListener()
	{
		slider.addChangeListener(new ChangeListener()
		{
			@Override
			public void stateChanged(ChangeEvent e)
			{
				zoom = slider.getValue() / 100d;
				visual.notifyZoomChanged();
			}
		});
		
		MouseAdapter ma = new MouseAdapter()
		{
			@Override
			public void mouseWheelMoved(MouseWheelEvent e)
			{
				slider.setValue(slider.getValue() - e.getWheelRotation() * ZOOM_PER_WHEEL_TICK);
			}
		};
		
		addMouseWheelListener(ma);
		visual.addMouseWheelListener(ma);
	}

	/**
	 * initialize this component
	 */
	private void init()
	{
		slider = new JSlider(JSlider.VERTICAL, 0, 1000, 100);
		slider.setMajorTickSpacing(100);
		slider.setMinorTickSpacing(10);

		slider.setPaintLabels(true);
		slider.setPaintTicks(true);
		slider.createStandardLabels(1, 90);
		slider.setValue(100);
		
		zoom = 1d;

		visual = new FcwView(this);

		setLayout(new BorderLayout());
		add(slider, BorderLayout.EAST);
		add(visual, BorderLayout.CENTER);
	}

	/**
	 * Get the factor to zoom at.
	 * 
	 * @return The zoom-factor
	 */
	public double getZoom()
	{
		return zoom;
	}
}
