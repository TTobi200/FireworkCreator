package de.gui.comp;

import javax.swing.tree.DefaultMutableTreeNode;

import de.fw.FwcFwArticle;

public class FwcArtNode extends DefaultMutableTreeNode
{
	private static final long serialVersionUID = 1L;
	private FwcFwArticle article;
	
	public FwcArtNode(String name, FwcFwArticle article)
	{
		super(name);
		this.article = article;
	}
	
	public FwcFwArticle getArticle()
	{
		return article;
	}
}