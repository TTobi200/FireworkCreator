/*
 * $Header$
 *
 * $Log$
 * Copyright © 2014 Unitechnik AG. All Rights Reserved.
 */
package de.gui.comp;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class FwcValuePnl extends JPanel
{
	/** Default generated serialVersionUID */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Constructor to create a {@link FwcValuePnl}
	 */
	public FwcValuePnl()
	{
		init();
	}

	/**
	 * Method to initializes the {@link FwcValuePnl}<br>
	 * adds
	 * <li> project tab
	 * <li> properties tab
	 * <li> remote detonator tab
	 */
	private void init()
	{
		setLayout(new BorderLayout(0, 0));

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		
		tabbedPane.addTab("Projekt", null, new FwcPrjPnl(), null);
		tabbedPane.addTab("Eigenschaften", null, new FwcBatteryPropPnl(), null);
		tabbedPane.addTab("Fernzünder", null, new FwcRemDetPnl(), null);
		
		add(tabbedPane);		
	}
}