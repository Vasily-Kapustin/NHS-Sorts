
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zhaojingyu
 */
public class Sorts {

    public static void main(String[] args) {
        Integer[] ints = new Integer[15];
        Random r = new Random();
        for(int i=0;i<15;i++){
        ints[i]=r.nextInt(100);
        System.out.println(ints[i]);
        }
        System.out.println();
        ints = (Integer[]) insertionSort(ints);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
        
    }

    public static Comparable[] selectionSort(Comparable[] list) {
        for (int i = 0; i < list.length; i++) {
            int minIndex = i;
            for (int j = i; j < list.length; j++) {
                if (list[j].compareTo(list[minIndex]) < 0) {
                    minIndex = j;
                }

            }
            Comparable temp = list[i];
            list[i] = list[minIndex];
            list[minIndex] = temp;
        }
        return list;
    }
    
    public static Integer[] insertionSort(Integer[] list){
        for(int i = 1; i < list.length;i++){
            for(int j = i; j > 0;j--){
                if(list[j]<list[j-1]){
                    int temp = list[j];
                    list[j]=list[j-1];
                    list[j-1]=temp;
                }
            }
        }
     return list;   
    }
}
