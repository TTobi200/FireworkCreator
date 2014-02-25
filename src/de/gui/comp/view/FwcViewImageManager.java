package de.gui.comp.view;

import java.awt.Graphics;
import java.util.Collection;

import de.gui.comp.view.draw.FwcDrawableComponent;

public class FwcViewImageManager
{
	private Fwc2dPartitioner partition;
	
	/**
	 * Create a new manager for a field of the given dimensions
	 * 
	 * @param size the dimensions of the image to be managed
	 */
	public FwcViewImageManager(Dimensions size)
	{
//		partition = Fwc2dPartitioner.partition(size, Fwc2dPartitioner.PARTITION_BY_SIZE, 1000);
		partition = Fwc2dPartitioner.partition(size, Fwc2dPartitioner.PARTITION_BY_DEPTH, 1);
	}

	/**
	 * Add a new Drawable to be managed by this manager if not present
	 * 
	 * @param drawable
	 *            The drawable to be added to this manager
	 */
	public void addDrawable(FwcDrawableComponent drawable)
	{
		partition.addDrawable(drawable);
	}

	/**
	 * Get the drawable managed by this manager, which is positioned at the front at the given point
	 * 
	 * @param x The x-coordinate to be checked
	 * @param y The y-coordinate to be checked
	 * @return The drawable 'picked' or null
	 */
	public FwcDrawableComponent pickDrawable(int x, int y)
	{
		return partition.getDrawable(x, y);
	}
	
	/**
	 * Check all drawables managed by this manager, which are positioned within the given dimensions
	 * 
	 * @param dim The rect to be checked
	 * @return All Drawables picked
	 */
	public FwcDrawableComponent[] pickDrawables(Dimensions dim)
	{
		Collection<FwcDrawableComponent> coll = partition.getDrawables(dim); 
		return coll.toArray(new FwcDrawableComponent[coll.size()]);
	}

	/**
	 * Draw all the drawables visible in the given Dimensions on the given Graphics
	 * 
	 * @param g
	 *            The graphics to draw on
	 * @param dim
	 *            The dimension showing the visible screen
	 */
	public void drawOn(Graphics g, Dimensions dim)
	{
		for(FwcDrawableComponent c : partition.getDrawables(dim))
		{
			c.draw(g);
		}
	}
}
