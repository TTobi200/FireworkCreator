package de.gui.comp.tools;

import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

import javax.swing.JComponent;
import javax.swing.JTree;
import javax.swing.TransferHandler;
import javax.swing.tree.DefaultMutableTreeNode;

import de.fw.FwcFwArticle;
import de.gui.comp.FwcArtNode;

public class FwcArtTransfHandler extends TransferHandler
{
	private static final long serialVersionUID = 1L;
	
	public final static DataFlavor fwcArtFlavor = new DataFlavor(FwcFwArticle.class, "fwcArticle");
	DataFlavor[] artFLavour = new DataFlavor[]{ fwcArtFlavor };

	@Override
	protected Transferable createTransferable(JComponent c)
	{
		final JTree tree = (JTree)c;
		Transferable transferable = new Transferable()
		{
			@Override
			public DataFlavor[] getTransferDataFlavors()
			{
				return artFLavour;
			}

			@Override
			public boolean isDataFlavorSupported(DataFlavor flavor)
			{
				return artFLavour[0].equals(flavor);
			}

			@Override
			public Object getTransferData(DataFlavor flavor)
				throws UnsupportedFlavorException, IOException
			{
				DefaultMutableTreeNode selN = (DefaultMutableTreeNode)tree.getLastSelectedPathComponent();
				FwcFwArticle article = null;
				if(selN instanceof FwcArtNode)
				{
					article = ((FwcArtNode)tree.getLastSelectedPathComponent()).getArticle();
				}
				return article;
			}
		};
		return transferable;
	}

	@Override
	public int getSourceActions(JComponent c)
	{
		return COPY;
	}
}