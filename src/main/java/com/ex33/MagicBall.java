/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Enoc Mena
 */

package com.ex33;
import java.util.Scanner;
import java.util.Random;

public class MagicBall {

    public static void main(String[] args) {

        System.out.print("Welcome to Magic 8 ball!");
        System.out.println("\n");

        String[] arr = {"Ask later again later", "Yes", "No"};
        Random r = new Random();
        int randomNum = r.nextInt(arr.length);

        String question;

        Scanner in = new Scanner(System.in);
        System.out.print("What is your question? ");
        question = in.nextLine();

        System.out.print("> " + arr[randomNum]);

    }

}
