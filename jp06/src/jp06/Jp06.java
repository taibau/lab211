package jp06;

import java.util.Random;
import java.util.Scanner;
import validate.CheckInputValid;

public class Jp06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = CheckInputValid.readPositiveInt(
                scanner, "Enter number of array: ");
        int searchValue = CheckInputValid.readInt(
                scanner, "Enter search value: ");

        int[] array = generateArray(length);
        bubbleSort(array);
        displayArray(array);

        int foundIndex = binarySearch(array, searchValue);
        if (foundIndex >= 0) {
            System.out.println("Found " + searchValue + " at index: " + foundIndex);
        } else {
            System.out.println(searchValue + " was not found in the array.");
        }
    }

    private static int[] generateArray(int length) {
        Random random = new Random();
        int[] array = new int[length];

        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt(length);
        }

        return array;
    }

    private static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    private static void displayArray(int[] array) {
        System.out.print("Sorted array: [");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);

            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println("]");
    }

    private static int binarySearch(int[] array, int value) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int middle = left + (right - left) / 2;

            if (array[middle] == value) {
                return middle;
            }
            if (array[middle] > value) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }

        return -1;
    }
}
