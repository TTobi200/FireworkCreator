package de.fw;

public class FwcFwBombPipes extends FwcFwArticle
{
	private static final long serialVersionUID = 1L;
	
	private int effectHeight;
	private double caliber;

	public FwcFwBombPipes(String name, String bamNr, String producer, String dim,
					String desc, int nem, int dangerClass, double weight, double price,
					int effectHeight, double caliber)
	{
		super(name, bamNr, producer, dim, desc, nem, dangerClass, weight, price);
		this.effectHeight = effectHeight;
		this.caliber = caliber;
	}
	
	protected int getEffectHeight()
	{
		return effectHeight;
	}

	protected void setEffectHeight(int effectHeight)
	{
		this.effectHeight = effectHeight;
	}
	
	protected double getCaliber()
	{
		return caliber;
	}
	
	protected void setCaliber(double caliber)
	{
		this.caliber = caliber;
	}
}