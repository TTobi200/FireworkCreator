package de.gui.comp.view.draw;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import de.fw.FwcFwArticle;
import de.gui.comp.view.Dimensions;

/**
 * TODO add comment
 * 
 * @author ddd
 * @version 0.1
 */
public class FwcDrawableArticle implements FwcDrawableComponent
{
	/** The article shown by this comp */
	private FwcFwArticle	article;
	/** The image to visualize this comp */
	private BufferedImage	img;
	/** The {@link Dimensions} of this component */
	private Dimensions		dim;

	/**
	 * Create a drawablearticle symbolizing the given article with the given image.
	 * 
	 * @param article
	 *            The article to be shown
	 * @param img
	 *            The image to display
	 * @throws NullPointerException
	 *             if the image is null
	 */
	public FwcDrawableArticle(FwcFwArticle article, BufferedImage img) throws NullPointerException
	{
		this(article, img, null);
	}

	/**
	 * Create a DrawableImage symbolizing the given article. The article will be shown with the
	 * given image within the given dimensions
	 * 
	 * @param article The article to be shown
	 * @param img The image to be displayed
	 * @param dim The dim the drawable should have
	 * @throws NullPointerException if the image is null
	 */
	public FwcDrawableArticle(FwcFwArticle article, BufferedImage img, Dimensions dim)
			throws NullPointerException
	{
		if (img == null)
		{
			throw new NullPointerException("The image of a " + getClass().getSimpleName()
					+ " cannot be null");
		}
		this.article = article;
		this.img = img;
		this.dim = dim;

		if (this.dim == null)
		{
			this.dim = new Dimensions(0, 0, img.getWidth(), img.getHeight());
		}
	}

	@Override
	public void draw(Graphics g)
	{
		g.drawImage(img, dim.getX(), dim.getY(), dim.getWidth(), dim.getHeight(), null);
	}

	@Override
	public Dimensions getDimensions()
	{
		return dim;
	}

	/**
	 * Get the article shown by this drawable.
	 * 
	 * @return The article shown by this drawable
	 */
	public FwcFwArticle getArticle()
	{
		return article;
	}
}
