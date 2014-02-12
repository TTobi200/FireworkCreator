/*
 * $Header$
 *
 * $Log$
 * Copyright © 2014 Unitechnik AG. All Rights Reserved.
 */
package de.gui.comp;

import javax.swing.JMenu;
import javax.swing.JMenuBar;

public class FwcMenuBar extends JMenuBar
{
	private static final long serialVersionUID = 1L;
	private static final String STR_FILE = "Datei";
	private static final String STR_EDIT = "Bearbeiten";
	private static final String STR_PROP = "Einstellungen";
	
	public FwcMenuBar()
	{
		init();
	}

	private void init()
	{
		JMenu itmFile = new JMenu(STR_FILE);
		JMenu itmEdit = new JMenu(STR_EDIT);
		JMenu itmProp = new JMenu(STR_PROP);
		
		this.add(itmFile);
		this.add(itmEdit);
		this.add(itmProp);
	}
}