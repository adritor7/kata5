/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kata5;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Currency;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author aitor
 */
class MoneyCalculatorFrame extends JFrame {

    public MoneyCalculatorFrame() {
        setTitle("MoneyCalculator");
        setMinimumSize(new Dimension(300,300));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        createComponents();
        setVisible(true);
    }       

    private void createComponents() {
        add(createExchangeDialog());
        add(createToolbar(),BorderLayout.SOUTH);
    }

    private Component createToolbar(){
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        panel.add(CreateCalculateButton());
        panel.add(CreateCancelButton());
        return panel;
    }
    
    private Component createExchangeDialog(){
        JPanel panel = new JPanel(new FlowLayout());
        panel.add(new MoneyDialog());
        panel.add(new CurrencyDialog());
        return panel;
    }
     private JButton CreateCalculateButton(){
        JButton calculate = new JButton("calculate");
        calculate.addActionListener(new ActionListener() {

             @Override
             public void actionPerformed(ActionEvent e) {
                 System.out.println("calculating......");
             }
         });
        return calculate;
    }
     private JButton CreateCancelButton(){
        JButton cancel = new JButton("cancel");
        cancel.addActionListener(new ActionListener() {

             @Override
             public void actionPerformed(ActionEvent ae) {
                MoneyCalculatorFrame.this.dispose();
             }
         });
        return cancel;
      
    }
         

    
    
}
