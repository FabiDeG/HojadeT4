package Main;

public interface IStack <T>{
	
	public T pop();
	
	public void push(T item);
		
	public int tam();
	
	public T peek();
	
	public boolean empty();

}
