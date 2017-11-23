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
        Integer[] ints = new Integer[]{9, 7, 8, 6, 7, 5, 6, 4, 5, 3, 2, 4, 1};
        ints = (Integer[]) selectionSort(ints);
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
}
