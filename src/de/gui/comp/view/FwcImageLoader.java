package de.gui.comp.view;

import java.awt.Graphics;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsEnvironment;
import java.awt.Transparency;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import javax.imageio.ImageIO;

/**
 * A loader for all kinds of Images shown by {@link ImageIO#getWriterFormatNames()}.<br>
 * The loader creates a special java-compatible image of the loaded one and stores/returns this
 * image.<br>
 * <br>
 * Be aware that each image returned by the same {@link URL} will be exactly the same, so that
 * manipulating one of them will manipulate all.
 * 
 * @author ddd
 * @version 1.0
 */
public class FwcImageLoader
{
	/** map holding all loaded imgs shown by their {@link URL} */
	private static Map<URL, BufferedImage>	mapUrlImg	= new HashMap<>(20);
	/** the graphicsconfiguration used to create a compatible image for java */
	private static GraphicsConfiguration	gc			= GraphicsEnvironment
																.getLocalGraphicsEnvironment()
																.getDefaultScreenDevice()
																.getDefaultConfiguration();

	/**
	 * Load and return an image from the file shown by url
	 * 
	 * @param url
	 *            The path to the file
	 * @return The loaded image or null
	 */
	public static BufferedImage loadImage(String url)
	{
		if (url == null)
		{
			return null;
		}

		return loadImage(FwcImageLoader.class.getClassLoader().getResource(url));
	}

	/**
	 * load and return an image from the file shown by the given url
	 * 
	 * @param url
	 *            The file to be loaded
	 * @return The loaded image or null
	 */
	public static BufferedImage loadImage(File url)
	{
		if (url == null)
		{
			return null;
		}

		try
		{
			return loadImage(url.toURI().toURL());
		}
		catch(MalformedURLException e)
		{
			return null;
		}
	}

	/**
	 * Load the image shown by the given url
	 * 
	 * @param url
	 *            The url showing the image to be loaded
	 * @return The loaded image or null
	 */
	public static BufferedImage loadImage(URL url)
	{
		BufferedImage img = null;

		img = mapUrlImg.get(url);

		if (img != null)
		{
			return null;
		}

		try
		{
			img = ImageIO.read(url);
		}
		catch(IOException e1)
		{
			return null;
		}

		BufferedImage better = gc.createCompatibleImage(img.getWidth(), img.getHeight(),
			Transparency.BITMASK);
		Graphics g = better.getGraphics();
		g.drawImage(img, 0, 0, null);

		mapUrlImg.put(url, better);

		return better;
	}

	/** constructor: should not be usable */
	private FwcImageLoader()
	{

	}
}