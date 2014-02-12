/*
 * $Header$
 *
 * $Log$
 * Copyright © 2014 Unitechnik AG. All Rights Reserved.
 */
package de.gui.comp;

import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;

public class FwcViewPnl extends JPanel
{
	private static final long serialVersionUID = 1L;

	public FwcViewPnl()
	{
		init();
		addListener();
	}
	
	private void addListener()
	{
	     this.addMouseListener(new MouseAdapter() 
	     {
	         public void mousePressed(MouseEvent e) 
	         {
	        	 
	         }
	         
			public void mouseReleased(MouseEvent e)
			{
				
			}
	     });
	}

	private void init()
	{
		
	}

	@Override
	public void paint(Graphics g)
	{
		super.paint(g);
	}
}