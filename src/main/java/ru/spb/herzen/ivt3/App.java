package ru.spb.herzen.ivt3;

import org.kohsuke.randname.RandomNameGenerator;

import java.util.Arrays;


public class App {

    public static void main(String[] args) {
        RandomNameGenerator rnd = new RandomNameGenerator(1);
        String name;
        //char array[];
        int[] arr2;
        arr2 = new int[30];
        String arr[] = new String[15];
        for (int i = 0; i < 15; i++) {
            name = rnd.next();
            arr[i] = name;
            arr[i].toCharArray();

        }


        for (int j = 0; j < 30; j++)
            arr2[j] = (int) (Math.random() * 100);
        for (int j : arr2)
            System.out.println(j + " ");

        Arrays.sort(arr);
        //String[] array2 = Arrays.copyOfRange(arr, 2, 4);

        for (String s : arr) {
            System.out.println("hello " + s);
        }


    }
}
