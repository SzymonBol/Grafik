package print;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;


public class CNamesDialog extends JDialog{
    
    public CNamesDialog(JFrame owner, int prac){
        super(owner, "Wprowadź imiona", true);
        JTextPane[] names=new JTextPane[prac];
        JLabel[] labs=new JLabel[prac];
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(prac+1,2));
        for(int i=0; i<prac;i++){
            names[i]=new JTextPane();
            labs[i]=new JLabel("<html><div style='text-align: center;'>" + "Imie "+(i+1)+" :" + "</div></html>");
            panel.add(labs[i]);
            names[i].setBounds(5,100*i,10,10);
            names[i].setBorder(BorderFactory.createLineBorder(Color.black));
            names[i].setOpaque(false);
            panel.add(names[i]);
        }
        
        JButton ok = new JButton("OK");
        
        ok.addActionListener(event -> setVisible(false));
        panel.add(ok);
        add(panel, BorderLayout.CENTER);
        setSize(300,prac*50);
        setLocationRelativeTo(null);
    }
}
