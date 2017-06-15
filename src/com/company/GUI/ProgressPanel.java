package com.company.GUI;
import javax.swing.*;
import java.awt.*;
import java.util.Map;

/**
 * Created by Lite on 15.06.2017.
 */
public class ProgressPanel extends JPanel {
    public JProgressBar progressBar = new JProgressBar();
    public JLabel label = new JLabel();
    GUI gui;
    public ProgressPanel(String name, int progressInt, GUI gui)
    {
        this.gui = gui;
        gui.add(this);
        setLayout(new FlowLayout());
        label.setText(name + "   ");
        progressBar.setValue(progressInt);
        add(label);
        add(progressBar);
        progressBar.setStringPainted(true);
        progressBar.setMinimum(0);
        progressBar.setMaximum(100);
    }
}
