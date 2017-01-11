package com.ovalles.lessons;

import java.util.Scanner;

public class Dice {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
     
		System.out.println("How many times do you want to roll the die?");
        
		int num = console.nextInt();
        
		int[] arr = new int[num];
        
		int one = 0;
		int two = 0;
		int three = 0;
		int four = 0;
		int five = 0;
		int six = 0;
        
		for(int i = 0; i <= arr.length-1; i++) {
            int random = (int) (Math.random() * 6 + 1);
            arr[i] = random;
            
            if(arr[i] == 1) {
                one++;
            }
            else if(arr[i] == 2) {
                two++;
            }
            else if(arr[i] == 3) {
                three++;
            }
            else if(arr[i] == 4) {
                four++;
            }
            else if(arr[i] == 5) {
                five++;
            }
            else if(arr[i] == 6) {
                six++;
            }
        }
        System.out.println("You rolled one " + one + " times");
        System.out.println("You rolled two " + two + " times");
        System.out.println("You rolled three " + three + " times");
        System.out.println("You rolled four " + four + " times");
        System.out.println("You rolled five " + five + " times");
        System.out.println("You rolled six " + six + " times");
    }

	}
