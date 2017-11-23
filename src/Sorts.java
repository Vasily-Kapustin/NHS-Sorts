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
    public static void main(String[] args){
    
    }

    public static Comparable[] selectionSort(Comparable[] list) {
        for (int i = 0; i < list.length; i++) {
            int minIndex = i;
            for (int j = i; j < list.length; j++) {
                if (list[j].compareTo(list[i]) < 0) {
                    minIndex = j;
                }

            }
            Comparable temp = list[i];
            list[i]=list[minIndex];
            list[minIndex]=temp;
        }
        return list;
    }
}
