package Interview;


import java.util.*;

public class Demo4 {

	public static void main(String[] args) {
		String s= "prasanna";
		String s1 = s.toLowerCase();
		int length = s1.length();
		char[] v = s1.toCharArray();
		PriorityQueue<Character> q= new PriorityQueue<Character>();
		for(char c:v ) {
			q.offer(c);
		}
		Iterator<Character> p = q.iterator();
		while(p.hasNext()) {
			System.out.print(q.poll());
		}
	}

}
