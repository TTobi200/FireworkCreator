package de.fw;

public class FwcFwRocket extends FwcFwArticle
{
	private static final long serialVersionUID = 1L;
	private double flyHeight;
	private String bucketEff;

	public FwcFwRocket(String name, String imgPath,String bamNr, String producer,String dim, 
					String desc, int nem, int dangerClass, double weight, double price,
					double flyHeight, String bucketEff)
	{
		super(name, imgPath, bamNr, producer, dim, desc, nem, dangerClass, weight, price);
		this.setFlyHeight(flyHeight);
		this.setBucketEff(bucketEff);
	}

	public double getFlyHeight()
	{
		return flyHeight;
	}

	public void setFlyHeight(double flyHeight)
	{
		this.flyHeight = flyHeight;
	}

	public String getBucketEff()
	{
		return bucketEff;
	}

	public void setBucketEff(String bucketEff)
	{
		this.bucketEff = bucketEff;
	}
}