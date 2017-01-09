package com.company;

import com.intellij.util.net.IOExceptionDialog;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        IOException i = new IOException();
        while (2 == 2) {
            System.out.println("Enter a number");
            Scanner input = new Scanner(System.in);

            try {
                int num = input.nextInt();
                System.out.println("Your number is: " + num);
            } catch (InputMismatchException e) {
                InputMismatchException d = new InputMismatchException("I said numbers");
                throw d;
            }
        }
    }
}