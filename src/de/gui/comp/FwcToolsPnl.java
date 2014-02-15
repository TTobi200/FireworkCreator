package de.gui.comp;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;

import de.fw.FwcFwBattery;
import de.gui.dialogs.FwcBaseDialog;
import de.gui.dialogs.FwcNewFwArtDialog;
import de.gui.dialogs.FwcNewProdDialog;

public class FwcToolsPnl extends JPanel implements ActionListener
{
	private static final long serialVersionUID = 1L;
	private static final String IMG_FOL_PATH = "img/";
	private static final String STR_PATH_ICO_REFRESH = IMG_FOL_PATH + "refresh.gif";
	private static final String STR_PATH_ICO_ADD = IMG_FOL_PATH + "add.png";
	private static final String STR_PATH_ICO_REMOVE = IMG_FOL_PATH + "remove.png";
	private static final String STR_PATH_ICO_UP = IMG_FOL_PATH + "up.png";
	private static final String STR_PATH_ICO_DOWN = IMG_FOL_PATH + "down.png";
	
	private static final String NODE_FIREWORK = "Feuerwerk";
	private static final String NODE_BATTERY = "Batterien";
	private static final String NODE_LIGHT_FIREWORK = "Leuchtfeuerwerk";
	private static final String NODE_CONNECTOR = "Verbinder";
	private static final String NODE_REMOTE_DETO = "Fernzünder";
	
	private static final String TITLE_PRODUCER_DIA = "Hersteller hinzufügen";
	private static final String TITLE_BAT_DIA = "Batterie hinzufügen";
	
	private JTree fwcTree;
	private DefaultMutableTreeNode root;
	private JButton btnRefresh;
	private JButton btnRemove;
	private JButton btnAdd;
	private JButton btnUp;
	private JButton btnDown;
	private JFrame mainframe;
	
	public FwcToolsPnl(JFrame mainframe)
	{
		this.mainframe = mainframe;
		initTree();
		init();
	}

	private void init()
	{
		ClassLoader l = this.getClass().getClassLoader();
		
		JToolBar toolBarTree = new JToolBar();
		fwcTree = new JTree(root);
		btnRefresh = new JButton(new ImageIcon(l.getResource(STR_PATH_ICO_REFRESH)));
		btnAdd = new JButton(new ImageIcon(l.getResource(STR_PATH_ICO_ADD)));
		btnRemove = new JButton(new ImageIcon(l.getResource(STR_PATH_ICO_REMOVE)));
		btnUp = new JButton(new ImageIcon(l.getResource(STR_PATH_ICO_UP)));
		btnDown = new JButton(new ImageIcon(l.getResource(STR_PATH_ICO_DOWN)));
		
		setLayout(new BorderLayout(0, 0));
		add(fwcTree, BorderLayout.CENTER);
		add(toolBarTree, BorderLayout.SOUTH);
		
		btnRefresh.addActionListener(this);
		btnAdd.addActionListener(this);
		btnRemove.addActionListener(this);
		btnUp.addActionListener(this);
		btnDown.addActionListener(this);
		
		toolBarTree.add(btnAdd);
		toolBarTree.add(btnRemove);
		toolBarTree.add(btnUp);
		toolBarTree.add(btnDown);
		toolBarTree.add(btnRefresh);	
	}
	
	private void initTree()
	{
		root = new DefaultMutableTreeNode(NODE_FIREWORK);
		DefaultMutableTreeNode battery = new DefaultMutableTreeNode(NODE_BATTERY);
		DefaultMutableTreeNode light = new DefaultMutableTreeNode(NODE_LIGHT_FIREWORK);
		DefaultMutableTreeNode connect = new DefaultMutableTreeNode(NODE_CONNECTOR);
		DefaultMutableTreeNode remDeto = new DefaultMutableTreeNode(NODE_REMOTE_DETO);
		
		root.add(battery);
		root.add(light);
		root.add(connect);
		root.add(remDeto);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		JButton source = (JButton)e.getSource();
		if(source == btnAdd)
		{
			addToTree();
		}
		else if(source == btnRemove)
		{
			
		}
		else if(source == btnRefresh)
		{
			refreshTree();
		}
		else if(source == btnDown)
		{
			
		}
		else if (source == btnUp)
		{
			
		}
	}

	private void addToTree()
	{
		TreePath selPath = fwcTree.getSelectionModel().getSelectionPath();
		String node = selPath.getLastPathComponent().toString();
		switch(node)
		{
			case NODE_FIREWORK:
				break;
				
			case NODE_BATTERY:
			case NODE_CONNECTOR:
			case NODE_LIGHT_FIREWORK:
			case NODE_REMOTE_DETO:
				addProd(selPath);
				break;

			default:
				addArticle(selPath, node);
				break;
		}
	}
	
	private void addProd(TreePath selPath)
	{
		FwcNewProdDialog newProd = new FwcNewProdDialog(mainframe, 
			selPath.getLastPathComponent().toString() + " " + TITLE_PRODUCER_DIA);
		if(newProd.showIt() == FwcNewProdDialog.APPROVE)
		{
			DefaultMutableTreeNode n = (DefaultMutableTreeNode)selPath.getLastPathComponent();
			n.add(new DefaultMutableTreeNode(newProd.getProdName()));
			refreshTree();
		}
	}
	
	private void addArticle(TreePath selPath, String node)
	{
		FwcNewFwArtDialog newProd = null;
		String art = selPath.getParentPath().getLastPathComponent().toString();
		switch(art)
		{
			case NODE_BATTERY:
			{
				newProd = new FwcNewFwArtDialog(mainframe,node + " " + TITLE_BAT_DIA);
				if(newProd.showIt() == FwcBaseDialog.APPROVE)
				{
					creBattery(selPath, newProd.getDataPnl());
				}
				break;
			}
			case NODE_CONNECTOR:
				break;
			case NODE_LIGHT_FIREWORK:
				break;
			case NODE_REMOTE_DETO:
				break;
		}
	}

	private void creBattery(TreePath selPath, FwcBatteryPropPnl dataPnl)
	{
		String name = dataPnl.getFwName();
		String bamNr = dataPnl.getFwBAMNr();
		String producer = dataPnl.getFwProd();
		String dim = dataPnl.getFwDim();
		String desc = dataPnl.getFwDesc();
		int nem = parseInt(dataPnl.getFwNEM());
		int dangerClass = parseInt(dataPnl.getFwCat());
		double weight = parseDouble(dataPnl.getFwWeigth());
		double price = parseDouble(dataPnl.getFwPrice());
		int effectHeight = parseInt(dataPnl.getFwEffektHeigth());
		double caliber = parseDouble(dataPnl.getFwCalibre());
		double burnLen = parseDouble(dataPnl.getFwBurnLeng());
		
		new FwcFwBattery(name, bamNr, producer, dim, desc, nem,
			dangerClass, weight, price, effectHeight, caliber, burnLen);
		
		DefaultMutableTreeNode n = (DefaultMutableTreeNode)selPath.getLastPathComponent();
		n.add(new DefaultMutableTreeNode(name));
		refreshTree();
	}
	
	private double parseDouble(String val)
	{
		double ret = 0;
		if(val.matches("[-+]?[0-9]*\\.?[0-9]+([eE][-+]?[0-9]+)?"))
		{
			ret = Double.parseDouble(val);
		}
		return ret;
	}

	private int parseInt(String val)
	{
		int ret = 0;
		if(val.matches("^\\d+$"))
		{
			ret = Integer.parseInt(val);
		}
		return ret;
	}

	private void refreshTree()
	{
		fwcTree.updateUI();
	}
}