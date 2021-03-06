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
import java.awt.Toolkit;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.File;
import java.io.IOException;
import static java.lang.Integer.parseInt;
import java.nio.file.Paths;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import print.res.UniqueRandomNumber;

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
    boolean first=true;
    Calendar x_tmp;
    String[] employee_name;
    CTemplateFile tmpfile=new CTemplateFile();
    CTemplateFile dialog_file;
    JTextPane[] names;
    
    
    public Frame() {
        initComponents();
        Toolkit tk=getToolkit();
        Dimension size=tk.getScreenSize();
        setLocation(size.width/2-getWidth()/2,size.height/2-getHeight()/2);
        
        ImageIcon img1 = new ImageIcon(getClass().getResource("/print/res/up.png"), "");
        Image upimg =img1.getImage();
        Image modupimg=upimg.getScaledInstance(50, 20, java.awt.Image.SCALE_SMOOTH);
        img1=new ImageIcon(modupimg);
        up_mies.setIcon(img1);
        up_rok.setIcon(img1);
        
        ImageIcon img2 = new ImageIcon(getClass().getResource("/print/res/down.png"), "");
        Image downimg =img2.getImage();
        Image moddownimg=downimg.getScaledInstance(50, 20, java.awt.Image.SCALE_SMOOTH);
        img2=new ImageIcon(moddownimg);
        down_mies.setIcon(img2);
        down_rok.setIcon(img2);
        
        Lmies_num.setText(Integer.toString(Calendar.getInstance().get(Calendar.MONTH)+1));
        Lrok_num.setText(Integer.toString(Calendar.getInstance().get(Calendar.YEAR)));

        Tprac.setText("0");
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
        Lmies = new javax.swing.JLabel();
        Lrok = new javax.swing.JLabel();
        Lmies_num = new javax.swing.JLabel();
        Lrok_num = new javax.swing.JLabel();
        up_mies = new javax.swing.JLabel();
        down_mies = new javax.swing.JLabel();
        up_rok = new javax.swing.JLabel();
        down_rok = new javax.swing.JLabel();
        Lwolne1 = new javax.swing.JLabel();
        Lszablon = new javax.swing.JLabel();
        szablon_wyb = new javax.swing.JButton();
        szablon_wyb_dodaj = new javax.swing.JButton();
        minus_min_wolne = new javax.swing.JButton();
        min_wolne = new javax.swing.JTextField();
        plus_min_wolne = new javax.swing.JButton();
        plus_min_osob = new javax.swing.JButton();
        minus_min_osob = new javax.swing.JButton();
        min_osob = new javax.swing.JTextField();
        plus_pref_wolne = new javax.swing.JButton();
        minus_pref_wolne = new javax.swing.JButton();
        pref_wolne = new javax.swing.JTextField();
        plus_max_wolne = new javax.swing.JButton();
        minus_max_wolne = new javax.swing.JButton();
        max_wolne = new javax.swing.JTextField();
        plus_pref_osob = new javax.swing.JButton();
        minus_pref_osob = new javax.swing.JButton();
        pref_osob = new javax.swing.JTextField();
        plus_max_osob = new javax.swing.JButton();
        minus_max_osob = new javax.swing.JButton();
        max_osob = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Print = new javax.swing.JPanel();
        drukuj = new javax.swing.JButton();
        zapisz = new javax.swing.JButton();
        cofnij = new javax.swing.JButton();
        generuj = new javax.swing.JButton();
        R = new javax.swing.JLabel();
        twelve = new javax.swing.JLabel();
        P = new javax.swing.JLabel();
        W = new javax.swing.JLabel();
        Uw = new javax.swing.JLabel();
        Lfour = new javax.swing.JLabel();
        Og = new javax.swing.JLabel();
        add_template = new javax.swing.JButton();
        PanelToPrint = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        background.setLayout(new java.awt.CardLayout());

        Lpracownicy.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Lpracownicy.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lpracownicy.setText("Ilosc pracownikow");

        Lwolne.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Lwolne.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lwolne.setText("Ilosc dni wolnych");

        Bzatwierdz.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Bzatwierdz.setText("Zatwierdz");
        Bzatwierdz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BzatwierdzActionPerformed(evt);
            }
        });

        Tprac.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Tprac.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        Lmies.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Lmies.setText("Miesiac");

        Lrok.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Lrok.setText("Rok");

        Lmies_num.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Lmies_num.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lmies_num.setText("mies");

        Lrok_num.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Lrok_num.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lrok_num.setText("rok");

        up_mies.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                up_miesMousePressed(evt);
            }
        });

        down_mies.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                down_miesMousePressed(evt);
            }
        });

        up_rok.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                up_rokMousePressed(evt);
            }
        });

        down_rok.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                down_rokMousePressed(evt);
            }
        });

        Lwolne1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Lwolne1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lwolne1.setText("Liczba osób na zmianie");

        Lszablon.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Lszablon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lszablon.setText("Szablon:");

        szablon_wyb.setText("Wybierz szablon...");
        szablon_wyb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                szablon_wybActionPerformed(evt);
            }
        });

        szablon_wyb_dodaj.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        szablon_wyb_dodaj.setText("Dodaj szablon");
        szablon_wyb_dodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                szablon_wyb_dodajActionPerformed(evt);
            }
        });

        minus_min_wolne.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        minus_min_wolne.setText("-");
        minus_min_wolne.setMaximumSize(new java.awt.Dimension(30, 30));
        minus_min_wolne.setMinimumSize(new java.awt.Dimension(30, 30));
        minus_min_wolne.setPreferredSize(new java.awt.Dimension(45, 45));
        minus_min_wolne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minus_min_wolneActionPerformed(evt);
            }
        });

        min_wolne.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        min_wolne.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        min_wolne.setText("0");

        plus_min_wolne.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        plus_min_wolne.setText("+");
        plus_min_wolne.setMaximumSize(new java.awt.Dimension(30, 30));
        plus_min_wolne.setMinimumSize(new java.awt.Dimension(30, 30));
        plus_min_wolne.setPreferredSize(new java.awt.Dimension(45, 45));
        plus_min_wolne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plus_min_wolneActionPerformed(evt);
            }
        });

        plus_min_osob.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        plus_min_osob.setText("+");
        plus_min_osob.setMaximumSize(new java.awt.Dimension(30, 30));
        plus_min_osob.setMinimumSize(new java.awt.Dimension(30, 30));
        plus_min_osob.setPreferredSize(new java.awt.Dimension(45, 45));
        plus_min_osob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plus_min_osobActionPerformed(evt);
            }
        });

        minus_min_osob.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        minus_min_osob.setText("-");
        minus_min_osob.setMaximumSize(new java.awt.Dimension(30, 30));
        minus_min_osob.setMinimumSize(new java.awt.Dimension(30, 30));
        minus_min_osob.setPreferredSize(new java.awt.Dimension(45, 45));
        minus_min_osob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minus_min_osobActionPerformed(evt);
            }
        });

        min_osob.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        min_osob.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        min_osob.setText("0");

        plus_pref_wolne.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        plus_pref_wolne.setText("+");
        plus_pref_wolne.setMaximumSize(new java.awt.Dimension(30, 30));
        plus_pref_wolne.setMinimumSize(new java.awt.Dimension(30, 30));
        plus_pref_wolne.setPreferredSize(new java.awt.Dimension(45, 45));
        plus_pref_wolne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plus_pref_wolneActionPerformed(evt);
            }
        });

        minus_pref_wolne.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        minus_pref_wolne.setText("-");
        minus_pref_wolne.setMaximumSize(new java.awt.Dimension(30, 30));
        minus_pref_wolne.setMinimumSize(new java.awt.Dimension(30, 30));
        minus_pref_wolne.setPreferredSize(new java.awt.Dimension(45, 45));
        minus_pref_wolne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minus_pref_wolneActionPerformed(evt);
            }
        });

        pref_wolne.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pref_wolne.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pref_wolne.setText("0");

        plus_max_wolne.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        plus_max_wolne.setText("+");
        plus_max_wolne.setMaximumSize(new java.awt.Dimension(30, 30));
        plus_max_wolne.setMinimumSize(new java.awt.Dimension(30, 30));
        plus_max_wolne.setPreferredSize(new java.awt.Dimension(45, 45));
        plus_max_wolne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plus_max_wolneActionPerformed(evt);
            }
        });

        minus_max_wolne.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        minus_max_wolne.setText("-");
        minus_max_wolne.setMaximumSize(new java.awt.Dimension(30, 30));
        minus_max_wolne.setMinimumSize(new java.awt.Dimension(30, 30));
        minus_max_wolne.setPreferredSize(new java.awt.Dimension(45, 45));
        minus_max_wolne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minus_max_wolneActionPerformed(evt);
            }
        });

        max_wolne.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        max_wolne.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        max_wolne.setText("0");

        plus_pref_osob.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        plus_pref_osob.setText("+");
        plus_pref_osob.setMaximumSize(new java.awt.Dimension(30, 30));
        plus_pref_osob.setMinimumSize(new java.awt.Dimension(30, 30));
        plus_pref_osob.setPreferredSize(new java.awt.Dimension(45, 45));
        plus_pref_osob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plus_pref_osobActionPerformed(evt);
            }
        });

        minus_pref_osob.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        minus_pref_osob.setText("-");
        minus_pref_osob.setMaximumSize(new java.awt.Dimension(30, 30));
        minus_pref_osob.setMinimumSize(new java.awt.Dimension(30, 30));
        minus_pref_osob.setPreferredSize(new java.awt.Dimension(45, 45));
        minus_pref_osob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minus_pref_osobActionPerformed(evt);
            }
        });

        pref_osob.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pref_osob.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pref_osob.setText("0");

        plus_max_osob.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        plus_max_osob.setText("+");
        plus_max_osob.setMaximumSize(new java.awt.Dimension(30, 30));
        plus_max_osob.setMinimumSize(new java.awt.Dimension(30, 30));
        plus_max_osob.setPreferredSize(new java.awt.Dimension(45, 45));
        plus_max_osob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plus_max_osobActionPerformed(evt);
            }
        });

        minus_max_osob.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        minus_max_osob.setText("-");
        minus_max_osob.setMaximumSize(new java.awt.Dimension(30, 30));
        minus_max_osob.setMinimumSize(new java.awt.Dimension(30, 30));
        minus_max_osob.setPreferredSize(new java.awt.Dimension(45, 45));
        minus_max_osob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minus_max_osobActionPerformed(evt);
            }
        });

        max_osob.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        max_osob.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        max_osob.setText("0");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("min");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("max");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("pref");

        javax.swing.GroupLayout StartingPanelLayout = new javax.swing.GroupLayout(StartingPanel);
        StartingPanel.setLayout(StartingPanelLayout);
        StartingPanelLayout.setHorizontalGroup(
            StartingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, StartingPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(szablon_wyb_dodaj, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(Bzatwierdz, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
            .addGroup(StartingPanelLayout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addGroup(StartingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(StartingPanelLayout.createSequentialGroup()
                        .addComponent(Lszablon, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(szablon_wyb, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Lpracownicy, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Tprac, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(292, 292, 292))
                    .addGroup(StartingPanelLayout.createSequentialGroup()
                        .addGroup(StartingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(StartingPanelLayout.createSequentialGroup()
                                .addGroup(StartingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Lmies)
                                    .addComponent(up_mies, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(down_mies, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Lmies_num, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(117, 117, 117)
                                .addGroup(StartingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Lrok)
                                    .addComponent(up_rok, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(down_rok, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Lrok_num, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(StartingPanelLayout.createSequentialGroup()
                                .addGroup(StartingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Lwolne, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Lwolne1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25)
                                .addGroup(StartingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(StartingPanelLayout.createSequentialGroup()
                                        .addComponent(minus_min_osob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(min_osob, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(plus_min_osob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(minus_pref_osob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(pref_osob, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(plus_pref_osob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(StartingPanelLayout.createSequentialGroup()
                                        .addGroup(StartingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(StartingPanelLayout.createSequentialGroup()
                                                .addComponent(minus_min_wolne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(min_wolne, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(plus_min_wolne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(69, 69, 69)
                                                .addComponent(minus_pref_wolne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(StartingPanelLayout.createSequentialGroup()
                                                .addGap(52, 52, 52)
                                                .addComponent(jLabel1)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(StartingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addGroup(StartingPanelLayout.createSequentialGroup()
                                                .addComponent(pref_wolne, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(plus_pref_wolne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(66, 66, 66)
                                .addGroup(StartingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(StartingPanelLayout.createSequentialGroup()
                                        .addComponent(minus_max_osob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(max_osob, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(plus_max_osob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(StartingPanelLayout.createSequentialGroup()
                                        .addComponent(minus_max_wolne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(StartingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addGroup(StartingPanelLayout.createSequentialGroup()
                                                .addComponent(max_wolne, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(plus_max_wolne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                        .addContainerGap(303, Short.MAX_VALUE))))
        );
        StartingPanelLayout.setVerticalGroup(
            StartingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StartingPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(StartingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lszablon, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(szablon_wyb, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lpracownicy, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tprac, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addGroup(StartingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(StartingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lwolne, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minus_min_wolne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(min_wolne, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(plus_min_wolne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minus_pref_wolne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pref_wolne, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(plus_pref_wolne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minus_max_wolne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(max_wolne, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(plus_max_wolne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(StartingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lwolne1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minus_min_osob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(min_osob, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(plus_min_osob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minus_pref_osob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pref_osob, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(plus_pref_osob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minus_max_osob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(max_osob, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(plus_max_osob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(94, 94, 94)
                .addGroup(StartingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lmies)
                    .addComponent(Lrok))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(StartingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(up_rok, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(up_mies, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(StartingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lmies_num)
                    .addComponent(Lrok_num))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(StartingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(down_mies, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(down_rok, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(StartingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(szablon_wyb_dodaj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Bzatwierdz, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE))
                .addGap(24, 24, 24))
        );

        background.add(StartingPanel, "card2");

        drukuj.setText("Drukuj");
        drukuj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drukujActionPerformed(evt);
            }
        });

        zapisz.setText("Zapisz");
        zapisz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zapiszActionPerformed(evt);
            }
        });

        cofnij.setText("Cofnij");
        cofnij.setMaximumSize(new java.awt.Dimension(63, 23));
        cofnij.setMinimumSize(new java.awt.Dimension(63, 23));
        cofnij.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cofnijActionPerformed(evt);
            }
        });

        generuj.setText("Generuj");
        generuj.setMaximumSize(new java.awt.Dimension(63, 23));
        generuj.setMinimumSize(new java.awt.Dimension(63, 23));
        generuj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generujActionPerformed(evt);
            }
        });

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

        add_template.setText("Dodaj szablon");
        add_template.setMaximumSize(new java.awt.Dimension(63, 23));
        add_template.setMinimumSize(new java.awt.Dimension(63, 23));
        add_template.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_templateActionPerformed(evt);
            }
        });

        PanelToPrint.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout PanelToPrintLayout = new javax.swing.GroupLayout(PanelToPrint);
        PanelToPrint.setLayout(PanelToPrintLayout);
        PanelToPrintLayout.setHorizontalGroup(
            PanelToPrintLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 1293, Short.MAX_VALUE)
        );
        PanelToPrintLayout.setVerticalGroup(
            PanelToPrintLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelToPrintLayout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(524, Short.MAX_VALUE))
        );

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
                .addGap(141, 141, 141)
                .addComponent(cofnij, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(add_template, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(generuj, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(zapisz, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(drukuj, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                            .addComponent(R, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(twelve, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(P, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(PrintLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(W, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Uw, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Lfour, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Og, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PrintLayout.createSequentialGroup()
                        .addGroup(PrintLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(drukuj, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                            .addComponent(zapisz, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                            .addComponent(cofnij, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(generuj, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                            .addComponent(add_template, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE))
                        .addGap(36, 36, 36))))
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
        
        if(prac==Integer.parseInt(Tprac.getText()) && x_tmp.get(Calendar.YEAR)==Integer.parseInt(Lrok_num.getText()) && x_tmp.get(Calendar.MONTH)==(Integer.parseInt(Lmies_num.getText())-1)){
            zamien(Print);
        }
        else{
            if(!first){
                PanelToPrint.removeAll();
                PanelToPrint.repaint();
                PanelToPrint.revalidate();
            }
            first=false;
            zm_sn=0;
            for(int s=0;s<11;s++)
                sobniedz[s]=-1;
            prac=Integer.parseInt(Tprac.getText());
            int month=Integer.parseInt(Lmies_num.getText())-1;
            int year=Integer.parseInt(Lrok_num.getText());
        
            Calendar x1=new GregorianCalendar();
            Calendar x2=new GregorianCalendar();

            x1.set(year, month, 1,0,0);
            x2.set(year, month+1, 1,0,0);
            long diff=(x2.getTimeInMillis()-x1.getTimeInMillis())/86400000;
            days=(int)diff;
            int szer=1134/days;
        
            translate_month_add(x1.getTime());
            x_tmp=x1;
        
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
            names=new JTextPane[prac];
            employee_name= new String[prac];
            for(int i=0;i<prac;i++){
                names[i]=new JTextPane();
                StyledDocument doc = names[i].getStyledDocument();
                SimpleAttributeSet center = new SimpleAttributeSet();
                StyleConstants.setAlignment(center, StyleConstants.ALIGN_CENTER);
                doc.setParagraphAttributes(0, doc.getLength(), center, false);
                names[i].setBounds(10, (szer+10)*i+230, 100, szer+10);
                names[i].setBorder(BorderFactory.createLineBorder(Color.black));
                names[i].setMargin(new Insets(100,0,0,0));
                names[i].setOpaque(false);
                PanelToPrint.add(names[i]);
            }
            
            
            //szblony
            if(tmpfile.ok){
                int a=Integer.parseInt(Tprac.getText());
            if(a>tmpfile.options[0])
                a=tmpfile.options[0];
            for(int i=0;i<a;i++){
                names[i].setText(tmpfile.names[i]);
            }
            }
            
            
        
            PanelToPrint.add(jLabel9);

            color_sobniedz(labs);
            
            zamien(Print);
        }
        
    }//GEN-LAST:event_BzatwierdzActionPerformed

    private void drukujActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drukujActionPerformed
       printPanel(PanelToPrint);
    }//GEN-LAST:event_drukujActionPerformed

    private void up_miesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_up_miesMousePressed
        int x=Integer.parseInt(Lmies_num.getText());
        x+=1;
        if(x>12){
            int y=Integer.parseInt(Lrok_num.getText());
            y++;
            Lrok_num.setText(Integer.toString(y));
            x=1;
        }
        Lmies_num.setText(Integer.toString(x));
    }//GEN-LAST:event_up_miesMousePressed

    private void down_miesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_down_miesMousePressed
        int x=Integer.parseInt(Lmies_num.getText());
        x-=1;
        if(x<1){
            int y=Integer.parseInt(Lrok_num.getText());
            y--;
            Lrok_num.setText(Integer.toString(y));
            x=12;
        }
        Lmies_num.setText(Integer.toString(x));
    }//GEN-LAST:event_down_miesMousePressed

    private void up_rokMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_up_rokMousePressed
        int x=Integer.parseInt(Lrok_num.getText());
        x+=1;
        Lrok_num.setText(Integer.toString(x));
    }//GEN-LAST:event_up_rokMousePressed

    private void down_rokMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_down_rokMousePressed
        int x=Integer.parseInt(Lrok_num.getText());
        x-=1;
        Lrok_num.setText(Integer.toString(x));
    }//GEN-LAST:event_down_rokMousePressed

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

    private void zapiszActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zapiszActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_zapiszActionPerformed

    private void szablon_wyb_dodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_szablon_wyb_dodajActionPerformed
       if(Integer.parseInt(Tprac.getText())>0){
           dialog_file= new CTemplateFile(Integer.parseInt(Tprac.getText()),Integer.parseInt(min_wolne.getText()),
                   Integer.parseInt(pref_wolne.getText()),Integer.parseInt(max_wolne.getText()), Integer.parseInt(min_osob.getText()),
                   Integer.parseInt(pref_osob.getText()),Integer.parseInt(max_osob.getText()));
           JDialog dialog = new CNamesDialog(this,Integer.parseInt(Tprac.getText()),dialog_file);
           dialog.setVisible(true);
           if(dialog_file.ok){
               tmpfile=dialog_file;
               szablon_wyb.setText(tmpfile.filename);
           }
       }
        
    }//GEN-LAST:event_szablon_wyb_dodajActionPerformed

    private void minus_min_wolneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minus_min_wolneActionPerformed
       minus(min_wolne);
    }//GEN-LAST:event_minus_min_wolneActionPerformed

    private void plus_min_wolneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plus_min_wolneActionPerformed
       plus(min_wolne);
       if(Integer.parseInt(pref_wolne.getText())<Integer.parseInt(min_wolne.getText()))
           pref_wolne.setText(min_wolne.getText());
       if(Integer.parseInt(max_wolne.getText())<Integer.parseInt(min_wolne.getText()))
           max_wolne.setText(min_wolne.getText());
    }//GEN-LAST:event_plus_min_wolneActionPerformed

    private void plus_min_osobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plus_min_osobActionPerformed
       plus(min_osob);
       if(Integer.parseInt(pref_osob.getText())<Integer.parseInt(min_osob.getText()))
           pref_osob.setText(min_osob.getText());
       if(Integer.parseInt(max_osob.getText())<Integer.parseInt(min_osob.getText()))
           max_osob.setText(min_osob.getText());
    }//GEN-LAST:event_plus_min_osobActionPerformed

    private void minus_min_osobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minus_min_osobActionPerformed
       minus(min_osob);
    }//GEN-LAST:event_minus_min_osobActionPerformed

    private void plus_pref_wolneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plus_pref_wolneActionPerformed
       plus(pref_wolne);
       if(Integer.parseInt(max_wolne.getText())<Integer.parseInt(pref_wolne.getText()))
           max_wolne.setText(pref_wolne.getText());
    }//GEN-LAST:event_plus_pref_wolneActionPerformed

    private void minus_pref_wolneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minus_pref_wolneActionPerformed
       minus(pref_wolne);
       if(Integer.parseInt(min_wolne.getText())>Integer.parseInt(pref_wolne.getText()))
           min_wolne.setText(pref_wolne.getText());
    }//GEN-LAST:event_minus_pref_wolneActionPerformed

    private void plus_max_wolneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plus_max_wolneActionPerformed
       plus(max_wolne);
    }//GEN-LAST:event_plus_max_wolneActionPerformed

    private void minus_max_wolneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minus_max_wolneActionPerformed
       minus(max_wolne);
       if(Integer.parseInt(max_wolne.getText())<Integer.parseInt(min_wolne.getText()))
           min_wolne.setText(max_wolne.getText());
       if(Integer.parseInt(max_wolne.getText())<Integer.parseInt(pref_wolne.getText()))
           pref_wolne.setText(max_wolne.getText());
    }//GEN-LAST:event_minus_max_wolneActionPerformed

    private void plus_pref_osobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plus_pref_osobActionPerformed
       plus(pref_osob);
       if(Integer.parseInt(max_osob.getText())<Integer.parseInt(pref_osob.getText()))
           max_osob.setText(pref_osob.getText());
    }//GEN-LAST:event_plus_pref_osobActionPerformed

    private void minus_pref_osobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minus_pref_osobActionPerformed
        minus(pref_osob);
        if(Integer.parseInt(min_osob.getText())>Integer.parseInt(pref_osob.getText()))
           min_osob.setText(pref_osob.getText());
    }//GEN-LAST:event_minus_pref_osobActionPerformed

    private void plus_max_osobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plus_max_osobActionPerformed
        plus(max_osob);
    }//GEN-LAST:event_plus_max_osobActionPerformed

    private void minus_max_osobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minus_max_osobActionPerformed
        minus(max_osob);
        if(Integer.parseInt(pref_osob.getText())>Integer.parseInt(max_osob.getText()))
           pref_osob.setText(max_osob.getText());
        if(Integer.parseInt(max_osob.getText())<Integer.parseInt(min_osob.getText()))
           min_osob.setText(max_osob.getText());
    }//GEN-LAST:event_minus_max_osobActionPerformed

    private void szablon_wybActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_szablon_wybActionPerformed
        tmpfile.filechooser(this);
        if(tmpfile.ok){
            Tprac.setText(String.valueOf(tmpfile.options[0]));
            min_wolne.setText(String.valueOf(tmpfile.options[1]));
            pref_wolne.setText(String.valueOf(tmpfile.options[2]));
            max_wolne.setText(String.valueOf(tmpfile.options[3]));
            min_osob.setText(String.valueOf(tmpfile.options[4]));
            pref_osob.setText(String.valueOf(tmpfile.options[5]));
            max_osob.setText(String.valueOf(tmpfile.options[6]));
            szablon_wyb.setText(tmpfile.filename);
        }        
    }//GEN-LAST:event_szablon_wybActionPerformed

    private void cofnijActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cofnijActionPerformed
        zamien(StartingPanel);
    }//GEN-LAST:event_cofnijActionPerformed

    private void generujActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generujActionPerformed
        generate_twelve_blank();
    }//GEN-LAST:event_generujActionPerformed

    private void add_templateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_templateActionPerformed
        for(int i=0;i<prac;i++){
            employee_name[i]=names[i].getText();
        }
        dialog_file= new CTemplateFile(Integer.parseInt(Tprac.getText()),Integer.parseInt(min_wolne.getText()),
                   Integer.parseInt(pref_wolne.getText()),Integer.parseInt(max_wolne.getText()), Integer.parseInt(min_osob.getText()),
                   Integer.parseInt(pref_osob.getText()),Integer.parseInt(max_osob.getText()),employee_name);
        CNamesDialog dialog=new CNamesDialog(this,dialog_file);
        dialog.setVisible(true);
    }//GEN-LAST:event_add_templateActionPerformed

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
    private javax.swing.JLabel Lmies;
    private javax.swing.JLabel Lmies_num;
    private javax.swing.JLabel Lpracownicy;
    private javax.swing.JLabel Lrok;
    private javax.swing.JLabel Lrok_num;
    private javax.swing.JLabel Lszablon;
    private javax.swing.JLabel Lwolne;
    private javax.swing.JLabel Lwolne1;
    private javax.swing.JLabel Og;
    private javax.swing.JLabel P;
    private javax.swing.JPanel PanelToPrint;
    private javax.swing.JPanel Print;
    private javax.swing.JLabel R;
    private javax.swing.JPanel StartingPanel;
    private javax.swing.JTextField Tprac;
    private javax.swing.JLabel Uw;
    private javax.swing.JLabel W;
    private javax.swing.JButton add_template;
    private javax.swing.JPanel background;
    private javax.swing.JButton cofnij;
    private javax.swing.JLabel down_mies;
    private javax.swing.JLabel down_rok;
    private javax.swing.JButton drukuj;
    private javax.swing.JButton generuj;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField max_osob;
    private javax.swing.JTextField max_wolne;
    private javax.swing.JTextField min_osob;
    private javax.swing.JTextField min_wolne;
    private javax.swing.JButton minus_max_osob;
    private javax.swing.JButton minus_max_wolne;
    private javax.swing.JButton minus_min_osob;
    private javax.swing.JButton minus_min_wolne;
    private javax.swing.JButton minus_pref_osob;
    private javax.swing.JButton minus_pref_wolne;
    private javax.swing.JButton plus_max_osob;
    private javax.swing.JButton plus_max_wolne;
    private javax.swing.JButton plus_min_osob;
    private javax.swing.JButton plus_min_wolne;
    private javax.swing.JButton plus_pref_osob;
    private javax.swing.JButton plus_pref_wolne;
    private javax.swing.JTextField pref_osob;
    private javax.swing.JTextField pref_wolne;
    private javax.swing.JButton szablon_wyb;
    private javax.swing.JButton szablon_wyb_dodaj;
    private javax.swing.JLabel twelve;
    private javax.swing.JLabel up_mies;
    private javax.swing.JLabel up_rok;
    private javax.swing.JButton zapisz;
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
        
    
    private void minus(JTextField tx){
        int tmp = Integer.parseInt(tx.getText())-1;
        if(tmp>=0){
            tx.setText(Integer.toString(tmp));
        }
    }
    
        private void plus(JTextField tx){
        int tmp = Integer.parseInt(tx.getText())+1;
        if(tmp<=15){
            tx.setText(Integer.toString(tmp));
        }
    }
        
    void generate_twelve_blank(){
        int[][] gen_tab= new int[prac][7];
        for(int i=0;i<prac;i++){
            for(int j=0;j<7;j++){
                if(tab[i][j].zmlogic!=-1)
                    gen_tab[i][j]=tab[i][j].zmlogic;
                else
                    gen_tab[i][j]=-1;
                //System.out.print(gen_tab[i][j]);
            }
        }
        
        //ustalanie pierwszej niedzieli
        int prac_na_zmianie=Integer.parseInt(pref_osob.getText());
        int wol_na_dzien=prac-prac_na_zmianie;
        if(wol_na_dzien==0){
            for(int i=0;i<prac;i++){
                for(int j=0;j<7;j++){
                    if(gen_tab[i][j]==-1)
                        gen_tab[i][j]=1;
                }
            }
        }
        else{
            // 7 zamienic na days
            int wol_prac_w_mies=(7*(prac-prac_na_zmianie))/prac;
            int prac_z_nadwyzka_wol=(7*(prac-prac_na_zmianie))%prac;
            UniqueRandomNumber urn =new UniqueRandomNumber(prac); 
            // 6 to dni pon-sob (testowo)
            UniqueRandomNumber urn2 =new UniqueRandomNumber(6);
            CWorker[] workers=new CWorker[prac];
            for(int i=0;i<prac;i++){
                workers[i]=new CWorker(wol_prac_w_mies);
            }
            
            //losowanie osob z nadwyzka wolnych
            for(int i=0;i<prac_z_nadwyzka_wol;i++){
                workers[urn.Value()].wolne=wol_prac_w_mies+1;                
            }
            
            //tu powinen byc algorytm losujacy
            urn.ZeroNext();
            
            for(CWorker x:workers){
                System.out.print(x.wolne+" ");
            }
            
            /*
            //pierwsza niedziala wolne
            for(int x=0;x<wol_na_dzien;x++)
                gen_tab[urn.Value()][sobniedz[1]]=3;
            
            //cala reszta w niedziele pracujaca
            for(int i=0;i<prac;i++){
                if(gen_tab[i][sobniedz[1]]==-1)
                    gen_tab[i][sobniedz[1]]=1;
            }
            
            //reszta pracownikow wolne losowo w inne dni
            for(int i=0;i<prac-wol_na_dzien;i++){
                gen_tab[urn.Value()][urn2.Value()]=3;
            }
            
            // 1 gdzie nie ma 3 
            for(int i=0;i<prac;i++){
                for(int j=0;j<7;j++){
                    if(gen_tab[i][j]==-1)
                        gen_tab[i][j]=1;
                }
            }
            */
        }
        
        //wyswietlanie
        for(int i=0;i<prac;i++){
            for(int j=0;j<7;j++){
                System.out.print(gen_tab[i][j]);
            }
            System.out.println();
        }
    }
        
}

