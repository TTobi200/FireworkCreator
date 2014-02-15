package de.gui.dialogs;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FwcNewProdDialog extends FwcBaseDialog
{
	private static final long serialVersionUID = 1L;
	private JTextField txtName;

	public FwcNewProdDialog(JFrame owner, String title)
	{
		super(owner, title);
		init(owner);
	}
	
	private void init(JFrame owner)
	{
		JLabel lblName = new JLabel("Name:");
		txtName = new JTextField();
		
		txtName.setBounds(67, 8, 357, 27);
		lblName.setBounds(0, 0, 434, 40);

		pnlData.add(lblName);
		pnlData.add(txtName);

		pnlData.setLayout(null);
		
		setSize(450, 115);
		setLocationRelativeTo(owner);
	}

	public Object getProdName()
	{
		return txtName.getText();
	}
}