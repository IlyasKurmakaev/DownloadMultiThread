package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lite on 12.06.2017.
 */
public class StorageOfURL {
    private List<String> array = new ArrayList();
    public StorageOfURL()
    {
        setArray("http://www.kartinki.me/pic/201409/2560x1600/kartinki.me-20929.jpg");
        setArray("http://www.kartinki.me/pic/201409/2560x1600/kartinki.me-20929.jpg");
        setArray("http://www.kartinki.me/pic/201409/2560x1600/kartinki.me-20929.jpg");
        setArray("http://www.kartinki.me/pic/201409/2560x1600/kartinki.me-20929.jpg");
        setArray("http://www.kartinki.me/pic/201409/2560x1600/kartinki.me-20929.jpg");
        setArray("http://www.kartinki.me/pic/201409/2560x1600/kartinki.me-20929.jpg");
        setArray("http://www.kartinki.me/pic/201409/2560x1600/kartinki.me-20929.jpg");
        setArray("http://www.kartinki.me/pic/201409/2560x1600/kartinki.me-20929.jpg");
        setArray("http://www.kartinki.me/pic/201409/2560x1600/kartinki.me-20929.jpg");
        setArray("http://www.kartinki.me/pic/201409/2560x1600/kartinki.me-20929.jpg");
        setArray("http://www.kartinki.me/pic/201409/2560x1600/kartinki.me-20929.jpg");
        setArray("http://www.kartinki.me/pic/201409/2560x1600/kartinki.me-20929.jpg");
        setArray("http://www.kartinki.me/pic/201409/2560x1600/kartinki.me-20929.jpg");
        setArray("http://www.kartinki.me/pic/201409/2560x1600/kartinki.me-20929.jpg");
        setArray("http://www.kartinki.me/pic/201409/2560x1600/kartinki.me-20929.jpg");
        setArray("http://www.kartinki.me/pic/201409/2560x1600/kartinki.me-20929.jpg");
        setArray("http://www.kartinki.me/pic/201409/2560x1600/kartinki.me-20929.jpg");
        setArray("http://www.kartinki.me/pic/201409/2560x1600/kartinki.me-20929.jpg");
        setArray("http://www.kartinki.me/pic/201409/2560x1600/kartinki.me-20929.jpg");
        setArray("http://www.kartinki.me/pic/201409/2560x1600/kartinki.me-20929.jpg");
        setArray("http://www.kartinki.me/pic/201409/2560x1600/kartinki.me-20929.jpg");
        setArray("http://www.kartinki.me/pic/201409/2560x1600/kartinki.me-20929.jpg");
        setArray("http://www.kartinki.me/pic/201409/2560x1600/kartinki.me-20929.jpg");
        setArray("http://www.kartinki.me/pic/201409/2560x1600/kartinki.me-20929.jpg");
        setArray("http://www.kartinki.me/pic/201409/2560x1600/kartinki.me-20929.jpg");
        setArray("http://www.kartinki.me/pic/201409/2560x1600/kartinki.me-20929.jpg");
        setArray("http://www.kartinki.me/pic/201409/2560x1600/kartinki.me-20929.jpg");
        setArray("http://www.kartinki.me/pic/201409/2560x1600/kartinki.me-20929.jpg");
        setArray("http://www.kartinki.me/pic/201409/2560x1600/kartinki.me-20929.jpg");
        setArray("http://www.kartinki.me/pic/201409/2560x1600/kartinki.me-20929.jpg");




    }

    private int numOfFile=0;

    public int getNumOfFile() {
        return numOfFile;
    }

    public void setNumOfFile(int numOfFile) {
        this.numOfFile = numOfFile;
    }

    public synchronized String getArray(int index) {
        return array.get(index);
    }
    public synchronized List getList()
    {
        return array;
    }

    public synchronized void setArray(String URLInput) {
        array.add(URLInput);
    }
    public synchronized void removeURL(int removeInt)
    {
        array.remove(removeInt);
    }
}
