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
public class PrimeNumbers {

    public static void main(String[] args) {
        int num = 30;
        for (int i = 2; i <= num; i++) {
            int count = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }

            if (count == 0) {
                System.out.println(i + "");
            }
        }
    }
}
