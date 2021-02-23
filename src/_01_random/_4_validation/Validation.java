//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _01_random._4_validation;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		
		for( int r = 1; r < 11; r++){
	
		Random randomMaker = new Random();
		
		int randomNumber = randomMaker.nextInt(5+1);
		
		System.out.println(randomNumber);
		  
		if(randomNumber ==1) {
			JOptionPane.showMessageDialog(null, "your doing well in class") ;
		} else if(randomNumber==2) {
			JOptionPane.showMessageDialog(null, "you have cool clothes") ;
		}else if(randomNumber==3) {
			JOptionPane.showMessageDialog(null, "you are a nice person") ;
		}else if(randomNumber==4) {
			JOptionPane.showMessageDialog(null, "you are good at math") ;
		}else if(randomNumber==5) {
			JOptionPane.showMessageDialog(null, "I like your your shoes") ;
		}
		}
		
		
		
		// 1. Use each value of randomNumber to give the user a random compliment.

		// 2. Repeat all the code above 10 times
		
		// 3. Find someone to test out your program. They will like it :)
	}
	}	

