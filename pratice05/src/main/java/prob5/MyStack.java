package prob5;

import java.util.ArrayList;
import java.util.List;

public class MyStack{
	private int stackSize;
	private List<String> stack;

	public MyStack(int stackSize) {
		this.stack = new ArrayList<String>();
	}

	public void push(String string) {
		stack.add(string);
	}

	public boolean isEmpty() {
		if (stack.size() != 0) {
			return false;
		} else {
			return true;
		}
	}

	public String pop() throws MyStackException{
		if(stack.size()==0) {
			throw new MyStackException();
		}
		String popString = stack.get(stack.size() - 1);
		stack.remove(stack.size() - 1);
		return popString;
	}

}