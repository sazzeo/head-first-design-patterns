package org.example.pattern.iterator.run;

import org.example.pattern.iterator.classes.ArrayMenu;
import org.example.pattern.iterator.classes.ListMenu;
import org.example.pattern.iterator.interfaces.Iterator;

public class Run {

    public static void main(String[] args) {

        ArrayMenu arrayMenu = new ArrayMenu();
        ListMenu listMenu = new ListMenu();


        Iterator arrayIter = arrayMenu.createIterator();
        Iterator listIter = listMenu.createIterator();

        arrayIter.hasNext();
        arrayIter.next();

        listIter.hasNext();
        listIter.next();


    }
}
