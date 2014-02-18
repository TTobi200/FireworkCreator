package de.gui.comp.view.draw;

import java.awt.Graphics;

import de.gui.comp.view.Dimensions;

/**
 * An interface for all kinds of objects, which would like to be drawable on a {@link FwcView}
 * 
 * @author ddd
 * @version 0.1
 */
public interface FwcDrawableComponent
{
	/**
	 * Draw this drawable on the given {@link Graphics}
	 * 
	 * @param g The {@link Graphics} to draw on
	 */
	public void draw(Graphics g);
	
	/**
	 * Get the {@link Dimensions} this drawable will be drawn in
	 * 
	 * @return The extends of this drawable
	 */
	public Dimensions getDimensions();
}
