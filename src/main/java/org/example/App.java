package org.example;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner s= new Scanner(System.in);
        MyListUtil m = new MyListUtil();
        ArrayList<Integer> array= new ArrayList<Integer>();
        array.addAll(Arrays.asList(1,5,8,9,6,3,-5,50));
        System.out.println("Stampare i numeri in ordine crescente (Digita 1) o decrescente (Digita 2)?");
        int scelta = s.nextInt();
        if (scelta==1)
            System.out.println( m.ordineCrescente(array));
        else
            System.out.println(m.ordineDescrescente(array));
    }
}
