package lec_25;
import lec_24.DynamicStack;
public class min_stack extends DynamicStack {
	int min;
	
	public int getMin() {
		return min;
	}
	
	@Override
	public int peek() {
		if(super.peek() < min) {
			return min;
		}
		return super.peek();
	}
	
	@Override
	public void add(int ali) {
		if(isEmpty()) {
			min = ali;
			super.add(ali);
			return;
		}
		if(ali >= min) {
			super.add(ali);
		}
		else {
//			ali is the min!!
			int prev_min = min;
			int curr_min = ali;
			int x = 2 * curr_min - prev_min;
			super.add(ali);
			min = curr_min;
		}
	}
	
	@Override
	public int pop() {
		if(super.peek() < min) {
			int x = super.pop();
			int curr_min = min;
			int prev_min = 2 * curr_min - x;
			min = prev_min;
			
			return curr_min;
		}else {
			return super.pop();
		}
	}
}
