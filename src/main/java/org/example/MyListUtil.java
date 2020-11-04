package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class MyListUtil {

    public ArrayList<Integer> ordineCrescente(ArrayList<Integer> NumbersList){
         Collections.sort(NumbersList);
         return  NumbersList;
    }

    public ArrayList<Integer> ordineDescrescente (ArrayList<Integer> NumbersList){
        Collections.sort(NumbersList);
        ArrayList<Integer> tmp = new ArrayList<Integer>();
        for (int i=NumbersList.size()-1;i>=0;--i)
            tmp.add(NumbersList.get(i));
        return tmp;
    }

}
