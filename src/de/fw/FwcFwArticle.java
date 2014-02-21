package de.fw;

import java.io.Serializable;

public class FwcFwArticle implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	protected static final String DEF_BAM_NR = "Keine BAM NR.";
	protected static final String DEF_PRODUCER = "Kein Hersteller";
	protected static final String DEF_DIM = "Keine Abmessungen";
	protected static final String DEF_DESC = "Keine Beschreibung";
	protected static final String DEF_PATH = "Kein Bildpfad verfügbar";
	protected static final int DEF_NEM = 0;
	protected static final int DEF_DANGER_CLASS = -1;
	protected static final double DEF_WEIGHT = 0;
	protected static final double DEF_PRICE = 0;

	
	private String name;
	private String bamNr;
	private String producer;
	private String dim;
	private String desc;
	private int nem;
	private int dangerClass;
	private double weight;
	private double price;

	private String imgPath;
		
	public FwcFwArticle(String name, String imgPath, String bamNr, String producer,String dim, 
					String desc, int nem, int dangerClass, double weight, double price)
	{
		this.name = name;
		this.bamNr = bamNr;
		this.producer = producer;
		this.dim = dim;
		this.nem = nem;
		this.desc = desc;
		this.dangerClass = dangerClass;
		this.weight = weight;
		this.price = price;
		this.imgPath = imgPath;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getBamNr()
	{
		return bamNr;
	}

	public void setBamNr(String bamNr)
	{
		this.bamNr = bamNr;
	}

	public String getProducer()
	{
		return producer;
	}

	public void setProducer(String producer)
	{
		this.producer = producer;
	}

	public String getDim()
	{
		return dim;
	}

	public void setDim(String dim)
	{
		this.dim = dim;
	}

	public int getNem()
	{
		return nem;
	}

	public void setNem(int nem)
	{
		this.nem = nem;
	}

	public int getDangerClass()
	{
		return dangerClass;
	}

	public void setDangerClass(int dangerClass)
	{
		this.dangerClass = dangerClass;
	}

	public double getWeight()
	{
		return weight;
	}

	public void setWeight(double weight)
	{
		this.weight = weight;
	}

	public double getPrice()
	{
		return price;
	}

	public void setPrice(double price)
	{
		this.price = price;
	}

	public String getDesc()
	{
		return desc;
	}

	public void setDesc(String desc)
	{
		this.desc = desc;
	}

	public String getImgPath()
	{
		return imgPath;
	}

	public void setPath(String path)
	{
		this.imgPath = path;
	}
}