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
public class SumOfEvenNumbers {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for (int x : arr) {
            if (x % 2 == 0) {
                sum += x;
            }
        }
        System.out.println("Sum of even numbers: " + sum);
    }
}