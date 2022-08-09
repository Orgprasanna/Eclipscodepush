package Interview;

import java.util.Hashtable;

public class Demo2 {

	public static void main(String[] args) {
		 String input = new String("aaabbbcccddd");
	        String output = "";
	        for (int i = 0; i < input.length(); i++) {
	            if (!output.contains(String.valueOf(input.charAt(i)))) {
	                output += String.valueOf(input.charAt(i));
	            }
	        }
	        System.out.println(output);

	}

}
