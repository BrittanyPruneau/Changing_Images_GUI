package changingImages;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

/**
 * @author Brittany Pruneau 
 * 
 * Runs a GUI application that displays a steam punk fantasy world where a man runs a machine and 
 * an air ship flows overhead. 
 */
public class DwellingGUI extends JFrame
{

	private JPanel contentPane;
	private JPanel DwellingChanges;

	/**
	 * Launchs the application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					DwellingGUI frame = new DwellingGUI();
					frame.setVisible(true);
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Creates the frame for which the JPanels are located. 
	 */
	public DwellingGUI()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		DwellingChanges = new DwellingChanges();
		contentPane.add(DwellingChanges, BorderLayout.CENTER);

		JPanel panel = cntrlPanel();
		contentPane.add(panel, BorderLayout.SOUTH);
	}

	/*
	 * Runs the functionality for each of five check boxes; which, open doors, 
	 * move a man, run a machine, fly an air ship, and change the background color. 
	 */
	private JPanel cntrlPanel()
	{
		JPanel cntrlPanel = new JPanel();
		cntrlPanel.setBorder(new EmptyBorder(0, 0, 0, 0));

		cntrlPanel.setLayout(new GridLayout(1, 0, 0, 0));
		
		JCheckBox chckbxWindow = new JCheckBox("Turn Lights On");
		chckbxWindow.setFont(new Font("Arial", Font.BOLD, 17));
		cntrlPanel.add(chckbxWindow);

		JCheckBox chckbxDoor = new JCheckBox("Open Door");
		chckbxDoor.setFont(new Font("Arial", Font.BOLD, 17));
		cntrlPanel.add(chckbxDoor);

		JCheckBox chckbxMachine = new JCheckBox("Run Machine");
		chckbxMachine.setFont(new Font("Arial", Font.BOLD, 17));
		cntrlPanel.add(chckbxMachine);
		
		JCheckBox chckbxChangeBackground = new JCheckBox("Change Background");
		chckbxChangeBackground.setFont(new Font("Arial", Font.BOLD, 17));
		cntrlPanel.add(chckbxChangeBackground);

		JButton btnChange = new JButton("Change");
		btnChange.setFont(new Font("Arial", Font.BOLD, 17));
		btnChange.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(chckbxDoor.isSelected())
				{
					((changingImages.DwellingChanges) DwellingChanges).updateDoor();
				}
				if(chckbxWindow.isSelected())
				{
					((changingImages.DwellingChanges) DwellingChanges).updateLights();
				}
				if(chckbxMachine.isSelected())
				{
					((changingImages.DwellingChanges) DwellingChanges).updateMachine();
				}
				if(chckbxChangeBackground.isSelected())
				{
					((changingImages.DwellingChanges) DwellingChanges).changeColor();
				}
				((changingImages.DwellingChanges) DwellingChanges).move();
			}
		});
		cntrlPanel.add(btnChange);
		return cntrlPanel;
	}
}
