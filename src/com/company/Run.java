package com.company;

import javax.swing.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.rmi.MarshalledObject;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;


/**
 * Created by Lite on 12.06.2017.
 */


public class Run implements Runnable {
    private StorageOfURL storageOfURL;
    private String URLString = "";
    private boolean notEpmptyArray = false;     // false - пустой, true - не пустой
    private int numOfIndexOfFile = 0;
    private Map<String, Integer> runProgressArray;

    public Run(StorageOfURL storageOfURL, Map<String, Integer> runProgressArray) {
        this.storageOfURL = storageOfURL;
        this.runProgressArray = runProgressArray;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (storageOfURL) {
                if (!storageOfURL.getList().isEmpty()) {
                    notEpmptyArray = true;
                    URLString = storageOfURL.getArray(0);
                    storageOfURL.removeURL(0);
                    numOfIndexOfFile = storageOfURL.getNumOfFile();
                    storageOfURL.setNumOfFile(numOfIndexOfFile + 1);
                } else {
                    notEpmptyArray = false; // то пустой
                }
            }


            //URLString = storageOfURL.getArray(storageOfURL.getList().size() - 1);
            if (notEpmptyArray == true) {
                try {
                    URL url = new URL(URLString);
                    InputStream stream = url.openStream();
                    FileOutputStream fileOutputStream = new FileOutputStream("test" + numOfIndexOfFile + ".jpg");
                    byte buffer[] = new byte[1024];
                    int size;
                    int iteration = 0;           // progress
                    double onePercent = 0;       // progress
                    double alreadyDownloaded = 0;   // progress
                    int progress = 0;
                    onePercent = url.openConnection().getContentLength() / 100; //progress
                    while ((size = stream.read(buffer)) != -1) {
                        alreadyDownloaded += size;  //progress
                        progress = (int) (alreadyDownloaded / onePercent); //progress
                        System.out.println("progress= " + progress); //progress
                            if ( (progress%2 )==0)
                            {
                                synchronized (runProgressArray)
                                {
                                    runProgressArray.put("test" + numOfIndexOfFile + ".jpg", progress);
                                }
                                System.out.println(progress);
                            }

                        fileOutputStream.write(buffer, 0, size);
                    }
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    fileOutputStream.close();
                    synchronized (runProgressArray)
                    {
                        runProgressArray.remove("test" + numOfIndexOfFile + ".jpg", progress);
                    }
                    System.out.println("Файл записан");
                } catch (FileNotFoundException e) {
                    JOptionPane.showMessageDialog(null, "Багет, файл не найден");
                    break;
                } catch (IOException e) {
                    JOptionPane.showMessageDialog(null, "Багет, ошибка ввода-вывода");
                    break;
                }

            } else {
                System.out.println("лист пуст");
                break;
            }
        }
        System.out.println("выход из потока");
    }
}