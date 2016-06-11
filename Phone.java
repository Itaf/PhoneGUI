import java.util.ArrayList;
import java.awt.*;
import javax.swing.*;
/**
 * Write a description of class Phone here.
 * 
 * @author (Itaf O. Joudeh) 
 * @version (a version number or a date)
 */
public class Phone extends JPanel
{
    private ArrayList<Integer> numbers;
    
    public Phone()
    {
          
    }
    
    public void addContact(int num)
    {
        for(int i = 0; i < numbers.size(); i++)
        {
            if(numbers.get(i) == num)
            {
                return;
            }
        }
        numbers.add(num);
    }
}
