package com.company;

import com.company.GUI.GUI;
import com.company.GUI.ManagerOfProress;
import com.company.GUI.ProgressPanel;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws InterruptedException {
         StorageOfURL storageOfURL = new StorageOfURL();
         Map<String,Integer> progressArray = new HashMap<>();
//          storageOfURL.setArray("http://goautomedia.cdn.on.net/gallery/peugeot/quartz/HIRES-QUARTZ_1409STYP005.jpg");
//          storageOfURL.setArray("http://goautomedia.cdn.on.net/gallery/peugeot/quartz/HIRES-QUARTZ_1409STYP005.jpg");
//          storageOfURL.setArray("http://goautomedia.cdn.on.net/gallery/peugeot/quartz/HIRES-QUARTZ_1409STYP005.jpg");
//          storageOfURL.setArray("http://goautomedia.cdn.on.net/gallery/peugeot/quartz/HIRES-QUARTZ_1409STYP005.jpg");
           storageOfURL.setArray("http://www.kartinki.me/pic/201409/2560x1600/kartinki.me-20929.jpg");
           storageOfURL.setArray("http://www.kartinki.me/pic/201409/2560x1600/kartinki.me-20929.jpg");
           storageOfURL.setArray("http://www.kartinki.me/pic/201409/2560x1600/kartinki.me-20929.jpg");
           storageOfURL.setArray("http://www.kartinki.me/pic/201409/2560x1600/kartinki.me-20929.jpg");

//         storageOfURL.setArray("http://jenskiyforum.ru/uploads/profile/photo-4024.jpg?_r=1474390599");
//         storageOfURL.setArray("http://jenskiyforum.ru/uploads/profile/photo-4024.jpg?_r=1474390599");
//         storageOfURL.setArray("http://jenskiyforum.ru/uploads/profile/photo-4024.jpg?_r=1474390599");
        for (int i = 0; i<10; i++ )
        {
            new Thread(new Run(storageOfURL, progressArray)).start();
        }
        GUI gui = new GUI(progressArray, "URL Downloader" , storageOfURL);
        gui.setVisible(true);
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setSize(300, 900);
       // gui.setResizable(false);
        gui.setLocationRelativeTo(null);


        ArrayList<ProgressPanel> arrayList = new ArrayList();



        while (true) {
            Thread.sleep(300);
            ManagerOfProress.refreshBars(progressArray, arrayList, gui);
        }


    }
}
