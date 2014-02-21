package de.fw;

public class FwcFwIlluminate extends FwcFwArticle
{
	private static final long serialVersionUID = 1L;

	public FwcFwIlluminate(String name,String imgPath, String bamNr, String producer,
							String dim, String desc, double price)
	{
		super(name, imgPath, bamNr, producer, dim, desc, DEF_NEM, DEF_DANGER_CLASS, DEF_WEIGHT, price);
		// Currently unused
	}
}