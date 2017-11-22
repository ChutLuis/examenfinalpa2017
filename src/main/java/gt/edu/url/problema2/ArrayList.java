package gt.edu.url.problema2;

public class ArrayList<E> implements List<E> {
	
	public static final int CAPACITY=16;
	private E[ ] data;
	private int size = 0;
	
	public ArrayList() {
		this(CAPACITY);
	}

	public ArrayList(int capacity) {
		data = (E[]) new Object[capacity];
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() { 
		return size == 0;
	}

	public E get(int i) {
		
		return data[i];
	}

	public E set(int i, E e) {
		
		E temp = data[i];
		data[i] = e;
		return temp;
	}

	public void add(int i, E aux) {
		
		if (size == data.length) {// not enough capacity
			resize(2 * data.length); }
		for (int k=size-1; k >= i; k--) // start by shifting rightmost
			data[k+1] = data[k];
		data[i] = aux; // ready to place the new element size++;
		
	}

	public E remove(int i) throws IndexOutOfBoundsException {
		
		E temp = data[i];
		for (int k=i; k < size-1; k++)
			data[k] = data[k+1];
		data[size-1] = null;
		size--;
		return temp;
	}
	protected void resize(int capacity) {
		E[] temp = (E[]) new Object[capacity];
		for (int k=0; k < data.length; k++)
			temp[k] = data[k];
		data = temp;
}
	public void swap(int i, int y) {
		E temp= get(i);
		E temp2= get(i);
		set(i,temp2);
		set(y,temp);
	}
	

}
