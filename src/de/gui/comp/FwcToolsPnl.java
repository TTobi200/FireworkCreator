/*
 * $Header$
 *
 * $Log$
 * Copyright © 2014 Unitechnik AG. All Rights Reserved.
 */
package de.gui.comp;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.JTree;
import javax.swing.JButton;

public class FwcToolsPnl extends JPanel
{
	private static final long serialVersionUID = 1L;
	private static final String IMG_FOL_PATH = "img/";
	private static final String STR_PATH_ICO_REFRESH = IMG_FOL_PATH + "refresh.gif";
	private static final String STR_PATH_ICO_ADD = IMG_FOL_PATH + "add.png";
	private static final String STR_PATH_ICO_REMOVE = IMG_FOL_PATH + "remove.png";
	private static final String STR_PATH_ICO_UP = IMG_FOL_PATH + "up.png";
	private static final String STR_PATH_ICO_DOWN = IMG_FOL_PATH + "down.png";
	
	public FwcToolsPnl()
	{
		ClassLoader l = this.getClass().getClassLoader();
		
		JToolBar toolBarTree = new JToolBar();
		JTree fwcTree = new JTree();
		JButton btnRefresh = new JButton(new ImageIcon(l.getResource(STR_PATH_ICO_REFRESH)));
		JButton btnAdd = new JButton(new ImageIcon(l.getResource(STR_PATH_ICO_ADD)));
		JButton btnRemove = new JButton(new ImageIcon(l.getResource(STR_PATH_ICO_REMOVE)));
		JButton btnUp = new JButton(new ImageIcon(l.getResource(STR_PATH_ICO_UP)));
		JButton btnDown = new JButton(new ImageIcon(l.getResource(STR_PATH_ICO_DOWN)));
		
		setLayout(new BorderLayout(0, 0));
		add(fwcTree, BorderLayout.CENTER);
		add(toolBarTree, BorderLayout.SOUTH);
		
		toolBarTree.add(btnAdd);
		toolBarTree.add(btnRemove);
		toolBarTree.add(btnUp);
		toolBarTree.add(btnDown);
		toolBarTree.add(btnRefresh);
	}
}
