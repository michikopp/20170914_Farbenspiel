package com.sabel;

import javax.swing.*;

public class Fenster extends JFrame{

    private JButton jbtnGreen;
    private JButton jbtnRed;
    private JButton jbtnBlue;
    private JPanel jPanel;
    private JLabel jLabel;
    private Object currentColor;

    public Fenster() {
        super("Farbenspiel");
        //this.setTitle("Mein erstes Fenster"); Titel kann entweder mit super oder mit setTitel gesetzt werden
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300,300);
        initComponents();
        this.setVisible(true);
    }

    private void initComponents(){
        jPanel = new JPanel();
        jLabel = new JLabel();
        jLabel.setAlignmentX(100);
        jLabel.setAlignmentY(100);
        jbtnGreen = new JButton("Green");
        jbtnRed = new JButton("Red");
        jbtnBlue = new JButton("Blue");
        this.jPanel.add(jbtnGreen); // Button liegt im Panel und Panel wiederum im Fenster
        this.jPanel.add(jbtnRed);
        this.jPanel.add(jbtnBlue);
        this.jPanel.add(jLabel);
        this.add(jPanel);
        jLabel.setText("Please choose your color");

    }
}
