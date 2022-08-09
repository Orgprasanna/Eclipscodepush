package Interview;

public class Demo1 {

	public static void main(String[] args) {
		String S = "Wednesday";
		String lowS = S.toLowerCase();
		char[] v = lowS.toCharArray();
		int length = v.length;
		
		for(int i=0; i<length; i++) {
			for(int j=i+1; j<length; j++) {
				if(v[i]==v[j]) {
					System.out.println("repested character "+v[i] );
				}
				else {
					
					System.out.println(v[i]);
				}
				
			}
		}

	}

}
