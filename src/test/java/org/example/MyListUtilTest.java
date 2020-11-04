package org.example;



import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import  static  org.junit.Assert.*;

public class MyListUtilTest {
    private static MyListUtil m;
    @BeforeClass
    public static void preparazioneTest(){
        m = new MyListUtil();
    }
    @Before
    public void Inizio(){
        System.out.println("data e ora inizio");
    }

    @Test
    public void ordineCrescenteWorks(){
        ArrayList<Integer> test1 = new ArrayList<Integer>();

        test1.addAll(Arrays.asList(6,5,1,4,2,3));
        assertEquals(Arrays.asList(1,2,3,4,5,6),m.ordineCrescente(test1));
        assertNotEquals(Arrays.asList(3,6,0,4,2,1),m.ordineCrescente(test1));
    }

    @Test
    public void ordineDecrescenteWorks(){
        ArrayList<Integer> test1 = new ArrayList<Integer>();
        ArrayList<Integer> test2 = new ArrayList<Integer>();
        test2.addAll(Arrays.asList(-1,2,3,1));
        test1.addAll(Arrays.asList(6,5,1,4,2,3));
        assertTrue(Arrays.asList(6,5,4,3,2,1).equals(m.ordineDescrescente(test1)));
        assertEquals(Arrays.asList(3,2,1,-1),m.ordineDescrescente(test2));

    }

}
