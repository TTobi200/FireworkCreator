/*
 * $Header$
 *
 * $Log$
 * Copyright © 2014 Unitechnik AG. All Rights Reserved.
 */
package de.gui.comp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import de.gui.FwcGui;
import de.gui.dialogs.FwcBaseDialog;
import de.gui.dialogs.FwcNewProjDialog;

public class FwcMenuBar extends JMenuBar implements ActionListener
{
	private static final long serialVersionUID = 1L;
	
	private static final String STR_FILE = "Datei";
	private static final String STR_EDIT = "Bearbeiten";
	private static final String STR_PROP = "Einstellungen";

	private static final String STR_NEW_PRJ = "Neues Projekt";
	private static final String STR_OPEN_PRJ = "Projekt öffnen";
	private static final String STR_SAVE_PRJ = "Projekt speichern";
	private static final String STR_CLOSE = "Beenden";

	private static final String TITLE_NEW_PROJ = "Neues Projekt";

	private JMenuItem mINewPrj;

	private FwcGui fwcGui;

	private JMenuItem mIOpenPrj;

	private JMenuItem mISavePrj;

	private JMenuItem mIClose;

	public FwcMenuBar(FwcGui fwcGui)
	{
		this.fwcGui = fwcGui;
		init();
		addListener();
	}

	private void init()
	{
		JMenu mFile = new JMenu(STR_FILE);
		JMenu mEdit = new JMenu(STR_EDIT);
		JMenu mProp = new JMenu(STR_PROP);
		
		mINewPrj = new JMenuItem(STR_NEW_PRJ);
		mIOpenPrj = new JMenuItem(STR_OPEN_PRJ);
		mISavePrj = new JMenuItem(STR_SAVE_PRJ);
		mIClose = new JMenuItem(STR_CLOSE);
		
		mFile.add(mINewPrj);
		mFile.add(mIOpenPrj);
		mFile.add(mISavePrj);
		mFile.add(mIClose);
		
		this.add(mFile);
		this.add(mEdit);
		this.add(mProp);
	}
	

	private void addListener()
	{
		mINewPrj.addActionListener(this);
		mIOpenPrj.addActionListener(this);
		mISavePrj.addActionListener(this);
		mIClose.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		String actionCmd = ((JMenuItem)e.getSource()).getActionCommand();
		
		switch(actionCmd)
		{
			case STR_NEW_PRJ:
				FwcNewProjDialog newPrj = new FwcNewProjDialog(fwcGui.getMainFrm(), TITLE_NEW_PROJ);
				if(newPrj.showIt() == FwcBaseDialog.APPROVE)
					fwcGui.startPrj(newPrj.getPrjName());
				break;
			case STR_SAVE_PRJ:
				fwcGui.savePrj();
				break;
		}
	}
}