package data;

import java.util.ArrayList;

public class Stack<E> {

	private ArrayList<E> array;

	public Stack(ArrayList<E> array) {
		super();
		this.array = array;
	}

	public boolean isEmpty() {
		return array.isEmpty();
	}

	public void printFirst() {

		System.out.println(array.get(0));
	}

	public void printAndClear() {

		for (int i = 0; i < array.size(); i++) {
			System.out.println(array.get(i));
		}

		array.clear();

	}

	public int size() {

		return array.size();

	}

	public E getFirst() {

		return array.get(0);
	}

	public void add(E element) {

		array.add(element);

	}

}
