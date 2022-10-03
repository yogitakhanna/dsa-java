package lec_18;
import java.util.ArrayList;
import java.util.List;
public class rec_1 {
	public static void main(String[] args) {
		SubSeq("ab","");
	}
	
	public static void SubSeq(String word, String team) {
		if(word.isEmpty()) {
			System.out.println(team);
			return;
		}
		char ch = word.charAt(0);
//		word.substring(1) is used to delete the first char from string. eg ABCD => BCD => CD => D
		SubSeq(word.substring(1), team + ch); // include
		SubSeq(word.substring(1), team + "-"); // exclude
	}
}
