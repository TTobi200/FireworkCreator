package de.gui.comp.view;

import java.util.Collection;
import java.util.Deque;
import java.util.LinkedList;

import de.gui.comp.view.draw.FwcDrawableComponent;

/**
 * A partitioner is an object which internally splits and saves a dimensions and drawables, visible
 * within this dimensions for easier access on special ones, for example within a point or another
 * given dimensions
 * 
 * @author ddd
 * @version 0.1
 */
public class Fwc2dPartitioner
{
	/** Partitioning until the dimensions-sizes are both less than the given size */
	public static final int					PARTITION_BY_SIZE	= 1;
	/** Partitioning until the given size of levels is reached */
	public static final int					PARTITION_BY_DEPTH	= 2;

	/** The whole dimensions shown by this partition */
	protected Dimensions					dim;

	/** All drawables contained in this partition */
	protected Deque<FwcDrawableComponent>	containedDrawables;

	/**
	 * Create a partition of the given dimension
	 * 
	 * @param dim
	 *            The dimension to be shown by this partition
	 */
	protected Fwc2dPartitioner(Dimensions dim)
	{
		this.dim = dim;
		containedDrawables = new LinkedList<>();
	}

	/**
	 * Partition and the given dimensions and return the result
	 * 
	 * @param dim
	 *            The dimensions to be partitioned
	 * @param option
	 *            The option for partitioning
	 * @param size
	 *            The parameter to be used by the partitioner
	 * @return The partitioned dimension
	 */
	public static Fwc2dPartitioner partition(Dimensions dim, int option, int size)
	{
		if (dim == null)
		{
			throw new NullPointerException();
		}

		if (size < 1)
		{
			return new Fwc2dPartitioner(dim);
		}

		switch(option)
		{
			case PARTITION_BY_DEPTH:
			{
				if (size > 10)
				{
					size = 10;
				}
				return new FwcQuadTree(dim, option, size - 1);
			}
			case PARTITION_BY_SIZE:
			{
				if (size < 100)
				{
					size = 100;
				}

				int temp = 0;
				if (dim.getWidth() > size)
				{
					temp++;
				}
				if (dim.getHeight() > size)
				{
					temp++;
				}

				if (temp == 2)
				{
					return new FwcQuadTree(dim, option, size);
				}
				else if (temp == 1)
				{
					return new FwcBinaryTree(dim, option, size);
				}
				else
				{
					return new Fwc2dPartitioner(dim);
				}
			}
			default:
			{
				return new Fwc2dPartitioner(dim);
			}
		}
	}

	/**
	 * Add the given drawable to this partition if it belongs to it
	 * 
	 * @param drawable
	 *            The drawable to be added
	 * @return Whether the drawable has been added (belongs to this partition)
	 */
	public boolean addDrawable(FwcDrawableComponent drawable)
	{
		if (intersects(drawable.getDimensions()))
		{
			if (!containedDrawables.contains(drawable))
			{
				containedDrawables.addFirst(drawable);
			}

			return true;
		}

		return false;
	}

	/**
	 * Remove the given drawable from this partition if contained
	 * 
	 * @param drawable
	 *            The drawable to be removed
	 * @return true if the drawable was contained and could be removed
	 */
	public boolean removeDrawable(FwcDrawableComponent drawable)
	{
		return containedDrawables.remove(drawable);
	}

	/**
	 * Get the drawable positioned at the given position
	 * 
	 * @param x
	 *            The x-coordinate to be checked
	 * @param y
	 *            The y-coordinate to be checked
	 * @return The found drawable or null
	 */
	public FwcDrawableComponent getDrawable(int x, int y)
	{
		if (contains(x, y))
		{
			for(FwcDrawableComponent c : containedDrawables)
			{
				if (c.getDimensions().contains(x, y))
				{
					return c;
				}
			}
		}

		return null;
	}

	/**
	 * Get all drawables placed in this partition and intersecting the given dimensions
	 * 
	 * @param dim
	 *            The dimensions showing the visible field
	 * @return a collection with all possible visible drawables
	 */
	public Collection<FwcDrawableComponent> getDrawables(Dimensions dim)
	{
		Collection<FwcDrawableComponent> coll = new LinkedList<>();

		for(FwcDrawableComponent c : containedDrawables)
		{
			if (c.getDimensions().intersects(dim))
			{
				coll.add(c);
			}
		}

		return coll;
	}

	public boolean contains(int x, int y)
	{
		return contains(new Dimensions(x, y, 0, 0));
	}

	public boolean contains(Dimensions dim)
	{
		return dim.getX() > this.dim.getX() && dim.getMaxX() < this.dim.getMaxX()
				&& dim.getY() > this.dim.getY() && dim.getMaxY() < this.dim.getMaxY();
	}

	public boolean intersects(Dimensions dim)
	{
		return (dim.getMaxX() > this.dim.getX() && dim.getMaxY() > this.dim.getY()
				&& dim.getX() < this.dim.getMaxX() && dim.getY() < this.dim.getMaxY());
	}
}