package de.gui.comp.view;

/**
 * A Dimensions symbolizes a Rectangle which provides additional functions as their are:
 * <ul>
 * <li> TODO describe functions
 * </ul>
 * 
 * @author ddd
 * @version 0.2
 */
public class Dimensions
{
	/** x-position of this {@link Dimensions} */
	private int	x;
	/** y-position of this {@link Dimensions} */
	private int	y;
	/** width of this {@link Dimensions} */
	private int	width;
	/** height of this {@link Dimensions} */
	private int	height;
	
	// TODO create and add an observer

	public Dimensions()
	{
		// if (observer == null)
		// {
		// throw new NullPointerException("observer of a Dimensions cannot be null.");
		// }
		// this.observer = observer;
		
		this(0, 0, 0, 0);
	}
	
	public Dimensions(int x, int y, int width, int height)
	{
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	/**
	 * @return The x-position of this {@link Dimensions}
	 */
	public int getX()
	{
		return x;
	}

	/**
	 * @param x
	 *            The new x-position for this {@link Dimensions}
	 */
	public void setX(int x)
	{
		this.x = x;
	}

	/**
	 * @return the y-position of this {@link Dimensions}
	 */
	public int getY()
	{
		return y;
	}

	/**
	 * @param y
	 *            the new y-position for this {@link Dimensions}
	 */
	public void setY(int y)
	{
		this.y = y;
	}

	/**
	 * @return the width of this {@link Dimensions}
	 */
	public int getWidth()
	{
		return width;
	}

	/**
	 * @param width
	 *            the new width for this {@link Dimensions}
	 */
	public void setWidth(int width)
	{
		this.width = width;
	}

	/**
	 * @return the height of this {@link Dimensions}
	 */
	public int getHeight()
	{
		return height;
	}

	/**
	 * @param height
	 *            the new height for this {@link Dimensions}
	 */
	public void setHeight(int height)
	{
		this.height = height;
	}

	/**
	 * @return The maximum x-position contained in this {@link Dimensions}
	 */
	public int getMaxX()
	{
		return x + width;
	}

	/**
	 * @return The maximum y-position contained in this {@link Dimensions}
	 */
	public int getMaxY()
	{
		return y + height;
	}

	/**
	 * Move this {@link Dimensions}' position by the given one
	 * 
	 * @param x
	 *            The way to move along the x-axis
	 * @param y
	 *            The way to move along the y-axis
	 */
	public void translate(int x, int y)
	{
		setX(this.x + x);
		setY(this.y + y);
	}

	/**
	 * Resize this {@link Dimensions} by adding the given amound of width and height.
	 * 
	 * @param width
	 *            the amount to grow along the x-axis
	 * @param height
	 *            the amount to grow along the y-axis
	 */
	public void addSize(int width, int height)
	{
		setWidth(this.width + width);
		setHeight(this.height + height);
	}

	/**
	 * Check whether this and the given {@link Dimensions} are intersecting on any part.
	 * 
	 * @param d
	 *            The {@link Dimensions} to check this one against
	 * @return true if the two {@link Dimensions} intersect at any part
	 */
	public boolean intersects(Dimensions d)
	{
		return d.getMaxX() > x && d.getMaxY() > y && d.x < getMaxX() && d.y < getMaxY();
	}

	/**
	 * Check whether the given {@link Dimensions} lies completely within this one.
	 * 
	 * @param d
	 *            The {@link Dimensions} to be checked
	 * @return true if the given {@link Dimensions} lies completely within this one.
	 */
	public boolean contains(Dimensions d)
	{
		return x < d.x && y < d.y && getMaxX() > d.getMaxX() && getMaxY() > d.getMaxY();
	}
	
	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder(getClass().getSimpleName());
		
		return sb
				.append(" [")
				.append("x=")
				.append(x)
				.append(", y=")
				.append(y)
				.append(", width=")
				.append(width)
				.append(", height=")
				.append(height)
				.append("]")
				.toString();
				
	}

	public boolean contains(int x2, int y2)
	{
		return contains(new Dimensions(x2, y2, 0, 0));
	}
}