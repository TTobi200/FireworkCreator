/*
 * $Header$
 *
 * $Log$
 * Copyright © 2014 Unitechnik AG. All Rights Reserved.
 */
package de.gui.dialogs;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FwcBaseDialog extends JDialog implements ActionListener
{
	private static final long serialVersionUID = 1L;
	
	public static final int APPROVE = Integer.MAX_VALUE;
	public static final int CANCEL = Integer.MIN_VALUE;
	
	private JButton btnOk;
	private JButton btnCancel;

	private int res = CANCEL;

	protected JPanel pnlData;
	
	public FwcBaseDialog(JFrame owner, String title)
	{
		super(owner, title, true);
		init(owner);
		addListener();
	}

	private void init(JFrame owner)
	{
		JPanel pnlBtns = new JPanel();
		pnlData = new JPanel();
		btnOk = new JButton("Ok");
		btnCancel = new JButton("Abbrechen");

		pnlBtns.setLayout(new FlowLayout(FlowLayout.RIGHT, 5, 5));

		pnlBtns.add(btnOk);
		pnlBtns.add(btnCancel);
		
		add(pnlBtns, BorderLayout.SOUTH);
		add(pnlData, BorderLayout.CENTER);
	}
	
	private void addListener()
	{
		btnOk.addActionListener(this);
		btnCancel.addActionListener(this);		
	}
	
	public int showIt()
	{
		setVisible(true);
		return res;
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		JButton s = (JButton)e.getSource();
		res  = s == btnOk ? APPROVE : CANCEL;
		dispose();
	}
}