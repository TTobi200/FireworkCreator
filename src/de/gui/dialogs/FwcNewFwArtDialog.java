package de.gui.dialogs;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import de.gui.comp.FwcFwPropPnl;

public class FwcNewFwArtDialog extends FwcBaseDialog
{
	private static final long serialVersionUID = 1L;

	public FwcNewFwArtDialog(JFrame owner, String title)
	{
		super(owner, title);
		pnlData.setLayout(null);
		init(owner);
	}
	
	private void init(JFrame owner)
	{
		add(FwcFwPropPnl.getInstance(), BorderLayout.CENTER);
		pack();
		setLocationRelativeTo(owner);
	}
}