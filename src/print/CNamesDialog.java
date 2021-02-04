package print;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;


public class CNamesDialog extends JDialog{
    
    public CNamesDialog(JFrame owner, int prac, CTemplateFile file){
        super(owner, "Wprowadź imiona", true);
        JTextPane[] names=new JTextPane[prac];
        JLabel[] labs=new JLabel[prac];
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(prac+2,2));
        panel.add(new JLabel("Nazwa szablonu:"));
        JTextPane filename=new JTextPane();
        panel.add(filename);
        
        for(int i=0; i<prac;i++){
            names[i]=new JTextPane();
            labs[i]=new JLabel("<html><div style='text-align: center;'>"+(i+1)+" Imie i nazwisko :" + "</div></html>");
            panel.add(labs[i]);
            names[i].setBounds(5,100*i,10,10);
            names[i].setBorder(BorderFactory.createLineBorder(Color.black));
            names[i].setOpaque(false);
            panel.add(names[i]);
        }
        
        JButton ok = new JButton("OK");
        CTemplateFile ae=file;
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
                
            }

            private void okActionPerformed(ActionEvent evt) {
                ae.filename=filename.getText();
                for(int i=0;i<prac;i++){   
                   ae.names[i]=names[i].getText();
                }
                crateString();
                ae.ok=true;
                setVisible(false);
                
            }

            private void crateString() {
                try {
                    FileWriter writer = new FileWriter(filename.getText()+".txt");
                    for(int i=0;i<7;i++){
                        writer.write(Integer.toString(ae.options[i])+"\n");
                    }
                    for(int j=0;j<ae.options[0];j++){
                         writer.write(names[j].getText()+"\n");
                    }
                    writer.close();
                    
                } catch (IOException ex) {
                    Logger.getLogger(CNamesDialog.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        panel.add(ok);
        add(panel, BorderLayout.CENTER);
        setSize(300,prac*70+70);
        setLocationRelativeTo(null);
    }
    
    public CNamesDialog(JFrame owner, CTemplateFile ctmp){
        super(owner, "Wprowadź nazwę szblonu", true);
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2,2));
        panel.add(new JLabel("Nazwa szablonu:"));
        JTextPane filename=new JTextPane();
        panel.add(filename);
        JButton ok = new JButton("OK");
        CTemplateFile ae=ctmp;
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
                
            }

            private void okActionPerformed(ActionEvent evt) {
                ae.filename=filename.getText();
                crateString();
                ae.ok=true;
                setVisible(false);
                
            }

            private void crateString() {
                try {
                    FileWriter writer = new FileWriter(filename.getText()+".txt");
                    for(int i=0;i<7;i++){
                        writer.write(Integer.toString(ae.options[i])+"\n");
                    }
                    for(int j=0;j<ae.options[0];j++){
                         writer.write(ae.names[j]+"\n");
                    }
                    writer.close();
                    
                } catch (IOException ex) {
                    Logger.getLogger(CNamesDialog.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        panel.add(ok);
        add(panel, BorderLayout.CENTER);
        setSize(300,140);
        setLocationRelativeTo(null);
    }
}
