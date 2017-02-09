package com.company;

public class Main {

    public static void main(String[] args) {
        int theArray[] = {4, 8, 15, 16, 23, 42};
        int theArray2[] = {8, 15, 4, 23, 16, 42};
        sort(theArray2);
        for(int j = 0; j < theArray.length; j++) {
            System.out.print(theArray[j] + " ");
        }
        System.out.println(" ");
    }
    public static void sort(int a[ ]) {
    //Bubble Sort

   /*
        int count = 0;
        for (int i = 0; i < 6; i++){
            if (a[i] > a[i+1]){
                int w = a[i];
                int e = a[i+1];
                a[i] = e;
                a[i+1] = w;
                i = 0;
                count++;
            }
            if (count == 0){
                break;
            }
        System.out.println("Your array is sorted.");
        }
    */

    //Selection
        int min;
        int n = 0;
        for (int i = 0; i<a.length; i++){
            min = i;
            for (int w = i+1; w<a.length; w++){
                if (a[w] < a[min]);
                min = w;
            }
            if (min != i) {
                int q = a[i];
                a[i] = a[min];
                a[min] = q;
            }
        }
    //Quick Sort
    //Merge Sort
    }
}
