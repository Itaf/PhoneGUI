import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/**
 * A class that implements a JLabel to view numbers clicked on a phone keypad.
 * 
 * @author (Itaf O. Joudeh) 
 * @version (December 8, 2013)
 */
public class PhonePanel extends JPanel
{
    private JLabel label;
    private KeypadPanel KP;
    private JButton clearButton;
    private clearButtonListener cListener;
    private JButton contactListButton;
    private JButton addButton;
    
    public PhonePanel(PhonePanel pPanel)
    {
        this();
    }
    
    public PhonePanel()
    {
        setLayout(new BorderLayout());
        
        label = new JLabel(" ");
        add(label, BorderLayout.NORTH);
        
        contactListButton = new JButton("Contact List");
        add(contactListButton, BorderLayout.EAST);
        
        clearButton = new JButton("Clear");
        add(clearButton, BorderLayout.CENTER);
        
        cListener = new clearButtonListener(this);
        clearButton.addActionListener(cListener);
        
        addButton = new JButton("Add Contact");
        add(addButton, BorderLayout.WEST);
        
        KP = new KeypadPanel(this);
        add(KP, BorderLayout.SOUTH); 
    }
    
    public void refreshUI(String text)
    {
        label.setText(label.getText() + text);
    }
    
    public void clearUI()
    {
        label.setText(" ");
    }
}
