package com.company;
import java.util.Arrays;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
        Random rand = new Random();
        int size = 20;
        int[] array = new int[size];
        int min = 0;
        int max = 0;
        int temp;

        for ( int i = 0; i < size; i++ ) {
            array[i] = ((int)(Math.random() * 21) - 10);
            if ( array[min] > array[i] ) min = i;
            if ( array[max] < array[i] ) max = i;
        }
        System.out.println("Элементы массива до перестановки:" + Arrays.toString(array));
        temp = array[min];
        array[min] = array[max];
        array[max] = temp;

        System.out.println("Элементы массива после перестановки:" + Arrays.toString(array));
    }
}