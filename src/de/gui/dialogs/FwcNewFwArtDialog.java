package de.gui.dialogs;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import de.gui.comp.FwcBatteryPropPnl;

public class FwcNewFwArtDialog extends FwcBaseDialog
{
	private static final long serialVersionUID = 1L;
	private FwcBatteryPropPnl batPnl;

	public FwcNewFwArtDialog(JFrame owner, String title)
	{
		super(owner, title);
		pnlData.setLayout(null);
		init(owner);
	}
	
	private void init(JFrame owner)
	{
		batPnl = new FwcBatteryPropPnl();
		add(batPnl, BorderLayout.CENTER);
		pack();
		setLocationRelativeTo(owner);
	}
	
	public FwcBatteryPropPnl getDataPnl()
	{
		return batPnl;
	}
}