package com.company;
/*
Name: Domminick Hemphill
Class: CSCI-2467
Instructor: Barry Mesa
Date: 01/18/2020
 */

import java.util.Scanner;

public class Main {

    //Scanner import
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
	    // Declarations
        double radius;
        double height;
        double volume;

        // Input
        System.out.println("Enter the radius of your cylinder");
        radius = input.nextDouble();
        System.out.println("Enter the height of your cylinder.");
        height = input.nextDouble();

        //Computation
        volume = Math.PI * radius * radius * height;

        //Output
        System.out.println("The volume of the cylinder is: " + volume );


    }
}
