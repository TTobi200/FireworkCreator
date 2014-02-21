package de.gui.comp;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class FwcValuePnl extends JPanel
{
	/** Default generated serialVersionUID */
	private static final long serialVersionUID = 1L;
	private static JTabbedPane tabbedPane;
	
	/**
	 * Constructor to create a {@link FwcValuePnl}
	 */
	public FwcValuePnl()
	{
		init();
	}

	/**
	 * Method to initializes the {@link FwcValuePnl}<br>
	 * adds
	 * <li> project tab
	 * <li> properties tab
	 * <li> remote detonator tab
	 */
	private void init()
	{
		setLayout(new BorderLayout(0, 0));

		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		
		tabbedPane.addTab("Projekt", null, new FwcPrjPnl(), null);
		tabbedPane.addTab("Fernzünder", null, new FwcRemDetPnl(), null);
		tabbedPane.addTab("Eigenschaften", null, FwcFwPropPnl.getInstance(), null);
		
		add(tabbedPane);		
	}
	
	public static void addPropPnl()
	{
		tabbedPane.addTab("Eigenschaften", null, FwcFwPropPnl.getInstance(), null);
		tabbedPane.setSelectedComponent(FwcFwPropPnl.getInstance());
	}
}