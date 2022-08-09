package Interview;
import java.util.*;

public class Demo5 {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("a");list.add("c");list.add("b");
		list.add("a");list.add("c");list.add("w");
	
		LinkedHashMap<String, Integer> map= new LinkedHashMap<String, Integer>();
		int count=0;
		for(String v:list) {
			if(!map.containsKey(v)) {
				map.put(v, 1);
				
			}
			else {
				count=map.get(v);
				count++;
				map.put(v, count);
				System.out.print(v+"  ");
			}
		}
		System.out.println();
		System.out.println(map);
		Set<String> k = map.keySet();
		for(String b:k){
			if(map.get(b)==1) {
				System.out.print(b+"  ");
			}
		}
		
	}
}
