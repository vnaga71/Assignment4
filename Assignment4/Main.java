/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment4;

/**
 *
 * @author venka
 */
public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 30, 4, 2, 8, 7};
        int num = 20;
        int secondIndex = findSecondIndex(arr, num);
        System.out.println(secondIndex);
    }

    public static int findSecondIndex(int[] arr, int num) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                count++;
                if (count == 2) {
                    return i;
                }
            }
        }
        return -1;
    }
}