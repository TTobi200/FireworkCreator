/*
 * $Header$
 *
 * $Log$
 * Copyright © 2014 Unitechnik AG. All Rights Reserved.
 */
package de.gui.comp;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class FwcBatteryPropPnl extends JScrollPane
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

	private JComboBox<Object> cbProd;

	private JTextArea txtADesc;
	
	public FwcBatteryPropPnl()
	{
		init();
	}

	private void init()
	{
		JPanel pnlFwValue = new JPanel();	
		pnlFwValue.setLayout(new BorderLayout(0, 0));
		JPanel pnlBackg = new JPanel();
		JLabel lblName = new JLabel("Name:");
		txtName = new JTextField();
		JLabel lblWeigth = new JLabel("Gewicht (g):");
		txtWeigth = new JTextField();
		JLabel lblCreator = new JLabel("Hersteller:");
		cbProd = new JComboBox<Object>();
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
		txtADesc = new JTextArea();

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
		
		setViewportView(pnlBackg);
		
		pnlFwValue.add(this);
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
		pnlBackg.add(cbProd, gbc_cbCreator);
		
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
		
		pnlDesc.add(txtADesc, BorderLayout.CENTER);
	}
	
	public String getFwName()
	{
		return txtName.getText();
	}

	public void setFwName(String name)
	{
		this.txtName.setText(name);
	}

	public String getFwWeigth()
	{
		return txtWeigth.getText();
	}

	public void setFwWeigth(String weigth)
	{
		this.txtWeigth.setText(weigth);
	}

	public String getFwNEM()
	{
		return txtNEM.getText();
	}

	public void setFwNEM(String NEM)
	{
		this.txtNEM.setText(NEM);
	}

	public String getFwPrice()
	{
		return txtPrice.getText();
	}

	public void setFwPrice(String price)
	{
		this.txtPrice.setText(price);
	}

	public String getFwCat()
	{
		return txtCat.getText();
	}

	public void setFwCat(String cat)
	{
		this.txtCat.setText(cat);
	}

	public String getFwBurnLeng()
	{
		return txtBurnLeng.getText();
	}

	public void setFwBurnLeng(String burnLeng)
	{
		this.txtBurnLeng.setText(burnLeng);
	}

	public String getFwEffektHeigth()
	{
		return txtEffektHeigth.getText();
	}

	public void setFwEffektHeigth(String effektHeigth)
	{
		this.txtEffektHeigth.setText(effektHeigth);
	}

	public String getFwCalibre()
	{
		return txtCalibre.getText();
	}

	public void setFwCalibre(String calibre)
	{
		this.txtCalibre.setText(calibre);
	}

	public String getFwBAMNr()
	{
		return txtBAMNr.getText();
	}

	public void setFwBAMNr(String BAMNr)
	{
		this.txtBAMNr.setText(BAMNr);
	}

	public String getFwDim()
	{
		return txtDim.getText();
	}

	public void setFwDim(String dim)
	{
		this.txtDim.setText(dim);
	}

	public String getFwProd()
	{
		return String.valueOf(cbProd.getSelectedItem());
	}

	public String getFwDesc()
	{
		return txtADesc.getText();
	}
}
