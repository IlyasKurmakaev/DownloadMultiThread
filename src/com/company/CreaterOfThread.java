package com.company;

import java.util.Map;

/**
 * Created by Lite on 15.06.2017.
 */
public class CreaterOfThread {
    public static void createThread(StorageOfURL storageOfURL, Map<String,Integer> progressArray)
    {
        new Thread(new Run(storageOfURL, progressArray)).start();
    }
}
