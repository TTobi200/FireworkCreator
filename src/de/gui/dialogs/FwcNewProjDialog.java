package de.gui.dialogs;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FwcNewProjDialog extends FwcBaseDialog
{
	private static final long serialVersionUID = 1L;
	private JTextField txtName;

	public FwcNewProjDialog(JFrame owner, String title)
	{
		super(owner, title);
		init(owner);
	}

	private void init(JFrame owner)
	{
		JLabel lblName = new JLabel("Name:");
		txtName = new JTextField();
		
		lblName.setBounds(10, 11, 46, 21);
		txtName.setBounds(88, 8, 291, 24);

		pnlData.add(lblName);
		pnlData.add(txtName);
		
		pnlData.setLayout(null);
		setSize(403, 151);
		setLocationRelativeTo(owner);
	}

	public String getPrjName()
	{
		return txtName.getText();
	}
}