package com.company.GUI;
import java.util.*;

/**
 * Created by Lite on 15.06.2017.
 */
public class ManagerOfProress {
    public synchronized static void refreshBars (Map<String,Integer> progressArray, ArrayList<ProgressPanel> arrayList, GUI gui) throws InterruptedException
    {
        while (true)
        {
            synchronized (progressArray)
            {
                synchronized (arrayList)
                {
                    for (Map.Entry<String, Integer> mapIterator : progressArray.entrySet())
                    {
                        arrayList.add(new ProgressPanel(mapIterator.getKey(), mapIterator.getValue(), gui));
                    }
                }
            }
            Thread.sleep(50);
            while (true)
            {
                synchronized (arrayList)
                {

                    if (!arrayList.isEmpty()) {
                        gui.remove(arrayList.get(0));
                        arrayList.remove(0);

                    }
                    else
                    {
                        break;
                    }

                }
            }

            if (progressArray.isEmpty())
            {
                //gui.remove(3);
                System.out.println("массив пуст");
                gui.setVisible(false);
                gui.setVisible(true);
                break;
            }
        }
    }
}
