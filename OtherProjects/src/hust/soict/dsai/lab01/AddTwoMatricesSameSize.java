package hust.soict.dsai.lab01;

import java.util.Scanner;

public class AddTwoMatricesSameSize {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int size = keyboard.nextInt();
        int[] arr1 = new int[size];
        int[] arr2 = new int[size];
        for (int i = 0; i < arr1.length; i++){
            arr1[i] = keyboard.nextInt();
        }
        for (int i = 0; i < arr2.length; i++){
            arr2[i] = keyboard.nextInt();
        }

        int[] result = new int[size];
        for (int i = 0; i < arr1.length; i++){
            result[i] = arr1[i] + arr2[i];
        }
        System.out.println(result.toString());
        keyboard.close();
    }
}
