package lec_23;

public class Client_Stack {
	public static void main(String[] args) {
		Stack s = new Stack();
		s.pop();
		
		s.push(10);
		s.add(20);
		s.push(30);
		s.add(40);
		s.push(50);
		s.display();
		s.add(60);
	}
}
