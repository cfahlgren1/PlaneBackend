package InfoPane;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
 
public class DetailsPane {
    public static void addComponentsToPane(Container pane) 
    {
        pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));
        
        //The Name Field
        JPanel namePanel = new JPanel();
        JLabel nameLabel = new JLabel("Name:");
        pane.add(nameLabel);
        JTextField name = new JTextField(15);
        namePanel.add(name);
        pane.add(namePanel);
        
        //Seat field
        JPanel seatPanel = new JPanel();
        JLabel seatLabel = new JLabel("Seats Booked:");
        JTextField seatBook = new JTextField(15);
        seatBook.setEditable(false);
        pane.add(seatLabel);
        seatPanel.add(seatBook);
        pane.add(seatPanel);
        
        //Address Field
        JPanel addressPanel = new JPanel();
        JLabel addressLabel = new JLabel("Address:");
        JTextField add = new JTextField(15);
        pane.add(addressLabel);
        addressPanel.add(add);
        pane.add(addressPanel);
        
        //Credit Card Field
        JPanel credPanel = new JPanel();
        JLabel creditLabel = new JLabel("Credit Card #:");
        JTextField cred = new JTextField(15);
        pane.add(creditLabel);
        credPanel.add(cred);
        pane.add(credPanel);
        
        //Save Button
        JPanel saveBut = new JPanel();
        JButton save = new JButton("Save"); 
        saveBut.add(save);
		pane.add(saveBut);

    }
      //Create the GUI and show it.
    static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("Details");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Set up the content pane.
        addComponentsToPane(frame.getContentPane());
        frame.setResizable(false);
        
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
    	frame.setLocation(dim.width/2-frame.getSize().width/2 - 410, dim.height/2-frame.getSize().height/2 - 350);
    	
        //Display the window.
        frame.setSize(300,300);
        frame.setVisible(true);
    }
 
    public static void main(String[] args) 
    {
        //Creating And Showing GUI
        javax.swing.SwingUtilities.invokeLater(new Runnable() 
        {
            public void run() 
            {
                createAndShowGUI();
            }
        });
    }
}