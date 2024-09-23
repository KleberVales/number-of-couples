package number;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Testando {

	public static void main(String[] args) { 
		
		Scanner s = new Scanner(System.in); 
		int t = s.nextInt(); 
		String [] pair_left = new String[t]; 
		String [] pair_right = new String[t];

		for (int i = 0; i < t; i++) {
			pair_left[i] = s.next();
			pair_right[i] = s.next();
		}
		
		Set<String> nameSet = new HashSet<>();
		
		for(int i =0; i<t; i++){
			String str = pair_left[i]+" "+pair_right[i];
			nameSet.add(str);
			System.out.println(nameSet.size());
		}
	}
}
