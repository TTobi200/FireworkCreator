/*
 * $Header$
 *
 * $Log$
 * Copyright © 2014 Unitechnik AG. All Rights Reserved.
 */
package de.gui.comp;

import javax.swing.JPanel;

import java.awt.BorderLayout;

import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.JTextArea;

public class FwcValuePnl extends JPanel
{
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField txtCat;
	private JTextField txtBurnLeng;
	private JTextField txtEffektHeigth;
	private JTextField textField_4;
	private JTextField txtBAMNr;
	private JTextField txtDim;
	
	public FwcValuePnl()
	{
		setLayout(new BorderLayout(0, 0));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		JPanel pnlSum = new JPanel();
		JPanel pnlFwValue = new JPanel();
		
		pnlSum.setLayout(new BorderLayout(0, 0));
		tabbedPane.addTab("Gesamt", null, pnlSum, null);
		tabbedPane.addTab("Eigenschaften", null, pnlFwValue, null);
		pnlFwValue.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		pnlFwValue.add(new JScrollPane(panel_1));
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{46, 40, 86, 50, 166, 0};
		gbl_panel_1.rowHeights = new int[]{20, 20, 20, 20, 23, 20, 0, 0, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		JLabel lblName = new JLabel("Name:");
		GridBagConstraints gbc_lblName = new GridBagConstraints();
		gbc_lblName.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblName.insets = new Insets(0, 0, 5, 5);
		gbc_lblName.gridx = 0;
		gbc_lblName.gridy = 0;
		panel_1.add(lblName, gbc_lblName);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.anchor = GridBagConstraints.NORTH;
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridwidth = 3;
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.gridx = 2;
		gbc_textField.gridy = 0;
		panel_1.add(textField, gbc_textField);
		textField.setColumns(10);
		
		JLabel lblWeigth = new JLabel("Gewicht (g):");
		GridBagConstraints gbc_lblWeigth = new GridBagConstraints();
		gbc_lblWeigth.anchor = GridBagConstraints.WEST;
		gbc_lblWeigth.gridwidth = 2;
		gbc_lblWeigth.insets = new Insets(0, 0, 5, 5);
		gbc_lblWeigth.gridx = 0;
		gbc_lblWeigth.gridy = 1;
		panel_1.add(lblWeigth, gbc_lblWeigth);
		
		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.anchor = GridBagConstraints.NORTH;
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.gridx = 2;
		gbc_textField_1.gridy = 1;
		panel_1.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		JLabel lblCreator = new JLabel("Hersteller:");
		GridBagConstraints gbc_lblCreator = new GridBagConstraints();
		gbc_lblCreator.anchor = GridBagConstraints.WEST;
		gbc_lblCreator.insets = new Insets(0, 0, 5, 5);
		gbc_lblCreator.gridx = 3;
		gbc_lblCreator.gridy = 1;
		panel_1.add(lblCreator, gbc_lblCreator);
		
		JComboBox comboBox = new JComboBox();
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.anchor = GridBagConstraints.NORTH;
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox.gridx = 4;
		gbc_comboBox.gridy = 1;
		panel_1.add(comboBox, gbc_comboBox);
		
		JLabel lblEffektHeight = new JLabel("Effekth\u00F6he (m):");
		GridBagConstraints gbc_lblEffektHeight = new GridBagConstraints();
		gbc_lblEffektHeight.anchor = GridBagConstraints.WEST;
		gbc_lblEffektHeight.gridwidth = 3;
		gbc_lblEffektHeight.insets = new Insets(0, 0, 5, 5);
		gbc_lblEffektHeight.gridx = 0;
		gbc_lblEffektHeight.gridy = 2;
		panel_1.add(lblEffektHeight, gbc_lblEffektHeight);
		
		txtEffektHeigth = new JTextField();
		GridBagConstraints gbc_txtEffektHeigth = new GridBagConstraints();
		gbc_txtEffektHeigth.anchor = GridBagConstraints.NORTH;
		gbc_txtEffektHeigth.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtEffektHeigth.insets = new Insets(0, 0, 5, 5);
		gbc_txtEffektHeigth.gridx = 2;
		gbc_txtEffektHeigth.gridy = 2;
		panel_1.add(txtEffektHeigth, gbc_txtEffektHeigth);
		txtEffektHeigth.setColumns(10);
		
		JLabel lblNEM = new JLabel("NEM (g):");
		GridBagConstraints gbc_lblNEM = new GridBagConstraints();
		gbc_lblNEM.anchor = GridBagConstraints.WEST;
		gbc_lblNEM.insets = new Insets(0, 0, 5, 5);
		gbc_lblNEM.gridx = 3;
		gbc_lblNEM.gridy = 2;
		panel_1.add(lblNEM, gbc_lblNEM);
		
		textField_2 = new JTextField();
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.anchor = GridBagConstraints.NORTH;
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.insets = new Insets(0, 0, 5, 0);
		gbc_textField_2.gridx = 4;
		gbc_textField_2.gridy = 2;
		panel_1.add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);
		
		JLabel lblBurnLeng = new JLabel("Brenndauer (sec):");
		GridBagConstraints gbc_lblBurnLeng = new GridBagConstraints();
		gbc_lblBurnLeng.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblBurnLeng.gridwidth = 3;
		gbc_lblBurnLeng.insets = new Insets(0, 0, 5, 5);
		gbc_lblBurnLeng.gridx = 0;
		gbc_lblBurnLeng.gridy = 3;
		panel_1.add(lblBurnLeng, gbc_lblBurnLeng);
		
		txtBurnLeng = new JTextField();
		GridBagConstraints gbc_txtBurnLeng = new GridBagConstraints();
		gbc_txtBurnLeng.anchor = GridBagConstraints.NORTH;
		gbc_txtBurnLeng.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtBurnLeng.insets = new Insets(0, 0, 5, 5);
		gbc_txtBurnLeng.gridx = 2;
		gbc_txtBurnLeng.gridy = 3;
		panel_1.add(txtBurnLeng, gbc_txtBurnLeng);
		txtBurnLeng.setColumns(10);
		
		JLabel lblPrice = new JLabel("Preis (\u20AC):");
		GridBagConstraints gbc_lblPrice = new GridBagConstraints();
		gbc_lblPrice.anchor = GridBagConstraints.WEST;
		gbc_lblPrice.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrice.gridx = 3;
		gbc_lblPrice.gridy = 3;
		panel_1.add(lblPrice, gbc_lblPrice);
		
		textField_3 = new JTextField();
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.anchor = GridBagConstraints.NORTH;
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.insets = new Insets(0, 0, 5, 0);
		gbc_textField_3.gridx = 4;
		gbc_textField_3.gridy = 3;
		panel_1.add(textField_3, gbc_textField_3);
		textField_3.setColumns(10);
		
		JLabel lblCalibre = new JLabel("Kaliber (mm):");
		GridBagConstraints gbc_lblCalibre = new GridBagConstraints();
		gbc_lblCalibre.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblCalibre.gridwidth = 2;
		gbc_lblCalibre.insets = new Insets(0, 0, 5, 5);
		gbc_lblCalibre.gridx = 0;
		gbc_lblCalibre.gridy = 4;
		panel_1.add(lblCalibre, gbc_lblCalibre);
		
		textField_4 = new JTextField();
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.anchor = GridBagConstraints.SOUTH;
		gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_4.insets = new Insets(0, 0, 5, 5);
		gbc_textField_4.gridx = 2;
		gbc_textField_4.gridy = 4;
		panel_1.add(textField_4, gbc_textField_4);
		textField_4.setColumns(10);
		
		JLabel lblBAMNr = new JLabel("BAM Nr.:");
		GridBagConstraints gbc_lblBAMNr = new GridBagConstraints();
		gbc_lblBAMNr.anchor = GridBagConstraints.WEST;
		gbc_lblBAMNr.insets = new Insets(0, 0, 5, 5);
		gbc_lblBAMNr.gridx = 3;
		gbc_lblBAMNr.gridy = 4;
		panel_1.add(lblBAMNr, gbc_lblBAMNr);
		
		txtBAMNr = new JTextField();
		GridBagConstraints gbc_txtBAMNr = new GridBagConstraints();
		gbc_txtBAMNr.anchor = GridBagConstraints.NORTH;
		gbc_txtBAMNr.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtBAMNr.insets = new Insets(0, 0, 5, 0);
		gbc_txtBAMNr.gridx = 4;
		gbc_txtBAMNr.gridy = 4;
		panel_1.add(txtBAMNr, gbc_txtBAMNr);
		txtBAMNr.setColumns(10);
		
		JLabel lblDim = new JLabel("Abmessungen:");
		GridBagConstraints gbc_lblDim = new GridBagConstraints();
		gbc_lblDim.anchor = GridBagConstraints.WEST;
		gbc_lblDim.gridwidth = 2;
		gbc_lblDim.insets = new Insets(0, 0, 5, 5);
		gbc_lblDim.gridx = 0;
		gbc_lblDim.gridy = 5;
		panel_1.add(lblDim, gbc_lblDim);
		
		txtDim = new JTextField();
		GridBagConstraints gbc_txtDim = new GridBagConstraints();
		gbc_txtDim.anchor = GridBagConstraints.NORTH;
		gbc_txtDim.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtDim.insets = new Insets(0, 0, 5, 5);
		gbc_txtDim.gridx = 2;
		gbc_txtDim.gridy = 5;
		panel_1.add(txtDim, gbc_txtDim);
		txtDim.setColumns(10);
		
		JLabel lblCat = new JLabel("Kategorie:");
		GridBagConstraints gbc_lblCat = new GridBagConstraints();
		gbc_lblCat.anchor = GridBagConstraints.WEST;
		gbc_lblCat.gridwidth = 2;
		gbc_lblCat.insets = new Insets(0, 0, 5, 0);
		gbc_lblCat.gridx = 3;
		gbc_lblCat.gridy = 5;
		panel_1.add(lblCat, gbc_lblCat);
		
		txtCat = new JTextField();
		GridBagConstraints gbc_txtCat = new GridBagConstraints();
		gbc_txtCat.anchor = GridBagConstraints.NORTH;
		gbc_txtCat.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtCat.insets = new Insets(0, 0, 5, 0);
		gbc_txtCat.gridx = 4;
		gbc_txtCat.gridy = 5;
		panel_1.add(txtCat, gbc_txtCat);
		txtCat.setColumns(10);
		
		JLabel lblDesc = new JLabel("Beschreibung:");
		GridBagConstraints gbc_lblDesc = new GridBagConstraints();
		gbc_lblDesc.anchor = GridBagConstraints.WEST;
		gbc_lblDesc.insets = new Insets(0, 0, 5, 5);
		gbc_lblDesc.gridx = 0;
		gbc_lblDesc.gridy = 6;
		panel_1.add(lblDesc, gbc_lblDesc);
		
		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridwidth = 5;
		gbc_panel.insets = new Insets(0, 0, 0, 5);
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 7;
		panel_1.add(panel, gbc_panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		JTextArea textArea = new JTextArea();
		panel.add(textArea, BorderLayout.CENTER);
		add(tabbedPane);
	}
}