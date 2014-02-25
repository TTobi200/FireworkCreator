package de.gui.comp.view;

import java.util.Collection;
import java.util.LinkedList;

import de.gui.comp.view.draw.FwcDrawableComponent;

/**
 * A special partition of a dimensions as a tree with exactly 4 leafs.
 * 
 * @author ddd
 * @version 0.1
 */
public class FwcQuadTree extends Fwc2dPartitioner
{
	/** The partition on the upper left side */
	private Fwc2dPartitioner	upperLeft;
	/** The partition on the upper right side */
	private Fwc2dPartitioner	upperRight;
	/** The partition on the lower left side */
	private Fwc2dPartitioner	lowerLeft;
	/** The partition on the lower right side */
	private Fwc2dPartitioner	lowerRight;

	/**
	 * Create a quadtree-partition of the given dimension with the given options.
	 * 
	 * @param dim
	 *            The dimensions to be partitioned
	 * @param option
	 *            The option for the partitioning
	 * @param size
	 *            The option-dependent size of the partition
	 */
	public FwcQuadTree(Dimensions dim, int option, int size)
	{
		super(dim);

		Dimensions temp = new Dimensions();
		temp.setWidth(dim.getWidth() / 2);
		temp.setHeight(dim.getHeight() / 2);
		temp.setX(dim.getX() + temp.getWidth());
		temp.setY(dim.getY() + temp.getHeight());

		upperLeft = partition(
			new Dimensions(dim.getX(), dim.getY(), temp.getWidth(), temp.getHeight()), option, size);
		upperRight = partition(
			new Dimensions(temp.getX(), dim.getY(), temp.getWidth(), temp.getHeight()), option,
			size);
		lowerLeft = partition(
			new Dimensions(dim.getX(), temp.getY(), temp.getWidth(), temp.getHeight()), option,
			size);
		lowerRight = partition(temp, option, size);
	}

	@Override
	public boolean addDrawable(FwcDrawableComponent drawable)
	{
		if (super.addDrawable(drawable))
		{
			upperLeft.addDrawable(drawable);
			upperRight.addDrawable(drawable);
			lowerLeft.addDrawable(drawable);
			lowerRight.addDrawable(drawable);

			return true;
		}

		return false;
	}

	@Override
	public boolean removeDrawable(FwcDrawableComponent drawable)
	{
		if (super.removeDrawable(drawable))
		{
			upperLeft.removeDrawable(drawable);
			upperRight.removeDrawable(drawable);
			lowerLeft.removeDrawable(drawable);
			lowerRight.removeDrawable(drawable);
			return true;
		}

		return false;
	}

	@Override
	public FwcDrawableComponent getDrawable(int x, int y)
	{
		if (contains(x, y))
		{
			if (upperLeft.contains(x, y))
			{
				return upperLeft.getDrawable(x, y);
			}
			else if (upperRight.contains(x, y))
			{
				return upperRight.getDrawable(x, y);
			}
			else if (lowerLeft.contains(x, y))
			{
				return lowerLeft.getDrawable(x, y);
			}
			else
			{
				return lowerRight.getDrawable(x, y);
			}
		}

		return null;
	}

	@Override
	public Collection<FwcDrawableComponent> getDrawables(Dimensions dim)
	{
		Collection<FwcDrawableComponent> coll = new LinkedList<>();

		if (intersects(dim))
		{
			coll.addAll(upperLeft.getDrawables(dim));

			for(FwcDrawableComponent c : upperRight.getDrawables(dim))
			{
				if (!coll.contains(c))
				{
					coll.add(c);
				}
			}
			for(FwcDrawableComponent c : lowerLeft.getDrawables(dim))
			{
				if (!coll.contains(c))
				{
					coll.add(c);
				}
			}
			for(FwcDrawableComponent c : lowerRight.getDrawables(dim))
			{
				if (!coll.contains(c))
				{
					coll.add(c);
				}
			}
		}

		return coll;
	}
}
