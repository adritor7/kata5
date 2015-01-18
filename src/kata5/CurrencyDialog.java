/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kata5;

import javax.swing.JComboBox;
import javax.swing.JPanel;

/**
 *
 * @author aitor
 */
public class CurrencyDialog  extends JPanel{
  
    public CurrencyDialog(){
        super();
        add(createComboBox());
    }
    
     private JComboBox createComboBox(){
         return new JComboBox(new String[] {"EUR","USD","GBP"});
         
    }
    
}
