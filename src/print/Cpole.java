/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package print;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 *
 * @author REDBUL
 */
public class Cpole {
    int zmlogic=0;
    int zm=0;
    JLabel j=new JLabel();
//    String[] zm={"R","P","W"," "};
    int nextval=0;     
    Cpole(){
        j.setBorder(BorderFactory.createLineBorder(Color.black));
        j.setHorizontalAlignment(SwingConstants.CENTER);
        j.setVerticalAlignment(SwingConstants.CENTER);
        j.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mousePressed(java.awt.event.MouseEvent evt) {
            zmiana();
        }});
    }
    
    public void zmiana(){
        switch(zm){
            case 0: j.setText("R");break;
            case 1: j.setText("12");break;
            case 2: j.setText("P");break;
            case 3: j.setText("W");break;
            case 4: j.setText("Uw");break;
            case 5: j.setText("L4");break;
            case 6: j.setText("Og");break;
            case 7: break;
        }
//        zmlogic=1;
//        j.setText(zm[nextval]);
//        nextval++;
//        if(nextval>3){ nextval=0; zmlogic=0;}
    }
    
}
