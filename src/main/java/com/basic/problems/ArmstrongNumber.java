/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.basic.problems;

import java.util.Scanner;

/**
 *
 * @author dev1
 */
public class ArmstrongNumber {
    public static void main(String[] args) {
        int number = new Scanner(System.in).nextInt();
        
        if(isArmStrong(number)){
            System.out.println(number +" is Armstrong");
        }else{
            System.out.println(number +" is not Armstrong");
        }
        
    }
    
    public static boolean isArmStrong(int number){
        int original_number = number;
        int armstrong = 0;
        while(number!=0){
            int number1 = number % 10;
            armstrong+=(int)Math.pow(number1, 3);
            number = number/10;
        }
        return (armstrong == original_number);
    }
}
