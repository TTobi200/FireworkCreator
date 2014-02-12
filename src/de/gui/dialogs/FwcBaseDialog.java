/*
 * $Header$
 *
 * $Log$
 * Copyright © 2014 Unitechnik AG. All Rights Reserved.
 */
package de.gui.dialogs;

import javax.swing.JDialog;
import javax.swing.JFrame;

public abstract class FwcBaseDialog extends JDialog
{
	private static final long serialVersionUID = 1L;
	
	public FwcBaseDialog(JFrame owner, String title, boolean modal)
	{
		super(owner, title, modal);
		init();
	}

	protected abstract void init();
}