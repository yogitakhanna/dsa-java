package lec_24;

import java.util.Stack;

public class Stack_Qps {
	public static void main(String[] args) {
//		Stack<Integer> s = new Stack<>();
//		s.add(10);
//		s.add(20);
//		s.add(30);
//		s.add(40);
//		s.add(50);
//		System.out.println(s);
//		revPrint(s);
//		revStack(s);
//		System.out.println(s);
		int[] arr = { 50, 30, 20, 40, 10, 45, 5, 60, 15, 8};
		nextGreaterOrdered(arr);
	}
	
	public static void revStack(Stack<Integer> S) {
		Stack<Integer> C = new Stack<Integer>();
		copy(S,C);
		while(!C.isEmpty()) {
			S.add(C.pop());
		}
	}
	
	public static void copy(Stack<Integer> S, Stack<Integer> C) {
		if(S.isEmpty()) {
			return;
		}
		int temp = S.pop();
		copy(S,C);
		System.out.println(temp);
		S.add(temp);
		C.add(temp);
	}
	
	public static void nextGreater(int[] arr) {
		Stack<Integer> S = new Stack<>();
		for(int B : arr) {
			while(!S.isEmpty() && S.peek() < B) {			
				int A = S.pop();
				System.out.println(A + "=>" + B);
			}
			S.add(B);
		}
		
// S is not empty and peek is less than B i.e 
//in arr  { 50, 30, 20, 40, 10, 45, 5, 60, 15, 8} in stack 50,30,20 is added because it do not satisfy 
//the condition of for loop so, for 40 satisfy the condition of for loop so it will pop() 30,20 and
//S.add(B) will add 40 in the stack and it will continue till the stack is not empty.			
						
		
		while(!S.isEmpty()) {
			int A = S.pop();
			System.out.println(A + "=>" + -1);
		}	
//		this while loop is for the remaining element in stack eg. 60,15,8 in the above array.
	}
	
	public static void nextGreaterOrdered(int[] arr) {
		Stack<Integer> S = new Stack<>();
		int[] ans = new int[arr.length];
		int idx = 0;
		for(int B : arr) {
			while(!S.isEmpty() && arr[S.peek()] < B) {
				int A_idx = S.pop();
				ans[A_idx] = B;
				int A = arr[A_idx];
			}
			S.add(idx);
			idx++;
		}
		while(!S.isEmpty()) {
			int A_idx = S.pop();
			ans[A_idx] = -1;
			int A = arr[A_idx];
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]+"=>"+ans[i]);
		}
	}
}
