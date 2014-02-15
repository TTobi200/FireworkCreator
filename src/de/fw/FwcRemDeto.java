package de.fw;

import java.util.HashMap;
import java.util.Map;

public class FwcRemDeto
{
	private Map<Integer, FwcFwArticle> articles;
	private String name;
	
	public FwcRemDeto(String name, int slots)
	{
		this.name = name;
		articles = new HashMap<>();
	}
	
	public void addFwArticle(FwcFwArticle... art)
	{
		for(int i = articles.size(); i < art.length; i++)
		{
			articles.put(i, art[i]);
		}
	}
	
	public FwcFwArticle getFwArticle(int slot)
	{
		return articles.get(slot);
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
}