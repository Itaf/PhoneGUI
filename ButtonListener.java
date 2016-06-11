import java.awt.event.*;
import javax.swing.*;

/**
 * SYSC 2004 Fall 2013 Lab 11 Solution
 * 
 * The listener for the dialling buttons (digits 0-9, plus * and #)
 * on a phone keypad.
 * 
 * @version December 2, 2013
 */
public class ButtonListener implements ActionListener
{   
    private PhonePanel pPanel;

    public ButtonListener(PhonePanel pPanel)
    {
        this.pPanel = pPanel;
    }
   
    public void actionPerformed(ActionEvent event)
    {
        /* Get a reference to the button that was clicked. */ 
        JButton button = (JButton) event.getSource();
        
        /* Get the text that is displayed on the button. */
        String key = button.getText();
        
        pPanel.refreshUI(key);
        
        System.out.println("The " + key + " key was clicked.");
    }
}
