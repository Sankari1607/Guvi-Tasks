package String;

import java.util.Scanner;
public class countwords_space {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Hi Hello How are you";
		
		int count = 1;
		for (int i = 0; i<s.length(); i++)
		{
			if ((s.charAt(i) == ' ') &&(s.charAt(i+1)!= ' '))
			{
				count ++;
				
			}
			}
		System.out.println(count);
	}

}
