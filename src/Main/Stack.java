package Main;

import java.util.ArrayList;

public class Stack<T> implements IStack<T>{ 
	
	private int tam;

	private ArrayList <T> now;

	public Stack(){
		now = new ArrayList<>();
		tam = 0;
	}

	@Override
	public T pop() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void push(Object item) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int tam() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public T peek() {
		// TODO Auto-generated method stub
		return null;
	}

}
