package de.gui;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.Date;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

import de.gui.comp.FwcMenuBar;
import de.gui.comp.FwcToolsPnl;
import de.gui.comp.FwcValuePnl;
import de.gui.comp.FwcViewPnl;
import de.proj.FwcProject;

public class FwcGui
{
	/** version-tag of {@link FwcGui} */
	private static final String VERSION = "V 1.2.3";
	/** Title of the {@link FwcGui} */
	private static String STR_FWC_TITLE = "Firework Creator " + VERSION;
	
	public static FwcProject project;
	private JFrame mainframe;

	/**
	 * Constructor to create a {@link FwcGui}.
	 * GUI controls all creator functions.
	 */
	public FwcGui()
	{
		loadLAF();
		init();
	}

	/**
	 * Method to load {@link NimbusLookAndFeel} into
	 * {@link UIManager}.
	 */
	private void loadLAF()
	{
		try
		{
			for(LookAndFeelInfo info : UIManager.getInstalledLookAndFeels())
			{
				if("Nimbus".equals(info.getName()))
				{
					UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		}
		catch(Exception e)
		{}
	}

	/**
	 * Method to initializes {@link FwcGui}
	 * <li> creates needed sub panes
	 */
	private void init()
	{
		mainframe = new JFrame(STR_FWC_TITLE);
		JMenuBar menuBar = new FwcMenuBar(this);
		JSplitPane splitMain = new JSplitPane();
		JSplitPane splitSub = new JSplitPane();
		JPanel pnlTools = new FwcToolsPnl(mainframe);
		JPanel pnlViewF = new FwcViewPnl();
		JPanel pnlValues = new FwcValuePnl();

		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		mainframe.setLayout(gridBagLayout);
		
		GridBagConstraints gbc_splitMain = new GridBagConstraints();
		gbc_splitMain.fill = GridBagConstraints.BOTH;
		gbc_splitMain.gridx = 0;
		gbc_splitMain.gridy = 0;
		
		splitMain.setRightComponent(splitSub);
		splitSub.setRightComponent(pnlValues);
		splitSub.setLeftComponent(pnlViewF);
		splitMain.setLeftComponent(pnlTools);
		splitSub.setOrientation(JSplitPane.VERTICAL_SPLIT);
		splitSub.setOneTouchExpandable(true);
		splitMain.setOneTouchExpandable(true);
		
		mainframe.setJMenuBar(menuBar);
		mainframe.add(splitMain, gbc_splitMain);

		mainframe.setVisible(true);
		mainframe.setSize(710, 500);
		mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void startPrj(String name)
	{
		if(project != null)
		{
			// TODO ask for saving opened project
		}
		Date d = new Date(System.currentTimeMillis());
		project = new FwcProject(name, d.toString(), d.toString());
		mainframe.setTitle(STR_FWC_TITLE + " Project: " + name);
	}

	public void savePrj()
	{
//		save.setFileFilter(new FileNameExtensionFilter(
//	        "Feuerwerk Creator Prokte", FwcProject.DEF_PRJ_EXT, FwcProject.DEF_PRJ_EXT));
		
		JFileChooser save = new JFileChooser();
		save.setAcceptAllFileFilterUsed(false);
		save.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);  
		save.getActionMap().get("viewTypeDetails").actionPerformed(null);
		save.setPreferredSize(new Dimension(600, 400));
		if(save.showSaveDialog(mainframe) == JFileChooser.APPROVE_OPTION)
		{
			try
			{
				project.saveProject(save.getSelectedFile());
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}

	public JFrame getMainFrm()
	{
		return mainframe;
	}

}