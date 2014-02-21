package de.gui.comp;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import de.fw.FwcFwArticle;
import de.fw.FwcFwBattery;

public class FwcFwPropPnl extends JScrollPane implements ActionListener
{
	private static final long serialVersionUID = 1L;

	private static final String STR_BROWSE = "Browse";
	
	private static JTextField txtName;
	private static JTextField txtWeigth;
	private static JTextField txtNEM;
	private static JTextField txtPrice;
	private static JTextField txtCat;
	private static JTextField txtBurnLeng;
	private static JTextField txtEffektHeigth;
	private static JTextField txtCalibre;
	private static JTextField txtBAMNr;
	private static JTextField txtDim;
	private static JTextField txtProd;
	private static JTextField txtImgPath;
	private static JTextArea txtADesc;
	
	private static FwcFwPropPnl instance = new FwcFwPropPnl();
	
	public static FwcFwPropPnl getInstance()
	{
		return instance;
	}
	
	private FwcFwPropPnl()
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
		txtProd = new JTextField();
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
		gbl_panel_1.rowHeights = new int[]{20, 0, 20, 20, 20, 23, 20, 0, 0, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
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
		
		JLabel lblImgPath = new JLabel("Bildpfad:");
		GridBagConstraints gbc_lblImgPath = new GridBagConstraints();
		gbc_lblImgPath.anchor = GridBagConstraints.WEST;
		gbc_lblImgPath.insets = new Insets(0, 0, 5, 5);
		gbc_lblImgPath.gridx = 0;
		gbc_lblImgPath.gridy = 1;
		pnlBackg.add(lblImgPath, gbc_lblImgPath);
		
		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.gridwidth = 3;
		gbc_panel.insets = new Insets(0, 0, 5, 0);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 2;
		gbc_panel.gridy = 1;
		pnlBackg.add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{239, 89, 0};
		gbl_panel.rowHeights = new int[]{23, 0};
		gbl_panel.columnWeights = new double[]{1.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		txtImgPath = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.insets = new Insets(0, 0, 0, 5);
		gbc_textField.gridx = 0;
		gbc_textField.gridy = 0;
		panel.add(txtImgPath, gbc_textField);
		
		JButton btnBrowseImg = new JButton(STR_BROWSE);
		GridBagConstraints gbc_btnBrowseImg = new GridBagConstraints();
		gbc_btnBrowseImg.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnBrowseImg.anchor = GridBagConstraints.NORTH;
		gbc_btnBrowseImg.gridx = 1;
		gbc_btnBrowseImg.gridy = 0;
		panel.add(btnBrowseImg, gbc_btnBrowseImg);
		
		gbc_lblWeigth.anchor = GridBagConstraints.WEST;
		gbc_lblWeigth.gridwidth = 2;
		gbc_lblWeigth.insets = new Insets(0, 0, 5, 5);
		gbc_lblWeigth.gridx = 0;
		gbc_lblWeigth.gridy = 2;
		pnlBackg.add(lblWeigth, gbc_lblWeigth);
		
		gbc_txtWeigth.anchor = GridBagConstraints.NORTH;
		gbc_txtWeigth.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtWeigth.insets = new Insets(0, 0, 5, 5);
		gbc_txtWeigth.gridx = 2;
		gbc_txtWeigth.gridy = 2;
		pnlBackg.add(txtWeigth, gbc_txtWeigth);
		txtWeigth.setColumns(10);
		
		gbc_lblCreator.anchor = GridBagConstraints.WEST;
		gbc_lblCreator.insets = new Insets(0, 0, 5, 5);
		gbc_lblCreator.gridx = 3;
		gbc_lblCreator.gridy = 2;
		pnlBackg.add(lblCreator, gbc_lblCreator);
		gbc_cbCreator.anchor = GridBagConstraints.NORTH;
		gbc_cbCreator.fill = GridBagConstraints.HORIZONTAL;
		gbc_cbCreator.insets = new Insets(0, 0, 5, 0);
		gbc_cbCreator.gridx = 4;
		gbc_cbCreator.gridy = 2;
		pnlBackg.add(txtProd, gbc_cbCreator);
		
		gbc_lblEffektHeight.anchor = GridBagConstraints.WEST;
		gbc_lblEffektHeight.gridwidth = 3;
		gbc_lblEffektHeight.insets = new Insets(0, 0, 5, 5);
		gbc_lblEffektHeight.gridx = 0;
		gbc_lblEffektHeight.gridy = 3;
		pnlBackg.add(lblEffektHeight, gbc_lblEffektHeight);
		
		gbc_txtEffektHeigth.anchor = GridBagConstraints.NORTH;
		gbc_txtEffektHeigth.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtEffektHeigth.insets = new Insets(0, 0, 5, 5);
		gbc_txtEffektHeigth.gridx = 2;
		gbc_txtEffektHeigth.gridy = 3;
		pnlBackg.add(txtEffektHeigth, gbc_txtEffektHeigth);
		
		gbc_lblNEM.anchor = GridBagConstraints.WEST;
		gbc_lblNEM.insets = new Insets(0, 0, 5, 5);
		gbc_lblNEM.gridx = 3;
		gbc_lblNEM.gridy = 3;
		pnlBackg.add(lblNEM, gbc_lblNEM);
		
		gbc_txtNEM.anchor = GridBagConstraints.NORTH;
		gbc_txtNEM.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNEM.insets = new Insets(0, 0, 5, 0);
		gbc_txtNEM.gridx = 4;
		gbc_txtNEM.gridy = 3;
		pnlBackg.add(txtNEM, gbc_txtNEM);
		
		gbc_lblBurnLeng.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblBurnLeng.gridwidth = 3;
		gbc_lblBurnLeng.insets = new Insets(0, 0, 5, 5);
		gbc_lblBurnLeng.gridx = 0;
		gbc_lblBurnLeng.gridy = 4;
		pnlBackg.add(lblBurnLeng, gbc_lblBurnLeng);
		
		gbc_txtBurnLeng.anchor = GridBagConstraints.NORTH;
		gbc_txtBurnLeng.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtBurnLeng.insets = new Insets(0, 0, 5, 5);
		gbc_txtBurnLeng.gridx = 2;
		gbc_txtBurnLeng.gridy = 4;
		pnlBackg.add(txtBurnLeng, gbc_txtBurnLeng);
		
		gbc_lblPrice.anchor = GridBagConstraints.WEST;
		gbc_lblPrice.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrice.gridx = 3;
		gbc_lblPrice.gridy = 4;
		pnlBackg.add(lblPrice, gbc_lblPrice);
		
		gbc_txtPrice.anchor = GridBagConstraints.NORTH;
		gbc_txtPrice.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPrice.insets = new Insets(0, 0, 5, 0);
		gbc_txtPrice.gridx = 4;
		gbc_txtPrice.gridy = 4;
		pnlBackg.add(txtPrice, gbc_txtPrice);
		
		gbc_lblCalibre.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblCalibre.gridwidth = 2;
		gbc_lblCalibre.insets = new Insets(0, 0, 5, 5);
		gbc_lblCalibre.gridx = 0;
		gbc_lblCalibre.gridy = 5;
		pnlBackg.add(lblCalibre, gbc_lblCalibre);
		
		gbc_txtCalibre.anchor = GridBagConstraints.SOUTH;
		gbc_txtCalibre.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtCalibre.insets = new Insets(0, 0, 5, 5);
		gbc_txtCalibre.gridx = 2;
		gbc_txtCalibre.gridy = 5;
		pnlBackg.add(txtCalibre, gbc_txtCalibre);
		
		gbc_lblBAMNr.anchor = GridBagConstraints.WEST;
		gbc_lblBAMNr.insets = new Insets(0, 0, 5, 5);
		gbc_lblBAMNr.gridx = 3;
		gbc_lblBAMNr.gridy = 5;
		pnlBackg.add(lblBAMNr, gbc_lblBAMNr);
		
		gbc_txtBAMNr.anchor = GridBagConstraints.NORTH;
		gbc_txtBAMNr.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtBAMNr.insets = new Insets(0, 0, 5, 0);
		gbc_txtBAMNr.gridx = 4;
		gbc_txtBAMNr.gridy = 5;
		pnlBackg.add(txtBAMNr, gbc_txtBAMNr);
		
		gbc_lblDim.anchor = GridBagConstraints.WEST;
		gbc_lblDim.gridwidth = 2;
		gbc_lblDim.insets = new Insets(0, 0, 5, 5);
		gbc_lblDim.gridx = 0;
		gbc_lblDim.gridy = 6;
		pnlBackg.add(lblDim, gbc_lblDim);
		
		gbc_txtDim.anchor = GridBagConstraints.NORTH;
		gbc_txtDim.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtDim.insets = new Insets(0, 0, 5, 5);
		gbc_txtDim.gridx = 2;
		gbc_txtDim.gridy = 6;
		pnlBackg.add(txtDim, gbc_txtDim);
		
		gbc_lblCat.anchor = GridBagConstraints.WEST;
		gbc_lblCat.gridwidth = 2;
		gbc_lblCat.insets = new Insets(0, 0, 5, 0);
		gbc_lblCat.gridx = 3;
		gbc_lblCat.gridy = 6;
		pnlBackg.add(lblCat, gbc_lblCat);
		
		gbc_txtCat.anchor = GridBagConstraints.NORTH;
		gbc_txtCat.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtCat.insets = new Insets(0, 0, 5, 0);
		gbc_txtCat.gridx = 4;
		gbc_txtCat.gridy = 6;
		pnlBackg.add(txtCat, gbc_txtCat);
		
		gbc_lblDesc.anchor = GridBagConstraints.WEST;
		gbc_lblDesc.insets = new Insets(0, 0, 5, 5);
		gbc_lblDesc.gridx = 0;
		gbc_lblDesc.gridy = 7;
		pnlBackg.add(lblDesc, gbc_lblDesc);
		
		gbc_pnlDesc.fill = GridBagConstraints.BOTH;
		gbc_pnlDesc.gridwidth = 5;
		gbc_pnlDesc.gridx = 0;
		gbc_pnlDesc.gridy = 8;
		
		btnBrowseImg.addActionListener(this);
		
		pnlBackg.add(pnlDesc, gbc_pnlDesc);
		pnlDesc.setLayout(new BorderLayout(0, 0));
		
		pnlDesc.add(txtADesc, BorderLayout.CENTER);
	}
	
	public static void displayArticle(FwcFwArticle article)
	{
		if(article instanceof FwcFwBattery)
		{
			txtName.setText(article.getName());
			txtWeigth.setText(String.valueOf(article.getWeight()));
			txtNEM.setText(String.valueOf(article.getNem()));
			txtPrice.setText(String.valueOf(article.getPrice()));
			txtCat.setText(String.valueOf(article.getDangerClass()));
			txtBurnLeng.setText(String.valueOf(((FwcFwBattery)article).getBurnLen()));
			txtEffektHeigth.setText(String.valueOf(((FwcFwBattery)article).getEffectHeight()));
			txtCalibre.setText(String.valueOf(((FwcFwBattery)article).getCaliber()));
			txtBAMNr.setText(article.getBamNr());
			txtDim.setText(article.getDim());
			txtProd.setText(article.getProducer());
		}
	}
	
	public static FwcFwArticle getArticleData()
	{
		String name = txtName.getText();
		String imgPath = txtImgPath.getText();
		String bamNr = txtBAMNr.getText();
		String producer = txtProd.getText();
		String dim = txtDim.getText();
		String desc = txtADesc.getText();
		int nem = parseInt(txtNEM.getText());
		int dangerClass = parseInt(txtCat.getText());
		double weight = parseDouble(txtWeigth.getText());
		double price = parseDouble(txtPrice.getText());
		int effectHeight = parseInt(txtEffektHeigth.getText());
		double caliber = parseDouble(txtCalibre.getText());
		double burnLen = parseDouble(txtBurnLeng.getText());
		
		return new FwcFwBattery(name, imgPath, bamNr, producer, dim, desc, nem,
			dangerClass, weight, price, effectHeight, caliber, burnLen);
	}
	
	private static double parseDouble(String val)
	{
		double ret = 0;
		if(val.matches("[-+]?[0-9]*\\.?[0-9]+([eE][-+]?[0-9]+)?"))
		{
			ret = Double.parseDouble(val);
		}
		return ret;
	}

	private static int parseInt(String val)
	{
		int ret = 0;
		if(val.matches("^\\d+$"))
		{
			ret = Integer.parseInt(val);
		}
		return ret;
	}

	public static void clear()
	{
		txtName.setText("");
		txtWeigth.setText("");
		txtNEM.setText("");
		txtPrice.setText("");
		txtCat.setText("");
		txtBurnLeng.setText("");
		txtEffektHeigth.setText("");
		txtCalibre.setText("");
		txtBAMNr.setText("");
		txtDim.setText("");
		txtProd.setText("");
		txtADesc.setText("");
		txtImgPath.setText("");
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		Object source = e.getSource();
		if(source instanceof JButton)
		{
			switch(((JButton)source).getActionCommand())
			{
				case STR_BROWSE:
					browseForImg();
					break;
			}
		}
	}

	private void browseForImg()
	{
		JFileChooser loadImg = new JFileChooser();
		loadImg.getActionMap().get("viewTypeDetails").actionPerformed(null);
		loadImg.setPreferredSize(new Dimension(600, 400));
		
		if(loadImg.showOpenDialog(this) == JFileChooser.APPROVE_OPTION)
		{
			txtImgPath.setText(loadImg.getSelectedFile().getAbsolutePath());
		}
	}
}