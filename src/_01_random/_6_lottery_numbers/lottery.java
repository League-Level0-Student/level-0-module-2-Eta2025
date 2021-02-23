package _01_random._6_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class lottery {
public static void main(String[] args) {
	
	
	Random ran1 = new Random ();
		int dom1 = ran1.nextInt(100);
		int	dom2 = ran1.nextInt(100);
		int	dom3 = ran1.nextInt(100);
		int	dom4= ran1.nextInt(100);
		int	dom5= ran1.nextInt(100);	
		int	dom6= ran1.nextInt(100);	
	JOptionPane.showMessageDialog(null, dom1 + "  " + dom2 + "  " + dom3 +"   "+  dom4 +"   "+  dom5  +"   "+ dom6) ;
	
	
	
	
}
}
