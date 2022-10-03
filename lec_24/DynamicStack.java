package lec_24;

import lec_23.Stack;

public class DynamicStack extends Stack {
	@Override
	public void add(int ali) {
		if(this.isFull()) {
			int[] biggy = new int[this.arr.length*2];
			for(int i=0; i<arr.length; i++) {
				biggy[i] = arr[i];
			}
			arr = biggy;
		}
		super.add(ali);
	}
}
