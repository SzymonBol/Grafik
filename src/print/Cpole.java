/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package print;

import java.awt.Color;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 *
 * @author REDBUL
 */
public class Cpole {
    int zmlogic=-1;
    int zm=7;
    JLabel j=new JLabel();
    int nextval=0;     
    Cpole(){
        j.setBorder(BorderFactory.createLineBorder(Color.black));
        j.setHorizontalAlignment(SwingConstants.CENTER);
        j.setVerticalAlignment(SwingConstants.CENTER);
        j.setOpaque(true);
        j.setBackground(Color.white);
        j.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mousePressed(MouseEvent evt) {
            if(evt.getButton() == MouseEvent.BUTTON3)
            {
                j.setText(" ");
                zmlogic=-1;
            }
            else    
                zmiana();
        }});
    }
    
    public void zmiana(){
        switch(zm){
            case 0: j.setText("R");break;
            case 1: j.setText("12");break;
            case 2: j.setText("P");break;
            case 3: j.setText("<html><font color=\"red\">W</font></html>");break;
            case 4: j.setText("Uw");break;
            case 5: j.setText("L4");break;
            case 6: j.setText("Og");break;
            case 7: break;
        }
        zmlogic=zm;
    }
    
}
