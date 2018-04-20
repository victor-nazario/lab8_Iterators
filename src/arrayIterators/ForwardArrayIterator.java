package arrayIterators;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ForwardArrayIterator<E> implements Iterator<E> {

	private E[] arr;    // the array to iterate over
	private int current; 
	
	public ForwardArrayIterator(E[] arr) { 
		this.arr = arr; 
		current = 0; 
	}
	
	public boolean hasNext() {
		return current < arr.length;
	}

	public E next() throws NoSuchElementException {
		if (!hasNext())
			throw new 
				NoSuchElementException("No more elements to iterate over."); 
		E next = arr[current];
		current++; 
		return next;
	}

	public void remove() throws UnsupportedOperationException {
		throw new UnsupportedOperationException(
				"Remove peration not implemented.");
		// do not implement
	}
}
