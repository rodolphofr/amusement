package howto.collections;

import java.util.TreeSet;

public class TreeSetExemple {
	
	public static void main(String[] args) {

		TreeSet<Dog> ts = new TreeSet<Dog>();
		
		ts.add(new Dog(2));
		ts.add(new Dog(1));
		ts.add(new Dog(3));
		ts.add(new Dog(4));
		ts.add(new Dog(5));
		ts.add(new Dog(6));
		ts.add(new Dog(1));
		ts.add(new Dog(1));
		
		for (Dog d : ts) {
			System.out.println(d.size);
		}
		
	}

}

class Dog implements Comparable<Dog> {

	int size;
	
	public Dog(int size) {
		this.size = size;
	}

	@Override
	public int compareTo(Dog o) {
		return size - o.size;
	}
	
}