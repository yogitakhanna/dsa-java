package lec_25;

public class client_stack {
	public static void main(String[] args) {
		min_stack s = new min_stack();
		s.add(10);
		s.add(11);
		s.add(8);
		s.add(15);
		s.add(4);
		s.add(7);
		s.add(2);
		s.add(2);
		System.out.println(s.pop()+"-"+s.min);
		System.out.println(s.pop()+"-"+s.min);
		System.out.println(s.pop()+"-"+s.min);
		System.out.println(s.pop()+"-"+s.min);
		System.out.println(s.pop()+"-"+s.min);
		System.out.println(s.pop()+"-"+s.min);
		System.out.println(s.pop()+"-"+s.min);
	}
}
