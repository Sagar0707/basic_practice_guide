/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.basic.problems;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dev1
 */
public class Fibonacci {

    public static void main(String args[]) { //input to print Fibonacci series upto how many numbers 
        System.out.println("Enter number upto which Fibonacci series to print: ");
        int number = 10;
        System.out.println("Fibonacci series upto " + number + " numbers : ");
        //printing Fibonacci series upto number 
        for (int i = 1; i <= number; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        
        System.out.println(fibonacci3(number));
        fibonacci4(number);
    }

    /* * Java program for Fibonacci number using recursion. * This program uses tail recursion to calculate Fibonacci number * for a given number * @return Fibonacci number */
    public static int fibonacci(int number) {
        if (number == 1 || number == 2) {
            return 1;
        }
        return fibonacci(number - 1) + fibonacci(number - 2);
    }

    /* * Java program to calculate Fibonacci number using loop or Iteration. 
    * @return Fibonacci number */ 
    public static int fibonacci2(int number) {
        if (number == 1 || number == 2) {
            return 1;
        }
        int fibo1 = 1, fibo2 = 1, fibonacci = 1;
        for (int i = 3; i <= number; i++) {
//Fibonacci number is sum of previous two Fibonacci number 
            fibonacci = fibo1 + fibo2;
            fibo1 = fibo2;
            fibo2 = fibonacci;
        }
        return fibonacci; //Fibonacci number 
    }
    
    /* * Java program to calculate Fibonacci number using loop or Iteration. 
    * @return Fibonacci number */ 
    public static List<Integer> fibonacci3(int number) {
        List<Integer> fibo = new ArrayList<>();
        fibo.add(1);
        fibo.add(1);
        
        
        for(int i = 2; i<=number ; i++){
            fibo.add(fibo.get(fibo.size()-1)+fibo.get(fibo.size()-2));
        }
        return fibo;
    }
    
    /* * Java program to calculate Fibonacci number using loop or Iteration. 
    * @return Fibonacci number */ 
    public static void fibonacci4(int number) {
        int fibo1 = 1;
        int fibo2 = 1;
        int fibo_temp;
        
        System.out.print(fibo1 + " "+fibo2+" ");
        for(int i = 2; i<=number ; i++){
            fibo_temp = fibo1+fibo2;
            fibo1 = fibo2;
            fibo2 = fibo_temp;
            System.out.print(fibo_temp + " ");
        }
    }
}
