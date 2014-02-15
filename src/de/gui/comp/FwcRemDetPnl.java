package de.gui.comp;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FwcRemDetPnl extends JPanel implements MouseListener
{
	private static final long serialVersionUID = 1L;
	
	private static final String BTN_FIRE_ALL = "btnFireAll";
	private static final String BTN_SEQUENCER = "btnSequencer";
	private static final String BTN_ON_OF_SWITCH = "OnOffSwitch";
	private static final String BTN_ONE = "btnOne";
	private static final String BTN_TWO = "btnTwo";
	private static final String BTN_THREE = "btnThree";
	private static final String BTN_FOUR = "btnFour";
	private static final String BTN_FIVE = "btnFive";
	private static final String BTN_SIX = "btnSix";
	private static final String BTN_SEVEN = "btnSeven";
	private static final String BTN_EIGHT = "btnEight";
	private static final String BTN_NINE = "btnNine";
	private static final String BTN_TEN = "btnTen";
	private static final String BTN_ELEVEN = "btnEleven";
	private static final String BTN_TWELVE = "btnTwelve";
	
	private Image remoDet;
	private Image ledOn;
	private Image on;
	private Map<Rectangle, String> btns;
	private boolean isOn;
	private boolean isLaunching;
	
	public FwcRemDetPnl()
	{
		try
		{
			init();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

	private void init() throws IOException
	{
		btns = new HashMap<>();
		ClassLoader l = this.getClass().getClassLoader();
		remoDet = ImageIO.read(l.getResource("img/remoteCtr.png"));
		ledOn = ImageIO.read(l.getResource("img/ledOn.png"));
		on = ImageIO.read(l.getResource("img/on.png"));
		
		JTextField txtDistr = new JTextField();
		txtDistr.setBounds(400, 170,30, 23);
		
		creStdBtn(BTN_FIRE_ALL, 94, 244);
		creStdBtn(BTN_SEQUENCER, 91, 306);
		
		creStdBtn(BTN_ON_OF_SWITCH, 101, 150, 45, 50);
		
		creStdBtn(BTN_ONE, 159, 243);
		creStdBtn(BTN_TWO, 212, 239);
		creStdBtn(BTN_THREE, 264, 242);
		creStdBtn(BTN_FOUR, 317, 243);
		creStdBtn(BTN_FIVE, 370, 242);
		creStdBtn(BTN_SIX, 420, 244);
		
		creStdBtn(BTN_SEVEN, 159, 300);
		creStdBtn(BTN_EIGHT, 212, 295);
		creStdBtn(BTN_NINE, 263, 301);
		creStdBtn(BTN_TEN, 317, 298);
		creStdBtn(BTN_ELEVEN, 370, 297);
		creStdBtn(BTN_TWELVE, 420, 299);
		
		add(txtDistr);
		setLayout(null);
		addMouseListener(this);
	}
	
	private void creStdBtn(String name, int x, int y)
	{
		creStdBtn(name, x, y, 30, 30);
	}
	
	private void creStdBtn(String name, int x, int y, int width, int height)
	{
		Rectangle btnFireAll = new Rectangle(x, y, width, height);
		btns.put(btnFireAll, name);
	}

	@Override
	public void paint(Graphics g)
	{
		super.paint(g);
		g.drawImage(remoDet, 0, 0, null);
		if(isOn)
		{
			g.drawImage(ledOn, 206, 193, null);
			g.drawImage(on, 101, 150, null);
		}
		if(isLaunching)
		{
			g.drawImage(ledOn, 319, 192, null);
		}
	}

	@Override
	public void mouseClicked(MouseEvent e)
	{}

	@Override
	public void mouseEntered(MouseEvent e)
	{}

	@Override
	public void mouseExited(MouseEvent e)
	{}

	@Override
	public void mousePressed(MouseEvent e)
	{
		doAction(getButton(e.getX(), e.getY()), true);
	}

	@Override
	public void mouseReleased(MouseEvent e)
	{
		System.out.println(e.getX()+ ", " + e.getY());
		System.out.println(getButton(e.getX(), e.getY()));
		
		doAction(getButton(e.getX(), e.getY()), false);
		isLaunching = false;
	}

	private void doAction(String button, boolean pressed)
	{
		switch(button)
		{
			case BTN_ONE:
			case BTN_TWO:
			case BTN_THREE:
			case BTN_FOUR:
			case BTN_FIVE:
			case BTN_SIX:
			case BTN_SEVEN:
			case BTN_EIGHT:
			case BTN_NINE:
			case BTN_TEN:
			case BTN_ELEVEN:
			case BTN_TWELVE:
			case BTN_FIRE_ALL:
				if(isOn)
					isLaunching = !isLaunching;
				break;
			
			case BTN_ON_OF_SWITCH:
				if(!pressed)
					isOn = !isOn;
				break;
		}
		repaint();
	}

	private String getButton(int x, int y)
	{
		for(Rectangle b : btns.keySet())
		{
			if(b.contains(x, y))
			{
				return btns.get(b);
			}
		}
		
		return "";
	}
}