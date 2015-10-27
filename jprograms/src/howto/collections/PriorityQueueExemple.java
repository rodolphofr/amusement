package howto.collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueueExemple {

	public static void main(String[] args) {
		
		PriorityQueue<Person> priorityQueue = new PriorityQueue<Person>(Person.PersonConditionComparator);
		
		for (Person p : queue()) priorityQueue.add(p);
		
		while (!priorityQueue.isEmpty()) {
			Person person = priorityQueue.poll();
			System.out.print(person + " <--- ");
		}
 		
	}

	public static List<Person> queue() {
		BankQueue banckQueue = new BankQueue();
		
		banckQueue.add(new Person("Person 1", Person.Condition.NORMAL));
		banckQueue.add(new Person("Person 2", Person.Condition.HANDICAPPED));
		banckQueue.add(new Person("Person 3", Person.Condition.OLD));
		banckQueue.add(new Person("Person 4", Person.Condition.PREGNANCY));
		banckQueue.add(new Person("Person 5", Person.Condition.NORMAL));
		banckQueue.add(new Person("Person 6", Person.Condition.OLD));
		banckQueue.add(new Person("Person 7", Person.Condition.NORMAL));
		
		return banckQueue.getQueue();
	}
	
	
}

class BankQueue {
	
	private List<Person> queue = new ArrayList<Person>();

	public List<Person> getQueue() {
		return queue;
	}

	public void add(Person person) {
		getQueue().add(person);
	}
	
}

class Person {
	
	private String name;

	private Condition condition;
	
	public Person(String name, Condition condition) {
		this.name = name;
		this.condition = condition;
	}
	
	public String getName() {
		return name;
	}

	public Condition getCondition() {
		return condition;
	}
	
	@Override
	public String toString() {
		return name;
	}
	
	public static Comparator<Person> PersonConditionComparator = new Comparator<Person>() {
		@Override
		public int compare(Person p1, Person p2) {
			int priorityP1 = p1.getCondition().getPriority();
			int priorityP2 = p2.getCondition().getPriority();
			if (priorityP1 == priorityP2) return 0;
			else if (priorityP1 > priorityP2) return -1;
			else return 1;
		}
	};
	
	public enum Condition {
		PREGNANCY(1), OLD(2), HANDICAPPED(3), NORMAL(0);
		
		private int priority;
		
		private Condition(int priority) {
			this.priority = priority;
		}
		
		public int getPriority() {
			return priority;
		}
	}
}



