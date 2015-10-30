package howto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicateArrayList {

	static ArrayList<Integer> remove(ArrayList<Integer> arrayList) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		HashSet<Integer> hashSet = new HashSet<Integer>(arrayList);
		list.addAll(hashSet);
		return list;
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> t1 = new ArrayList<Integer>(Arrays.asList(50, 20, 30, 40, 50, 10, 20));
		System.out.println(remove(t1).toString());
		
		ArrayList<Integer> t2 = new ArrayList<Integer>(Arrays.asList(50031, 23131, 41245, 11111, 2222, 23131, 2222));
		System.out.println(remove(t2).toString());
	}
}
