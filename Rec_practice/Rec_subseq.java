package Rec_practice;

public class Rec_subseq {
	public static void main(String[] args) {
		SubSeq("ABCD","");
		System.out.println();
		System.out.println(count);
	}
	static int count = 0;
	public static void SubSeq(String word, String team) {
		if(word.isEmpty()) {
			System.out.print(team+" ");
			count++;
			return;
		}
		char ch = word.charAt(0);
		SubSeq(word.substring(1), team + ""); // exclude
		SubSeq(word.substring(1), team + ch); // include
	}
	
	
	
//	word.substring(1) is used to delete the first char from string. eg ABCD => BCD => CD => D
}
