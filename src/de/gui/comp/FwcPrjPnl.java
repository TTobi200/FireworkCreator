/*
 * $Header$
 *
 * $Log$
 * Copyright © 2014 Unitechnik AG. All Rights Reserved.
 */
package de.gui.comp;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextField;

public class FwcPrjPnl extends JScrollPane
{
	private static final long serialVersionUID = 1L;
	
	private JTextField txtPrjName;
	private JTextField txtPrjCre;
	private JTextField txtPrjLastEdit;
	private JTextField txtPrjArt;
	private JTextField txtPrjNEM;
	private JTextField txtPrjBurnLen;
	private JTextField txtPrjWire;
	private JTextField txtPrjWeight;
	private JTextField txtPrjPrice;
	
	public FwcPrjPnl()
	{
		init();
	}

	private void init()
	{
		JPanel pnlProj = new JPanel();
		JLabel lblPrjName = new JLabel("Projektname:");
		txtPrjName = new JTextField();
		JLabel lblPrjCre = new JLabel("Erstelldatum:");
		txtPrjCre = new JTextField();
		JLabel lblPrjLastEdit = new JLabel("Letzte \u00C4nderung:");
		txtPrjLastEdit = new JTextField();
		JSeparator separator = new JSeparator();
		JLabel lblPrjArt = new JLabel("Ges. Anzahl:");
		txtPrjArt = new JTextField();
		JLabel lblPrjNEM = new JLabel("Ges. NEM:");
		txtPrjNEM = new JTextField();
		JLabel lblPrjBurnLen = new JLabel("Ges. Brenndauer:");
		txtPrjBurnLen = new JTextField();
		JLabel lblPrjWireUsed = new JLabel("Ges. Verbinder:");
		txtPrjWire = new JTextField();
		JLabel lblPrjWeight = new JLabel("Ges. Gewicht:");
		txtPrjWeight = new JTextField();
		JLabel lblPrjPrice = new JLabel("Ges. Preis:");
		txtPrjPrice = new JTextField();
		setViewportView(pnlProj);

		GridBagLayout gbl_pnlProj = new GridBagLayout();
		gbl_pnlProj.columnWidths = new int[]{46, 86, 46, 217, 0};
		gbl_pnlProj.rowHeights = new int[]{20, 20, 2, 20, 20, 20, 0};
		gbl_pnlProj.columnWeights = new double[]{0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_pnlProj.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		pnlProj.setLayout(gbl_pnlProj);
		
		GridBagConstraints gbc_lblPrjName = new GridBagConstraints();
		gbc_lblPrjName.anchor = GridBagConstraints.WEST;
		gbc_lblPrjName.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrjName.gridx = 0;
		gbc_lblPrjName.gridy = 0;
		pnlProj.add(lblPrjName, gbc_lblPrjName);
		
		txtPrjName.setEnabled(false);
		GridBagConstraints gbc_txtPrjName = new GridBagConstraints();
		gbc_txtPrjName.anchor = GridBagConstraints.NORTH;
		gbc_txtPrjName.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPrjName.insets = new Insets(0, 0, 5, 0);
		gbc_txtPrjName.gridwidth = 3;
		gbc_txtPrjName.gridx = 1;
		gbc_txtPrjName.gridy = 0;
		pnlProj.add(txtPrjName, gbc_txtPrjName);
		txtPrjName.setColumns(10);
		
		GridBagConstraints gbc_lblPrjCre = new GridBagConstraints();
		gbc_lblPrjCre.anchor = GridBagConstraints.WEST;
		gbc_lblPrjCre.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrjCre.gridx = 0;
		gbc_lblPrjCre.gridy = 1;
		pnlProj.add(lblPrjCre, gbc_lblPrjCre);
		
		txtPrjCre.setEnabled(false);
		GridBagConstraints gbc_txtPrjCre = new GridBagConstraints();
		gbc_txtPrjCre.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPrjCre.anchor = GridBagConstraints.NORTH;
		gbc_txtPrjCre.insets = new Insets(0, 0, 5, 5);
		gbc_txtPrjCre.gridx = 1;
		gbc_txtPrjCre.gridy = 1;
		pnlProj.add(txtPrjCre, gbc_txtPrjCre);
		txtPrjCre.setColumns(10);
		
		GridBagConstraints gbc_lblPrjLastEdit = new GridBagConstraints();
		gbc_lblPrjLastEdit.anchor = GridBagConstraints.WEST;
		gbc_lblPrjLastEdit.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrjLastEdit.gridx = 2;
		gbc_lblPrjLastEdit.gridy = 1;
		pnlProj.add(lblPrjLastEdit, gbc_lblPrjLastEdit);
		
		txtPrjLastEdit.setEnabled(false);
		GridBagConstraints gbc_txtPrjLastEdit = new GridBagConstraints();
		gbc_txtPrjLastEdit.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPrjLastEdit.anchor = GridBagConstraints.NORTH;
		gbc_txtPrjLastEdit.insets = new Insets(0, 0, 5, 0);
		gbc_txtPrjLastEdit.gridx = 3;
		gbc_txtPrjLastEdit.gridy = 1;
		pnlProj.add(txtPrjLastEdit, gbc_txtPrjLastEdit);
		txtPrjLastEdit.setColumns(10);
		
		GridBagConstraints gbc_separator = new GridBagConstraints();
		gbc_separator.anchor = GridBagConstraints.NORTH;
		gbc_separator.fill = GridBagConstraints.HORIZONTAL;
		gbc_separator.insets = new Insets(0, 0, 5, 0);
		gbc_separator.gridwidth = 4;
		gbc_separator.gridx = 0;
		gbc_separator.gridy = 2;
		pnlProj.add(separator, gbc_separator);
		
		GridBagConstraints gbc_lblPrjArt = new GridBagConstraints();
		gbc_lblPrjArt.anchor = GridBagConstraints.WEST;
		gbc_lblPrjArt.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrjArt.gridx = 0;
		gbc_lblPrjArt.gridy = 3;
		pnlProj.add(lblPrjArt, gbc_lblPrjArt);
		
		txtPrjArt.setEnabled(false);
		GridBagConstraints gbc_txtPrjArt = new GridBagConstraints();
		gbc_txtPrjArt.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPrjArt.anchor = GridBagConstraints.NORTH;
		gbc_txtPrjArt.insets = new Insets(0, 0, 5, 5);
		gbc_txtPrjArt.gridx = 1;
		gbc_txtPrjArt.gridy = 3;
		pnlProj.add(txtPrjArt, gbc_txtPrjArt);
		txtPrjArt.setColumns(10);
		
		GridBagConstraints gbc_lblPrjNEM = new GridBagConstraints();
		gbc_lblPrjNEM.anchor = GridBagConstraints.WEST;
		gbc_lblPrjNEM.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrjNEM.gridx = 2;
		gbc_lblPrjNEM.gridy = 3;
		pnlProj.add(lblPrjNEM, gbc_lblPrjNEM);
		
		txtPrjNEM.setEnabled(false);
		GridBagConstraints gbc_txtPrjNEM = new GridBagConstraints();
		gbc_txtPrjNEM.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPrjNEM.anchor = GridBagConstraints.NORTH;
		gbc_txtPrjNEM.insets = new Insets(0, 0, 5, 0);
		gbc_txtPrjNEM.gridx = 3;
		gbc_txtPrjNEM.gridy = 3;
		pnlProj.add(txtPrjNEM, gbc_txtPrjNEM);
		txtPrjNEM.setColumns(10);
		
		GridBagConstraints gbc_lblPrjBurnLen = new GridBagConstraints();
		gbc_lblPrjBurnLen.anchor = GridBagConstraints.WEST;
		gbc_lblPrjBurnLen.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrjBurnLen.gridx = 0;
		gbc_lblPrjBurnLen.gridy = 4;
		pnlProj.add(lblPrjBurnLen, gbc_lblPrjBurnLen);
		
		txtPrjBurnLen.setEnabled(false);
		GridBagConstraints gbc_txtPrjBurnLen = new GridBagConstraints();
		gbc_txtPrjBurnLen.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPrjBurnLen.anchor = GridBagConstraints.NORTH;
		gbc_txtPrjBurnLen.insets = new Insets(0, 0, 5, 5);
		gbc_txtPrjBurnLen.gridx = 1;
		gbc_txtPrjBurnLen.gridy = 4;
		pnlProj.add(txtPrjBurnLen, gbc_txtPrjBurnLen);
		txtPrjBurnLen.setColumns(10);
		
		GridBagConstraints gbc_lblPrjWireUsed = new GridBagConstraints();
		gbc_lblPrjWireUsed.anchor = GridBagConstraints.WEST;
		gbc_lblPrjWireUsed.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrjWireUsed.gridx = 2;
		gbc_lblPrjWireUsed.gridy = 4;
		pnlProj.add(lblPrjWireUsed, gbc_lblPrjWireUsed);
		
		txtPrjWire.setEnabled(false);
		GridBagConstraints gbc_txtPrjWire = new GridBagConstraints();
		gbc_txtPrjWire.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPrjWire.anchor = GridBagConstraints.NORTH;
		gbc_txtPrjWire.insets = new Insets(0, 0, 5, 0);
		gbc_txtPrjWire.gridx = 3;
		gbc_txtPrjWire.gridy = 4;
		pnlProj.add(txtPrjWire, gbc_txtPrjWire);
		txtPrjWire.setColumns(10);
		
		GridBagConstraints gbc_lblPrjWeight = new GridBagConstraints();
		gbc_lblPrjWeight.anchor = GridBagConstraints.WEST;
		gbc_lblPrjWeight.insets = new Insets(0, 0, 0, 5);
		gbc_lblPrjWeight.gridx = 0;
		gbc_lblPrjWeight.gridy = 5;
		pnlProj.add(lblPrjWeight, gbc_lblPrjWeight);
		
		txtPrjWeight.setEnabled(false);
		GridBagConstraints gbc_txtPrjWeight = new GridBagConstraints();
		gbc_txtPrjWeight.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPrjWeight.anchor = GridBagConstraints.NORTH;
		gbc_txtPrjWeight.insets = new Insets(0, 0, 0, 5);
		gbc_txtPrjWeight.gridx = 1;
		gbc_txtPrjWeight.gridy = 5;
		pnlProj.add(txtPrjWeight, gbc_txtPrjWeight);
		txtPrjWeight.setColumns(10);
		
		GridBagConstraints gbc_lblPrjPrice = new GridBagConstraints();
		gbc_lblPrjPrice.anchor = GridBagConstraints.WEST;
		gbc_lblPrjPrice.insets = new Insets(0, 0, 0, 5);
		gbc_lblPrjPrice.gridx = 2;
		gbc_lblPrjPrice.gridy = 5;
		pnlProj.add(lblPrjPrice, gbc_lblPrjPrice);
		
		txtPrjPrice.setEnabled(false);
		GridBagConstraints gbc_txtPrjPrice = new GridBagConstraints();
		gbc_txtPrjPrice.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPrjPrice.anchor = GridBagConstraints.NORTH;
		gbc_txtPrjPrice.gridx = 3;
		gbc_txtPrjPrice.gridy = 5;
		pnlProj.add(txtPrjPrice, gbc_txtPrjPrice);
		txtPrjPrice.setColumns(10);
	}

	protected String getPrjName()
	{
		return txtPrjName.getText();
	}

	protected void setPrjName(String prjName)
	{
		this.txtPrjName.setText(prjName);
	}

	protected String getPrjCre()
	{
		return txtPrjCre.getText();
	}

	protected void setPrjCre(String prjCre)
	{
		this.txtPrjCre.setText(prjCre);
	}

	protected String getPrjLastEdit()
	{
		return txtPrjLastEdit.getText();
	}

	protected void setPrjLastEdit(String prjLastEdit)
	{
		this.txtPrjLastEdit.setText(prjLastEdit);
	}

	protected String getPrjArt()
	{
		return txtPrjArt.getText();
	}

	protected void setPrjArt(String prjArt)
	{
		this.txtPrjArt.setText(prjArt);
	}

	protected String getPrjNEM()
	{
		return txtPrjNEM.getText();
	}

	protected void setPrjNEM(String prjNEM)
	{
		this.txtPrjNEM.setText(prjNEM);
	}

	protected String getPrjBurnLen()
	{
		return txtPrjBurnLen.getText();
	}

	protected void setPrjBurnLen(String prjBurnLen)
	{
		this.txtPrjBurnLen.setText(prjBurnLen);
	}

	protected String getPrjWire()
	{
		return txtPrjWire.getText();
	}

	protected void setPrjWire(String prjWire)
	{
		this.txtPrjWire.setText(prjWire);
	}

	protected String getPrjWeight()
	{
		return txtPrjWeight.getText();
	}

	protected void setPrjWeight(String prjWeight)
	{
		this.txtPrjWeight.setText(prjWeight);
	}

	protected String getPrjPrice()
	{
		return txtPrjPrice.getText();
	}

	protected void setPrjPrice(String prjPrice)
	{
		this.txtPrjPrice.setText(prjPrice);
	}
}