package changingImages;
import java.awt.BorderLayout;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import guiImagePanel.ImagePanel;

/**
 * @author Brittany Pruneau 
 * 
 * Displays a steam punk fantasy world where a man runs a machine and an air ship is flown using check boxes and a button.  
 */
@SuppressWarnings("serial")
public class DwellingChanges extends JPanel
{
	private JLabel lblSteamPunkHouse;
	private Color[] colors = {Color.ORANGE, Color.BLUE, Color.RED, Color.BLACK};
	private int colorIndex = 0;
	private int x = -300;
	private int y = 470;
	private int incrementLight = 0;
	private int incrementDoor = 0;
	private int incrementMachine = 0;
	private ImageIcon icon = new ImageIcon(
			DwellingChanges.class.getResource("/changingImages/FairyImages/SteamPunkHouse1.png"));
	private ImageIcon icon2 = new ImageIcon(
			DwellingChanges.class.getResource("/changingImages/FairyImages/ForeGroundClouds.png"));
	private ImageIcon icon3 = new ImageIcon(
			DwellingChanges.class.getResource("/changingImages/FairyImages/Cloud.png"));
	private ImageIcon icon4 = new ImageIcon(
			DwellingChanges.class.getResource("/changingImages/FairyImages/landInSky.png"));	
	private ImageIcon airShipIcon = new ImageIcon(
			DwellingChanges.class.getResource("/changingImages/AirShipImages/AirShip.png"));
	
	/*
	 * Sends in the Jlabel lblSteamPunkHouse required to make changes within the JFrame. 
	 */
	public DwellingChanges()
	{
		lblSteamPunkHouse = createLabelSteamPunkHouse(); 
		add(lblSteamPunkHouse, BorderLayout.CENTER);     
	}
	
	/*
	 * Creates the Jlabel lblSteamPunkHouse required to make image changes within the JFrame. 
	 */
	private JLabel createLabelSteamPunkHouse()
	{
		JLabel lblSteamPunkHouse = new JLabel(); 
		return lblSteamPunkHouse; 
	}
	
	/*
	 * Changes the background color. 
	 */
	public void changeColor()    
	{
		colorIndex = ++colorIndex % colors.length; 										
		setBackground(colors[colorIndex]);
	}
	
	/*
	 * Causes the air ship to move. 
	 */
	public void move()
	{
		x+= 10;  
		y-=10;
		repaint();    
	}
	
	/*
	 * Causes the machine to run and smoke to blow out. 
	 */
	public void updateMachine()
	{
		if(incrementMachine==6)
		{
			incrementMachine = 0;
		}
		incrementMachine = incrementMachine +1; 

		if(incrementMachine==1)
		{
			this.icon = new ImageIcon(
					DwellingChanges.class.getResource("/changingImages/MachineImages/MachineOn.png"));

		}
		if(incrementMachine==2)
		{
			this.icon = new ImageIcon(
					DwellingChanges.class.getResource("/changingImages/MachineImages/MachineOn2.png"));

		}
		if(incrementMachine==3)
		{
			this.icon = new ImageIcon(
					DwellingChanges.class.getResource("/changingImages/MachineImages/MachineOn3.png"));
		}
		if(incrementMachine==4)
		{
			this.icon = new ImageIcon(
					DwellingChanges.class.getResource("/changingImages/MachineImages/MachineOn4.png"));
		}
		if(incrementMachine==5)
		{
			this.icon = new ImageIcon(
					DwellingChanges.class.getResource("/changingImages/MachineImages/MachineOn5.png"));
		}
		if(incrementMachine==6)
		{
			this.icon = new ImageIcon(
					DwellingChanges.class.getResource("/changingImages/MachineImages/MachineOn6.png"));
		}
		repaint();
	}

	/*
	 * Turns individual lights on. 
	 */
	public void updateLights()
	{
		if(incrementLight==3)
		{
			incrementLight = 0;
		}
		incrementLight = incrementLight +1; 
		if(incrementLight==1)
		{
			this.icon = new ImageIcon(
					DwellingChanges.class.getResource("/changingImages/LightsImages/LightsOn.png"));
		}
		if(incrementLight==2)
		{
			this.icon = new ImageIcon(
					DwellingChanges.class.getResource("/changingImages/LightsImages/LightsOnA.png"));
		}
		if(incrementLight==3)
		{
			this.icon = new ImageIcon(
					DwellingChanges.class.getResource("/changingImages/LightsImages/LightsOnBB.png"));
		}
		repaint();
	}
	
	/*
	 * Opens a door and a man comes out to run the machine. 
	 */
	public void updateDoor()
	{
		if(incrementDoor == 8)
		{
			incrementDoor = 0;
		}
		incrementDoor = incrementDoor +1; 
		
		if(incrementDoor==1)
		{
			this.icon = new ImageIcon(
					DwellingChanges.class.getResource("/changingImages/DoorImages/DoorA.png"));
		}
		if(incrementDoor==2)
		{
			this.icon = new ImageIcon(
					DwellingChanges.class.getResource("/changingImages/DoorImages/DoorB.png"));
		}
		if(incrementDoor==3)
		{
			this.icon = new ImageIcon(
					DwellingChanges.class.getResource("/changingImages/DoorImages/DoorC.png"));
		}
		if(incrementDoor==4)
		{
			this.icon = new ImageIcon(
					DwellingChanges.class.getResource("/changingImages/DoorImages/DoorD.png"));
		}
		if(incrementDoor==5)
		{
			this.icon = new ImageIcon(
					DwellingChanges.class.getResource("/changingImages/DoorImages/DoorE.png"));
		}
		if(incrementDoor==6)
		{
			this.icon = new ImageIcon(
					DwellingChanges.class.getResource("/changingImages/DoorImages/DoorF.png"));
		}
		if(incrementDoor==7)
		{
			this.icon = new ImageIcon(
					DwellingChanges.class.getResource("/changingImages/DoorImages/DoorG.png"));
		}
		if(incrementDoor==8)
		{
			this.icon = new ImageIcon(
					DwellingChanges.class.getResource("/changingImages/DoorImages/DoorH.png"));
		}
		repaint();
	}

	/*
	 * Paints images on the screen. 
	 */
	@Override
	protected void paintComponent(Graphics g)   
	{
		super.paintComponent(g);
		
		setBackground(colors[colorIndex]);     
		this.icon.paintIcon(this, g, 50, 120);    
		this.icon2.paintIcon(this, g, 00, -50);    
		this.icon3.paintIcon(this, g, 1150, -50);   
		this.icon4.paintIcon(this, g, 000, 370);
		this.airShipIcon.paintIcon(this, g, x, y);	
	}
}
