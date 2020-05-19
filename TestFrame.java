package com.company;
import javax.swing.*;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TestFrame extends JFrame {
    private JTextField textField;
    public TestFrame() {
        super("TestFrame");
        createGUI();

    }
    public void createGUI() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        JButton button1 = new JButton("Transpose");
//button1.setActionCommand("Button 1 was pressed!");
        panel.add(button1);

        JButton button2 = new JButton("Myltiply number");
//button2.setActionCommand("Button 2 was pressed!");
        panel.add(button2);

        JButton button3 = new JButton("Multiply matrices");
//button3.setActionCommand("Button 3 was pressed!");
        panel.add(button3);

        JButton button4 = new JButton("Sum matrices");
//button3.setActionCommand("Button 3 was pressed!");
        panel.add(button4);

        ActionListener actionListener = new TestActionListener();

        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Computation.transpose();
            }
        });
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Computation.multiplication_number();

            }
        });

        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Computation.multiplication_matrix();

            }
        });
        button4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Computation.sum_matrix();

            }
        });

        getContentPane().add(panel);
        setPreferredSize(new Dimension(320, 100));
    }

    public class TestActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            textField.setText(e.getActionCommand());
        }
    }

}