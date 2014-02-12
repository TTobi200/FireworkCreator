/*
 * $Header$
 *
 * $Log$
 * Copyright © 2014 Unitechnik AG. All Rights Reserved.
 */
package de.gui.comp;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class FwcMenuBar extends JMenuBar
{
	private static final long serialVersionUID = 1L;
	
	private static final String STR_FILE = "Datei";
	private static final String STR_EDIT = "Bearbeiten";
	private static final String STR_PROP = "Einstellungen";

	private static final String STR_NEW_PRJ = "Neues Projekt";
	private static final String STR_OPEN_PRJ = "Projekt öffnen";
	private static final String STR_SAVE_PRJ = "Projekt speichern";
	private static final String STR_CLOSE = "Beenden";
	
	public FwcMenuBar()
	{
		init();
	}

	private void init()
	{
		JMenu mFile = new JMenu(STR_FILE);
		JMenu mEdit = new JMenu(STR_EDIT);
		JMenu mProp = new JMenu(STR_PROP);
		
		JMenuItem mINewPrj = new JMenuItem(STR_NEW_PRJ);
		JMenuItem mIOpenPrj = new JMenuItem(STR_OPEN_PRJ);
		JMenuItem mISavePrj = new JMenuItem(STR_SAVE_PRJ);
		JMenuItem mIClose = new JMenuItem(STR_CLOSE);
		
		mFile.add(mINewPrj);
		mFile.add(mIOpenPrj);
		mFile.add(mISavePrj);
		mFile.add(mIClose);
		
		this.add(mFile);
		this.add(mEdit);
		this.add(mProp);
	}
}