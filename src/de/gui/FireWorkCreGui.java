/*
 * $Header$
 *
 * $Log$
 * Copyright © 2014 Unitechnik AG. All Rights Reserved.
 */
package de.gui;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

import de.gui.comp.FwcMenuBar;
import de.gui.comp.FwcToolsPnl;
import de.gui.comp.FwcValuePnl;
import de.gui.comp.FwcViewPnl;

public class FireWorkCreGui
{
	private static final String VERSION = "V1.0";
	private static String STR_FWC_TITLE = "Firework Creator" + VERSION;

	public FireWorkCreGui()
	{
		loadLAF();
		init();
	}

	private void loadLAF()
	{
		try
		{
			for(LookAndFeelInfo info : UIManager.getInstalledLookAndFeels())
			{
				if("Nimbus".equals(info.getName()))
				{
					UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		}
		catch(Exception e)
		{}
	}

	private void init()
	{
		JFrame mainframe = new JFrame(STR_FWC_TITLE);
		JMenuBar menuBar = new FwcMenuBar();
		JSplitPane splitMain = new JSplitPane();
		JSplitPane splitSub = new JSplitPane();
		JPanel pnlTools = new FwcToolsPnl();
		JPanel pnlViewF = new FwcViewPnl();
		JPanel pnlValues = new FwcValuePnl();

		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		mainframe.setLayout(gridBagLayout);
		
		GridBagConstraints gbc_splitMain = new GridBagConstraints();
		gbc_splitMain.fill = GridBagConstraints.BOTH;
		gbc_splitMain.gridx = 0;
		gbc_splitMain.gridy = 0;
		
		splitMain.setRightComponent(splitSub);
		splitSub.setRightComponent(pnlValues);
		splitSub.setLeftComponent(pnlViewF);
		splitMain.setLeftComponent(pnlTools);
		splitSub.setOrientation(JSplitPane.VERTICAL_SPLIT);
		splitSub.setOneTouchExpandable(true);
		splitMain.setOneTouchExpandable(true);
		
		mainframe.setJMenuBar(menuBar);
		mainframe.add(splitMain, gbc_splitMain);

		mainframe.setVisible(true);
		mainframe.setSize(500, 400);
		mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}