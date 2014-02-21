package de.fw;

public class FwcFwBombPipes extends FwcFwArticle
{
	private static final long serialVersionUID = 1L;
	
	private int effectHeight;
	private double caliber;

	public FwcFwBombPipes(String name,String imgPath, String bamNr, String producer, String dim,
					String desc, int nem, int dangerClass, double weight, double price,
					int effectHeight, double caliber)
	{
		super(name, imgPath, bamNr, producer, dim, desc, nem, dangerClass, weight, price);
		this.effectHeight = effectHeight;
		this.caliber = caliber;
	}
	
	public int getEffectHeight()
	{
		return effectHeight;
	}

	public void setEffectHeight(int effectHeight)
	{
		this.effectHeight = effectHeight;
	}
	
	public double getCaliber()
	{
		return caliber;
	}
	
	public void setCaliber(double caliber)
	{
		this.caliber = caliber;
	}
}