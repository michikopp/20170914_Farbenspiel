package com.sabel;

import com.sun.org.apache.regexp.internal.RE;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Fenster extends JFrame{

    private JButton jbtnGreen;
    private JButton jbtnRed;
    private JButton jbtnBlue;
    private JPanel jPanel;


    public Fenster() {
        super("Farbenspiel");
        //this.setTitle("Mein erstes Fenster"); Titel kann entweder mit super oder mit setTitel gesetzt werden
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300,300);
        initComponents();
        this.initEvents();
        this.setVisible(true);
    }

    private void initEvents() {
        jbtnRed.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jPanel.setBackground(Color.RED);
            }
        });

        jbtnGreen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jPanel.setBackground(Color.GREEN);
            }
        });

        jbtnBlue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jPanel.setBackground(Color.BLUE);
            }
        });
    }

    private void initComponents(){
        jPanel = new JPanel();
        jbtnGreen = new JButton("Green");
        jbtnRed = new JButton("Red");
        jbtnBlue = new JButton("Blue");
        this.jPanel.add(jbtnGreen); // Button liegt im Panel und Panel wiederum im Fenster
        this.jPanel.add(jbtnRed);
        this.jPanel.add(jbtnBlue);
        this.add(jPanel);


    }
}
