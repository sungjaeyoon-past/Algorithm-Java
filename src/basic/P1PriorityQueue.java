package basic;


import java.util.PriorityQueue;

class Student implements Comparable<Student> {

	private String name;
	private int score;
	
	Student(String name, int score){
		this.name=name;
		this.score=score;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", score=" + score + "]";
	}

	@Override
	public int compareTo(Student o) {
		return this.score < o.score ? 1:-1;
	}
	

}

public class P1PriorityQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Student> pr = new PriorityQueue<>();
		
		pr.offer(new Student("윤 ", 90));
		pr.offer(new Student("성 ", 50));
		pr.offer(new Student("재 ", 70));
		pr.offer(new Student("윤2 ", 50));
		pr.offer(new Student("성2 ", 20));
		pr.offer(new Student("2 ", 80));
		
		while(!pr.isEmpty()) {
			System.out.println(pr.poll().toString());
		}
	}

}
