/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package print;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Insets;
import java.awt.List;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.print.PageFormat;
import static java.awt.print.PageFormat.LANDSCAPE;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.standard.OrientationRequested;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author REDBUL
 */
public class Frame extends javax.swing.JFrame{
    
    int rp=0;
    boolean[] clicked={false,false,false,false,false,false,false};
    int lastclicked=-1;
    int prac;
    int days;
    Cpole[][] tab=new Cpole[prac][days];
    Color myGray=new Color(240,240,240);
    Color myBlue=new Color(128,206,212);
    int[] sobniedz={-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
    int zm_sn=0;
    
    public Frame() {
        initComponents();
        
        Toolkit tk=getToolkit();
        Dimension size=tk.getScreenSize();
        setLocation(size.width/2-getWidth()/2,size.height/2-getHeight()/2);
        
        ImageIcon img1 = new ImageIcon(getClass().getResource("/print/res/up.png"), "");
        Image upimg =img1.getImage();
        Image modupimg=upimg.getScaledInstance(50, 20, java.awt.Image.SCALE_SMOOTH);
        img1=new ImageIcon(modupimg);
        jLabel5.setIcon(img1);
        jLabel7.setIcon(img1);
        
        ImageIcon img2 = new ImageIcon(getClass().getResource("/print/res/down.png"), "");
        Image downimg =img2.getImage();
        Image moddownimg=downimg.getScaledInstance(50, 20, java.awt.Image.SCALE_SMOOTH);
        img2=new ImageIcon(moddownimg);
        jLabel6.setIcon(img2);
        jLabel8.setIcon(img2);
        
        jLabel3.setText(Integer.toString(Calendar.getInstance().get(Calendar.MONTH)+1));
        jLabel4.setText(Integer.toString(Calendar.getInstance().get(Calendar.YEAR)));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        StartingPanel = new javax.swing.JPanel();
        Lpracownicy = new javax.swing.JLabel();
        Lwolne = new javax.swing.JLabel();
        Bzatwierdz = new javax.swing.JButton();
        Tprac = new javax.swing.JTextField();
        Twol = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Print = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        PanelToPrint = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        R = new javax.swing.JLabel();
        twelve = new javax.swing.JLabel();
        P = new javax.swing.JLabel();
        W = new javax.swing.JLabel();
        Uw = new javax.swing.JLabel();
        Lfour = new javax.swing.JLabel();
        Og = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        background.setLayout(new java.awt.CardLayout());

        Lpracownicy.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lpracownicy.setText("Ilosc pracownikow");

        Lwolne.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lwolne.setText("Ilosc dni wolnych");

        Bzatwierdz.setText("Zatwierdz");
        Bzatwierdz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BzatwierdzActionPerformed(evt);
            }
        });

        Tprac.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        Twol.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel1.setText("Miesiac");

        jLabel2.setText("Rok");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("mies");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("rok");

        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel5MousePressed(evt);
            }
        });

        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel6MousePressed(evt);
            }
        });

        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel7MousePressed(evt);
            }
        });

        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel8MousePressed(evt);
            }
        });

        javax.swing.GroupLayout StartingPanelLayout = new javax.swing.GroupLayout(StartingPanel);
        StartingPanel.setLayout(StartingPanelLayout);
        StartingPanelLayout.setHorizontalGroup(
            StartingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, StartingPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Bzatwierdz, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
            .addGroup(StartingPanelLayout.createSequentialGroup()
                .addGroup(StartingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(StartingPanelLayout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(StartingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Lwolne, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Lpracownicy, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(StartingPanelLayout.createSequentialGroup()
                                .addGroup(StartingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                                .addGap(54, 54, 54)
                                .addGroup(StartingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Tprac, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(StartingPanelLayout.createSequentialGroup()
                        .addGap(317, 317, 317)
                        .addComponent(Twol, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(852, Short.MAX_VALUE))
        );
        StartingPanelLayout.setVerticalGroup(
            StartingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StartingPanelLayout.createSequentialGroup()
                .addContainerGap(89, Short.MAX_VALUE)
                .addGroup(StartingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lpracownicy, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tprac, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                .addGap(61, 61, 61)
                .addGroup(StartingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(StartingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(StartingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(StartingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(101, 101, 101)
                .addGroup(StartingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Twol, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lwolne, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(Bzatwierdz, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        background.add(StartingPanel, "card2");

        jButton3.setText("Drukuj");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setText("Generuj");
        jButton2.setMaximumSize(new java.awt.Dimension(63, 23));
        jButton2.setMinimumSize(new java.awt.Dimension(63, 23));

        jButton1.setText("Cofnij");
        jButton1.setMaximumSize(new java.awt.Dimension(63, 23));
        jButton1.setMinimumSize(new java.awt.Dimension(63, 23));

        PanelToPrint.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout PanelToPrintLayout = new javax.swing.GroupLayout(PanelToPrint);
        PanelToPrint.setLayout(PanelToPrintLayout);
        PanelToPrintLayout.setHorizontalGroup(
            PanelToPrintLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 1278, Short.MAX_VALUE)
        );
        PanelToPrintLayout.setVerticalGroup(
            PanelToPrintLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelToPrintLayout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(488, Short.MAX_VALUE))
        );

        R.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        R.setText("R");
        R.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        R.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                RMousePressed(evt);
            }
        });

        twelve.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        twelve.setText("12");
        twelve.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        twelve.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                twelveMousePressed(evt);
            }
        });

        P.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        P.setText("P");
        P.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        P.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PMousePressed(evt);
            }
        });

        W.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        W.setText("W");
        W.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        W.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                WMousePressed(evt);
            }
        });

        Uw.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Uw.setText("Uw");
        Uw.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Uw.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                UwMousePressed(evt);
            }
        });

        Lfour.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lfour.setText("L4");
        Lfour.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Lfour.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                LfourMousePressed(evt);
            }
        });

        Og.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Og.setText("Og");
        Og.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Og.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                OgMousePressed(evt);
            }
        });

        javax.swing.GroupLayout PrintLayout = new javax.swing.GroupLayout(Print);
        Print.setLayout(PrintLayout);
        PrintLayout.setHorizontalGroup(
            PrintLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrintLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(PrintLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PrintLayout.createSequentialGroup()
                        .addComponent(R, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(P, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(twelve, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PrintLayout.createSequentialGroup()
                        .addComponent(W, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Uw, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Lfour, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Og, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
            .addComponent(PanelToPrint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PrintLayout.setVerticalGroup(
            PrintLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrintLayout.createSequentialGroup()
                .addComponent(PanelToPrint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PrintLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PrintLayout.createSequentialGroup()
                        .addGroup(PrintLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36))
                    .addGroup(PrintLayout.createSequentialGroup()
                        .addGroup(PrintLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(R, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(twelve, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(P, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(PrintLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(W, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Uw, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Lfour, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Og, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        background.add(Print, "card2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void zamien(JPanel p){
        background.removeAll();
        background.repaint();
        background.revalidate();
        
        background.add(p);
        background.repaint();
        background.revalidate();
    }
    
    
    private void BzatwierdzActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BzatwierdzActionPerformed
        prac=Integer.parseInt(Tprac.getText());
        int wol=Integer.parseInt(Twol.getText());
        int month=Integer.parseInt(jLabel3.getText())-1;
        int year=Integer.parseInt(jLabel4.getText());
        
        Calendar x1=new GregorianCalendar();
        Calendar x2=new GregorianCalendar();

        x1.set(year, month, 1,0,0);
        x2.set(year, month+1, 1,0,0);
        long diff=(x2.getTimeInMillis()-x1.getTimeInMillis())/86400000;
        days=(int)diff;
        int szer=1134/days;
        
        translate_month_add(x1.getTime());
        
        JLabel[] labs=new JLabel[days];
        
        //daty
        for(int i=0;i<days;i++){
        x1.set(year, month, i+1);
        labs[i]=new JLabel();
        labs[i].setOpaque(true);
        labs[i].setBackground(Color.white);
        labs[i].setBorder(BorderFactory.createLineBorder(Color.black));
        labs[i].setHorizontalAlignment(SwingConstants.CENTER);
        labs[i].setVerticalAlignment(SwingConstants.CENTER);
        labs[i].setText("<html>"+Integer.toString(i+1)+"<br/>"+translate_day_add(x1.getTime(),i)+"</html>");
        labs[i].setBounds(szer*i+110, 180, szer, szer+10);
        PanelToPrint.add(labs[i]);
        }
        
        
     //   Cpole[][] tab=new Cpole[prac][days];
        tab=new Cpole[prac][days];
        //kratki
        for(int i=0;i<prac;i++){
            for(int j=0;j<days;j++){
                tab[i][j]=new Cpole();
                tab[i][j].j.setBounds(szer*j+110, (szer+10)*i+230, szer, szer+10);
                PanelToPrint.add(tab[i][j].j);
            }
        }
        
        //imiona
        JTextArea[] names=new JTextArea[prac];
        for(int i=0;i<prac;i++){
            names[i]=new JTextArea();
            names[i].setBounds(10, (szer+10)*i+230, 100, szer+10);
            names[i].setBorder(BorderFactory.createLineBorder(Color.black));
            names[i].setLineWrap(true);
            names[i].setWrapStyleWord(true);
            names[i].setMargin(new Insets(100,0,0,0));
            names[i].setOpaque(false);
            PanelToPrint.add(names[i]);
        }
        

        color_sobniedz(labs);
        
        zamien(Print);
    }//GEN-LAST:event_BzatwierdzActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       printPanel(PanelToPrint);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jLabel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MousePressed
        int x=Integer.parseInt(jLabel3.getText());
        x+=1;
        if(x>12){
            int y=Integer.parseInt(jLabel4.getText());
            y++;
            jLabel4.setText(Integer.toString(y));
            x=1;
        }
        jLabel3.setText(Integer.toString(x));
    }//GEN-LAST:event_jLabel5MousePressed

    private void jLabel6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MousePressed
        int x=Integer.parseInt(jLabel3.getText());
        x-=1;
        if(x<1){
            int y=Integer.parseInt(jLabel4.getText());
            y--;
            jLabel4.setText(Integer.toString(y));
            x=12;
        }
        jLabel3.setText(Integer.toString(x));
    }//GEN-LAST:event_jLabel6MousePressed

    private void jLabel7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MousePressed
        int x=Integer.parseInt(jLabel4.getText());
        x+=1;
        jLabel4.setText(Integer.toString(x));
    }//GEN-LAST:event_jLabel7MousePressed

    private void jLabel8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MousePressed
        int x=Integer.parseInt(jLabel4.getText());
        x-=1;
        jLabel4.setText(Integer.toString(x));
    }//GEN-LAST:event_jLabel8MousePressed

    private void RMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RMousePressed
        change(0);
    }//GEN-LAST:event_RMousePressed

    private void twelveMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_twelveMousePressed
        change(1);
    }//GEN-LAST:event_twelveMousePressed

    private void PMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PMousePressed
        change(2);
    }//GEN-LAST:event_PMousePressed

    private void WMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WMousePressed
        change(3);
    }//GEN-LAST:event_WMousePressed

    private void UwMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UwMousePressed
        change(4);
    }//GEN-LAST:event_UwMousePressed

    private void LfourMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LfourMousePressed
        change(5);
    }//GEN-LAST:event_LfourMousePressed

    private void OgMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OgMousePressed
       change(6);
    }//GEN-LAST:event_OgMousePressed

    private void printPanel(JPanel jpanel){
        PrinterJob printerjob=PrinterJob.getPrinterJob();
        printerjob.setJobName("Grafik");
        PageFormat pageFormat=printerjob.defaultPage();
        pageFormat.setOrientation(PageFormat.LANDSCAPE);
        printerjob.setPrintable(new Printable() {
            @Override
            public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
                if(pageIndex>0){
                    return Printable.NO_SUCH_PAGE;
                }
                
                Graphics2D g2d = (Graphics2D) graphics;
                g2d.translate(pageFormat.getImageableX(),pageFormat.getImageableY());
                
                g2d.scale(0.67,0.8);
                
                jpanel.print(g2d);
                return Printable.PAGE_EXISTS;
                
            }
        });
        
        boolean returningresult=printerjob.printDialog();
        if(returningresult){
            try{
                printerjob.print();
            }catch(PrinterException printerexception){
                JOptionPane.showMessageDialog(this,"error");
            }
        }
       
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame().setVisible(true);
            }
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bzatwierdz;
    private javax.swing.JLabel Lfour;
    private javax.swing.JLabel Lpracownicy;
    private javax.swing.JLabel Lwolne;
    private javax.swing.JLabel Og;
    private javax.swing.JLabel P;
    private javax.swing.JPanel PanelToPrint;
    private javax.swing.JPanel Print;
    private javax.swing.JLabel R;
    private javax.swing.JPanel StartingPanel;
    private javax.swing.JTextField Tprac;
    private javax.swing.JTextField Twol;
    private javax.swing.JLabel Uw;
    private javax.swing.JLabel W;
    private javax.swing.JPanel background;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel twelve;
    // End of variables declaration//GEN-END:variables

    private void translate_month_add(Date x1) {
        int a=x1.getMonth();
        switch (a){
            case 0: {jLabel9.setText("Styczeń"); break;}
            case 1: {jLabel9.setText("Luty"); break;}
            case 2: {jLabel9.setText("Marzec"); break;}
            case 3: {jLabel9.setText("Kwiecień"); break;}
            case 4: {jLabel9.setText("Maj"); break;}
            case 5: {jLabel9.setText("Czerwiec"); break;}
            case 6: {jLabel9.setText("Lipiec"); break;}
            case 7: {jLabel9.setText("Sierpień"); break;}
            case 8: {jLabel9.setText("Wrzesień"); break;}
            case 9: {jLabel9.setText("Październik"); break;}
            case 10: {jLabel9.setText("Listopad"); break;}
            case 11: {jLabel9.setText("Grudzień"); break;}      
        }   
    }
    
    private String translate_day_add(Date x1,int i){
        int a=x1.getDay();
        switch (a){
            case 0: {sobniedz[zm_sn]=i;zm_sn++;return "Nied";}
            case 1: {return "Pon";}
            case 2: {return "Wt";}
            case 3: {return "Śr";}
            case 4: {return "Czw";}
            case 5: {return "Pt";}
            case 6: {sobniedz[zm_sn]=i;zm_sn++;return "Sob";}
            default: return " ";
        }
    }

    private void zmiany(int a){
        for(int i=0;i<prac;i++){
            for(int j=0;j<days;j++){
                tab[i][j].zm=a;
            }
            }
    }

    private void change(int a){
        JLabel temp;
        switch (a){
            case 0:temp=R;break;
            case 1:temp=twelve;break;
            case 2:temp=P;break;
            case 3:temp=W;break;
            case 4:temp=Uw;break;
            case 5:temp=Lfour;break;
            case 6:temp=Og;break;
            default: temp=R;break;
        }
        
        temp.setOpaque(true);
        if(lastclicked==-1){
            lastclicked=a;
            zmiany(a);
            temp.setBackground(Color.GREEN);
        }
        else if(lastclicked==a){
            zmiany(7);
            temp.setBackground(myGray);
            lastclicked=-1;
        }
        else{
            JLabel temp2;
            switch (lastclicked){
            case 0:temp2=R;break;
            case 1:temp2=twelve;break;
            case 2:temp2=P;break;
            case 3:temp2=W;break;
            case 4:temp2=Uw;break;
            case 5:temp2=Lfour;break;
            case 6:temp2=Og;break;
            default: temp2=R;break;
        }
            temp2.setBackground(myGray);
            lastclicked=a;
            temp.setBackground(Color.GREEN);
            zmiany(a);
        }
    }
    
        private void color_sobniedz(JLabel[] labs){
            int i=0;
            while(sobniedz[i]!=-1){
                labs[sobniedz[i]].setBackground(myBlue);
                for(int j=0;j<prac;j++)
                    tab[j][sobniedz[i]].j.setBackground(myBlue);
                i++;
            }
    }
}

