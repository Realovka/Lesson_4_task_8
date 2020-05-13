package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	int [] array1 = new int [10];
	int [] array2 = new int [10];

        Random random = new Random();
        for (int i=0; i<array1.length; i++){
            array1[i]=random.nextInt(9);
        }
        for (int i=0; i<array2.length; i++){
            array2[i]=random.nextInt(9);
            if (array2[i]==0){
                do {
                    array2[i]=random.nextInt(9);
                }
                        while (array2[i]==0);
            }
        }



        double[] array3 = new double[10];
        for(int i=0; i<array3.length; i++){
            array3[i]=(double)(array1[i])/array2[i];
        }

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        for (double x:array3){
            System.out.printf("%.2f",x);
            System.out.print(" ");
        }
        int i, j;
        int a=0; // кол-во целых элементов
        for ( i=0, j=0; i<array1.length && j<array2.length; i++, j++){
            if (array1[i] % array2[i] == 0 && (array1[i]/array2[j])!=0 ){
                a++;
            }
        }
        System.out.println();
        System.out.println("Количество целых чисел в третьем массиве - "+a);
    }
}
