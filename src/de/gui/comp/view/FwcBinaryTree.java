package de.gui.comp.view;

import java.util.Collection;
import java.util.LinkedList;

import de.gui.comp.view.draw.FwcDrawableComponent;

/**
 * Create a special partition which consists of exactly 2 equally sized part.
 * 
 * @author ddd
 * @version 0.
 */
public class FwcBinaryTree extends Fwc2dPartitioner
{
	/** The partition on the upper/left side */
	private Fwc2dPartitioner	leftSide;
	/** The partition on the lower/right side */
	private Fwc2dPartitioner	rightSide;

	/**
	 * Create binary-tree-partition of the given dimension with the given parameters.
	 * 
	 * @param dim
	 *            The dimensions to be partitioned
	 * @param option
	 *            The option for partitioning
	 * @param size
	 *            The option-dependent size
	 */
	protected FwcBinaryTree(Dimensions dim, int option, int size)
	{
		super(dim);

		Dimensions temp = new Dimensions();
		temp.setWidth(dim.getWidth() / 2);
		temp.setHeight(dim.getHeight() / 2);
		temp.setX(dim.getX() + temp.getWidth());
		temp.setY(dim.getY() + temp.getHeight());

		if (dim.getWidth() > dim.getHeight())
		{
			leftSide = partition(
				new Dimensions(dim.getX(), dim.getY(), temp.getWidth(), dim.getHeight()), option,
				size);
			rightSide = partition(
				new Dimensions(temp.getX(), dim.getY(), temp.getWidth(), dim.getHeight()), option,
				size);
		}
		else
		{
			leftSide = partition(
				new Dimensions(dim.getX(), dim.getY(), dim.getWidth(), temp.getHeight()), option,
				size);
			rightSide = partition(
				new Dimensions(dim.getX(), temp.getY(), dim.getWidth(), temp.getHeight()), option,
				size);
		}
	}

	@Override
	public boolean addDrawable(FwcDrawableComponent drawable)
	{
		if (super.addDrawable(drawable))
		{
			leftSide.addDrawable(drawable);
			rightSide.addDrawable(drawable);

			return true;
		}

		return false;
	}

	@Override
	public boolean removeDrawable(FwcDrawableComponent drawable)
	{
		if (super.removeDrawable(drawable))
		{
			leftSide.removeDrawable(drawable);
			rightSide.removeDrawable(drawable);

			return true;
		}

		return false;
	}

	@Override
	public FwcDrawableComponent getDrawable(int x, int y)
	{
		if (contains(x, y))
		{
			if (leftSide.contains(x, y))
			{
				return leftSide.getDrawable(x, y);
			}
			else
			{
				return rightSide.getDrawable(x, y);
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
			coll.addAll(leftSide.getDrawables(dim));

			for(FwcDrawableComponent c : rightSide.getDrawables(dim))
			{
				if (!coll.contains(coll))
				{
					coll.add(c);
				}
			}
		}

		return coll;
	}
}
