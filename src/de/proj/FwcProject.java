/*
 * $Header$
 *
 * $Log$
 * Copyright © 2014 Unitechnik AG. All Rights Reserved.
 */
package de.proj;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

import de.fw.FwcFwArticle;

public class FwcProject implements Serializable
{
	/** Default serialVersionUID */
	private static final long serialVersionUID = 1L;
	
	private static final String DEF_PRJ_EXT = ".fwcP";
	private String name;
	private String creDate;
	private String lastEditDate;
	private ArrayList<FwcFwArticle> article;

	/**
	 * Constructor to create a new {@link FwcProject}
	 * with all necessary data.
	 * @param name = the exact name of the project
	 * @param creDate = the creation date of the project
	 * @param editDate = the last editDate of the project
	 * @param article = the different articles in this project
	 */
	public FwcProject(String name, String creDate, String editDate,
					FwcFwArticle... article)
	{
		this.name = name;
		this.creDate = creDate;
		this.lastEditDate = editDate;
		
		for(int i = 0; i < article.length; i++)
		{
			this.article.add(article[i]);
		}
	}
	
	/**
	 * Method to save the this project on HDD.
	 * @param dir = the project directory
	 * @throws Exception when project saving failed
	 */
	public void saveProject(File dir) throws Exception
	{
		try(ObjectOutputStream objectOutput = new ObjectOutputStream(
			new FileOutputStream(dir.getAbsolutePath() + File.separator 
				+ getName() + DEF_PRJ_EXT)))
		{
			objectOutput.writeObject(this);
		}
	}
	
	/**
	 * Method to load project from HDD.
	 * @param project = the project to load
	 * @return the loaded {@link FwcProject}
	 * @throws Exception when project couldn't been load
	 */
	public static FwcProject loadProject(File project) throws Exception
	{
		FwcProject fwcP = null;
		try(ObjectInputStream objectInput = new ObjectInputStream(new FileInputStream(project)))
		{
			fwcP = (FwcProject)objectInput.readObject();
		}
		
		return fwcP;
	}

	/**
	 * Method to get the exact name of this project.
	 * @return = the exact name of this project
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Method to set the exact name of this project.
	 * @param name = the exact name of this project
	 */
	public void setName(String name)
	{
		this.name = name;
	}

	/**
	 * Method to get the creation date of this project.
	 * @return the creation date of this project
	 */
	public String getCreDate()
	{
		return creDate;
	}

	/**
	 * Method to get the creation date of this project.
	 * @return the last edit date of this project
	 */
	public String getLastEditDate()
	{
		return lastEditDate;
	}

	/**
	 * Method to set last edit date of this project.
	 * @param lastEditDate = the last edit date of this project
	 */
	public void setLastEditDate(String lastEditDate)
	{
		this.lastEditDate = lastEditDate;
	}

	/**
	 * Method to get all {@link FwcFwArticle} in this project.
	 * @return all {@link FwcFwArticle} in this project
	 */
	public FwcFwArticle[] getArticle()
	{
		return (FwcFwArticle[])article.toArray();
	}
	
	/**
	 * Method to add new articles to this project.
	 * @param article = the article(s) to add
	 */
	public void addArticle(FwcFwArticle... article)
	{
		for(int i = 0; i < article.length; i++)
		{
			this.article.add(article[i]);
		}
	}
}