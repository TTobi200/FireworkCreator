package de.fw;

public class FwcFwBattery extends FwcFwBombPipes 
{
	private static final long serialVersionUID = 1L;

	private double burnLen;

	public FwcFwBattery(String name, String imgPath, String bamNr, String producer, String dim, 
					String desc, int nem, int dangerClass, double weight, double price,
					int effectHeight, double caliber, double burnLen)
	{
		super(name,imgPath, bamNr, producer, dim, desc, nem, dangerClass, weight, price, effectHeight, caliber);
		this.burnLen = burnLen;
	}

	public double getBurnLen()
	{
		return burnLen;
	}

	public void setBurnLen(double burnLen)
	{
		this.burnLen = burnLen;
	}
}