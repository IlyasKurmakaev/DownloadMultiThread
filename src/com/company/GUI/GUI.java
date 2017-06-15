package com.company.GUI;

import com.company.CreaterOfThread;
import com.company.StorageOfURL;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Map;

/**
 * Created by Lite on 15.06.2017.
 */
public class GUI extends JFrame {
    private JTextField fieldForURL = new JTextField(20);
    private JButton addURL = new JButton("Add URL");
    Handler handler = new Handler();
    private Map<String, Integer> downloadArray;
    private JPanel panelOfProgress = new JPanel();
    private JProgressBar progressBar= new JProgressBar();
    private StorageOfURL storageOfURL;
    public GUI(Map<String, Integer> downloadArray, String nameOfWindows, StorageOfURL storageOfURL)
    {
        super(nameOfWindows);
        this.storageOfURL = storageOfURL;
        this.downloadArray = downloadArray;
        addURL.addActionListener(handler);

        setLayout(new FlowLayout());
        addURL.setText("cat");
        add(addURL);
        add(fieldForURL);
//        add(progressBar);
//        progressBar.setStringPainted(true);
//        progressBar.setMinimum(0);
//        progressBar.setMaximum(100);
//        progressBar.setValue(35);
    }


    public class Handler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            synchronized (storageOfURL)
            {
                storageOfURL.setArray(fieldForURL.getText());
            }
            CreaterOfThread.createThread(storageOfURL, downloadArray);
        }
    }



}
