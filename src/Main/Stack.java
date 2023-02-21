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
		if (tam != 0) {
			T item = now.get(tam - 1);
			now.remove(tam - 1);
			tam = (tam - 1);
			System.out.println("pop:" + item);
			return item;
		}
		else {
			System.out.println("Hey, sorry, the stack is empty :)");
		}
		return null;
	}

	@Override
	public void push(Object item) {
		
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
