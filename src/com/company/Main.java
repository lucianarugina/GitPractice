package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Tema 1 (Fizz Buzz)(predata pe mail):

package com.company;
import java.util.Scanner;
        public class Main {
            public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                System.out.print("Input a number: ");
                int number = input.nextInt();
                if (number % 3 == 0) {
                    System.out.print("Fizz");
                }
                if (number % 5 == 0) {
                    System.out.print(" Buzz");
                }
                if (!(number % 3 == 0 || number % 5 == 0)) {
                    System.out.print(number);
                }
            }
        }
    }
}