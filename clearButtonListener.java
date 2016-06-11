import java.awt.event.*;
import javax.swing.*;
/**
 * 
 * The listener for the clear button (Clear)on a phone keypad.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class clearButtonListener implements ActionListener
{   
    private PhonePanel pPanel;

    public clearButtonListener(PhonePanel pPanel)
    {
        this.pPanel = pPanel;
    }
   
    public void actionPerformed(ActionEvent event)
    {
        pPanel.clearUI();
    }
}
