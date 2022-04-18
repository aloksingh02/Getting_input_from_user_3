package com.company;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        System.out.println("taking input from the user");
        Scanner sc = new Scanner(System.in);

        Boolean B1 = sc.hasNextFloat();
        System.out.println(B1);

    }
}
