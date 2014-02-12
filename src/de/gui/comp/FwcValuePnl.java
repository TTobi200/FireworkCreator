/*
 * $Header$
 *
 * $Log$
 * Copyright © 2014 Unitechnik AG. All Rights Reserved.
 */
package de.gui.comp;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class FwcValuePnl extends JPanel
{
	private static final long serialVersionUID = 1L;
	
	private JTextField txtName;
	private JTextField txtWeigth;
	private JTextField txtNEM;
	private JTextField txtPrice;
	private JTextField txtCat;
	private JTextField txtBurnLeng;
	private JTextField txtEffektHeigth;
	private JTextField txtCalibre;
	private JTextField txtBAMNr;
	private JTextField txtDim;
	private JTextField txtPrjName;
	private JTextField txtPrjCre;
	private JTextField txtPrjLastEdit;
	private JTextField txtPrjArt;
	private JTextField txtPrjNEM;
	private JTextField txtPrjBurnLen;
	private JTextField txtPrjWire;
	private JTextField txtPrjWeight;
	private JTextField txtPrjPrice;
	
	public FwcValuePnl()
	{
		setLayout(new BorderLayout(0, 0));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		
		tabbedPane.addTab("Projekt", null, creProjPnl(), null);
		tabbedPane.addTab("Eigenschaften", null, creValPnl(), null);
		
		add(tabbedPane);
	}

	private Component creProjPnl()
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
		
		return new JScrollPane(pnlProj);
	}

	private Component creValPnl()
	{
		JPanel pnlFwValue = new JPanel();	
		pnlFwValue.setLayout(new BorderLayout(0, 0));
		JPanel pnlBackg = new JPanel();
		JLabel lblName = new JLabel("Name:");
		txtName = new JTextField();
		JLabel lblWeigth = new JLabel("Gewicht (g):");
		txtWeigth = new JTextField();
		JLabel lblCreator = new JLabel("Hersteller:");
		JComboBox<Object> cbCreator = new JComboBox<Object>();
		JLabel lblEffektHeight = new JLabel("Effekth\u00F6he (m):");
		JLabel lblNEM = new JLabel("NEM (g):");
		txtEffektHeigth = new JTextField();
		txtNEM = new JTextField();
		txtBurnLeng = new JTextField();
		JLabel lblPrice = new JLabel("Preis (\u20AC):");
		JLabel lblBurnLeng = new JLabel("Brenndauer (sec):");
		txtPrice = new JTextField();
		txtCalibre = new JTextField();
		JLabel lblCalibre = new JLabel("Kaliber (mm):");
		JLabel lblBAMNr = new JLabel("BAM Nr.:");
		txtBAMNr = new JTextField();
		JLabel lblDim = new JLabel("Abmessungen:");
		txtDim = new JTextField();
		JLabel lblCat = new JLabel("Kategorie:");
		txtCat = new JTextField();
		JLabel lblDesc = new JLabel("Beschreibung:");
		JPanel pnlDesc = new JPanel();
		JTextArea txtADesc = new JTextArea();
		JPanel pnlBtnProps = new JPanel();
		JButton btnSaveProps = new JButton("Speichern");
		JButton btnCancelProps = new JButton("Abbrechen");

		// TODO Remove after using editor
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		GridBagConstraints gbc_lblName = new GridBagConstraints();
		GridBagConstraints gbc_txtName = new GridBagConstraints();
		GridBagConstraints gbc_lblWeigth = new GridBagConstraints();
		GridBagConstraints gbc_txtWeigth = new GridBagConstraints();
		GridBagConstraints gbc_cbCreator = new GridBagConstraints();
		GridBagConstraints gbc_lblCreator = new GridBagConstraints();
		GridBagConstraints gbc_lblEffektHeight = new GridBagConstraints();
		GridBagConstraints gbc_txtEffektHeigth = new GridBagConstraints();
		GridBagConstraints gbc_lblNEM = new GridBagConstraints();
		GridBagConstraints gbc_txtNEM = new GridBagConstraints();
		GridBagConstraints gbc_lblBurnLeng = new GridBagConstraints();
		GridBagConstraints gbc_txtBurnLeng = new GridBagConstraints();
		GridBagConstraints gbc_lblPrice = new GridBagConstraints();
		GridBagConstraints gbc_txtPrice = new GridBagConstraints();
		GridBagConstraints gbc_lblCalibre = new GridBagConstraints();
		GridBagConstraints gbc_txtCalibre = new GridBagConstraints();
		GridBagConstraints gbc_lblBAMNr = new GridBagConstraints();
		GridBagConstraints gbc_txtBAMNr = new GridBagConstraints();
		GridBagConstraints gbc_lblDim = new GridBagConstraints();
		GridBagConstraints gbc_txtDim = new GridBagConstraints();
		GridBagConstraints gbc_lblCat = new GridBagConstraints();
		GridBagConstraints gbc_txtCat = new GridBagConstraints();
		GridBagConstraints gbc_lblDesc = new GridBagConstraints();
		GridBagConstraints gbc_pnlDesc = new GridBagConstraints();
		
		pnlFwValue.add(new JScrollPane(pnlBackg));
		gbl_panel_1.columnWidths = new int[]{46, 40, 86, 50, 166, 0};
		gbl_panel_1.rowHeights = new int[]{20, 20, 20, 20, 23, 20, 0, 0, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		pnlBackg.setLayout(gbl_panel_1);
		
		gbc_lblName.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblName.insets = new Insets(0, 0, 5, 5);
		gbc_lblName.gridx = 0;
		gbc_lblName.gridy = 0;
		pnlBackg.add(lblName, gbc_lblName);
		
		gbc_txtName.anchor = GridBagConstraints.NORTH;
		gbc_txtName.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtName.gridwidth = 3;
		gbc_txtName.insets = new Insets(0, 0, 5, 0);
		gbc_txtName.gridx = 2;
		gbc_txtName.gridy = 0;
		pnlBackg.add(txtName, gbc_txtName);
		txtName.setColumns(10);
		
		gbc_lblWeigth.anchor = GridBagConstraints.WEST;
		gbc_lblWeigth.gridwidth = 2;
		gbc_lblWeigth.insets = new Insets(0, 0, 5, 5);
		gbc_lblWeigth.gridx = 0;
		gbc_lblWeigth.gridy = 1;
		pnlBackg.add(lblWeigth, gbc_lblWeigth);
		
		gbc_txtWeigth.anchor = GridBagConstraints.NORTH;
		gbc_txtWeigth.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtWeigth.insets = new Insets(0, 0, 5, 5);
		gbc_txtWeigth.gridx = 2;
		gbc_txtWeigth.gridy = 1;
		pnlBackg.add(txtWeigth, gbc_txtWeigth);
		txtWeigth.setColumns(10);
		
		gbc_lblCreator.anchor = GridBagConstraints.WEST;
		gbc_lblCreator.insets = new Insets(0, 0, 5, 5);
		gbc_lblCreator.gridx = 3;
		gbc_lblCreator.gridy = 1;
		pnlBackg.add(lblCreator, gbc_lblCreator);
		gbc_cbCreator.anchor = GridBagConstraints.NORTH;
		gbc_cbCreator.fill = GridBagConstraints.HORIZONTAL;
		gbc_cbCreator.insets = new Insets(0, 0, 5, 0);
		gbc_cbCreator.gridx = 4;
		gbc_cbCreator.gridy = 1;
		pnlBackg.add(cbCreator, gbc_cbCreator);
		
		gbc_lblEffektHeight.anchor = GridBagConstraints.WEST;
		gbc_lblEffektHeight.gridwidth = 3;
		gbc_lblEffektHeight.insets = new Insets(0, 0, 5, 5);
		gbc_lblEffektHeight.gridx = 0;
		gbc_lblEffektHeight.gridy = 2;
		pnlBackg.add(lblEffektHeight, gbc_lblEffektHeight);
		
		gbc_txtEffektHeigth.anchor = GridBagConstraints.NORTH;
		gbc_txtEffektHeigth.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtEffektHeigth.insets = new Insets(0, 0, 5, 5);
		gbc_txtEffektHeigth.gridx = 2;
		gbc_txtEffektHeigth.gridy = 2;
		pnlBackg.add(txtEffektHeigth, gbc_txtEffektHeigth);
		
		gbc_lblNEM.anchor = GridBagConstraints.WEST;
		gbc_lblNEM.insets = new Insets(0, 0, 5, 5);
		gbc_lblNEM.gridx = 3;
		gbc_lblNEM.gridy = 2;
		pnlBackg.add(lblNEM, gbc_lblNEM);
		
		gbc_txtNEM.anchor = GridBagConstraints.NORTH;
		gbc_txtNEM.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNEM.insets = new Insets(0, 0, 5, 0);
		gbc_txtNEM.gridx = 4;
		gbc_txtNEM.gridy = 2;
		pnlBackg.add(txtNEM, gbc_txtNEM);
		
		gbc_lblBurnLeng.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblBurnLeng.gridwidth = 3;
		gbc_lblBurnLeng.insets = new Insets(0, 0, 5, 5);
		gbc_lblBurnLeng.gridx = 0;
		gbc_lblBurnLeng.gridy = 3;
		pnlBackg.add(lblBurnLeng, gbc_lblBurnLeng);
		
		gbc_txtBurnLeng.anchor = GridBagConstraints.NORTH;
		gbc_txtBurnLeng.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtBurnLeng.insets = new Insets(0, 0, 5, 5);
		gbc_txtBurnLeng.gridx = 2;
		gbc_txtBurnLeng.gridy = 3;
		pnlBackg.add(txtBurnLeng, gbc_txtBurnLeng);
		
		gbc_lblPrice.anchor = GridBagConstraints.WEST;
		gbc_lblPrice.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrice.gridx = 3;
		gbc_lblPrice.gridy = 3;
		pnlBackg.add(lblPrice, gbc_lblPrice);
		
		gbc_txtPrice.anchor = GridBagConstraints.NORTH;
		gbc_txtPrice.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPrice.insets = new Insets(0, 0, 5, 0);
		gbc_txtPrice.gridx = 4;
		gbc_txtPrice.gridy = 3;
		pnlBackg.add(txtPrice, gbc_txtPrice);
		
		gbc_lblCalibre.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblCalibre.gridwidth = 2;
		gbc_lblCalibre.insets = new Insets(0, 0, 5, 5);
		gbc_lblCalibre.gridx = 0;
		gbc_lblCalibre.gridy = 4;
		pnlBackg.add(lblCalibre, gbc_lblCalibre);
		
		gbc_txtCalibre.anchor = GridBagConstraints.SOUTH;
		gbc_txtCalibre.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtCalibre.insets = new Insets(0, 0, 5, 5);
		gbc_txtCalibre.gridx = 2;
		gbc_txtCalibre.gridy = 4;
		pnlBackg.add(txtCalibre, gbc_txtCalibre);
		
		gbc_lblBAMNr.anchor = GridBagConstraints.WEST;
		gbc_lblBAMNr.insets = new Insets(0, 0, 5, 5);
		gbc_lblBAMNr.gridx = 3;
		gbc_lblBAMNr.gridy = 4;
		pnlBackg.add(lblBAMNr, gbc_lblBAMNr);
		
		gbc_txtBAMNr.anchor = GridBagConstraints.NORTH;
		gbc_txtBAMNr.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtBAMNr.insets = new Insets(0, 0, 5, 0);
		gbc_txtBAMNr.gridx = 4;
		gbc_txtBAMNr.gridy = 4;
		pnlBackg.add(txtBAMNr, gbc_txtBAMNr);
		
		gbc_lblDim.anchor = GridBagConstraints.WEST;
		gbc_lblDim.gridwidth = 2;
		gbc_lblDim.insets = new Insets(0, 0, 5, 5);
		gbc_lblDim.gridx = 0;
		gbc_lblDim.gridy = 5;
		pnlBackg.add(lblDim, gbc_lblDim);
		
		gbc_txtDim.anchor = GridBagConstraints.NORTH;
		gbc_txtDim.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtDim.insets = new Insets(0, 0, 5, 5);
		gbc_txtDim.gridx = 2;
		gbc_txtDim.gridy = 5;
		pnlBackg.add(txtDim, gbc_txtDim);
		
		gbc_lblCat.anchor = GridBagConstraints.WEST;
		gbc_lblCat.gridwidth = 2;
		gbc_lblCat.insets = new Insets(0, 0, 5, 0);
		gbc_lblCat.gridx = 3;
		gbc_lblCat.gridy = 5;
		pnlBackg.add(lblCat, gbc_lblCat);
		
		gbc_txtCat.anchor = GridBagConstraints.NORTH;
		gbc_txtCat.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtCat.insets = new Insets(0, 0, 5, 0);
		gbc_txtCat.gridx = 4;
		gbc_txtCat.gridy = 5;
		pnlBackg.add(txtCat, gbc_txtCat);
		
		gbc_lblDesc.anchor = GridBagConstraints.WEST;
		gbc_lblDesc.insets = new Insets(0, 0, 5, 5);
		gbc_lblDesc.gridx = 0;
		gbc_lblDesc.gridy = 6;
		pnlBackg.add(lblDesc, gbc_lblDesc);
		
		gbc_pnlDesc.fill = GridBagConstraints.BOTH;
		gbc_pnlDesc.gridwidth = 5;
		gbc_pnlDesc.insets = new Insets(0, 0, 0, 5);
		gbc_pnlDesc.gridx = 0;
		gbc_pnlDesc.gridy = 7;
		
		pnlBackg.add(pnlDesc, gbc_pnlDesc);
		pnlDesc.setLayout(new BorderLayout(0, 0));
		
		pnlDesc.add(pnlBtnProps, BorderLayout.SOUTH);
		pnlBtnProps.setLayout(new BoxLayout(pnlBtnProps, BoxLayout.X_AXIS));
		pnlBtnProps.add(btnSaveProps);
		pnlBtnProps.add(btnCancelProps);
		pnlDesc.add(txtADesc, BorderLayout.CENTER);
		
		return pnlFwValue;
	}
}