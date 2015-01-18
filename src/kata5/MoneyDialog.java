/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kata5;

import java.awt.FlowLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author aitor
 */
public class MoneyDialog extends JPanel{
    
    public MoneyDialog(){
        super(new FlowLayout());
        add(createTextEdit());
        add(new CurrencyDialog());
    }
    private JTextField createTextEdit(){
        return new JTextField(10);
    }
    
}
