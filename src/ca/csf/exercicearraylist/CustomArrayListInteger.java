package ca.csf.exercicearraylist;


public class CustomArrayListInteger {
	private int numberOfElements = 0;
	private int[] data;
	private int capacity = 100;
	
	public CustomArrayListInteger(int _capacity) {
		capacity = _capacity;
		data = new int [_capacity];
		
	}
	public CustomArrayListInteger() {
		data = new int[capacity];
	}
	void add(int _position, int _element) {
		if (numberOfElements == capacity) {
			replaceFullArray();
		}
		if (_position < numberOfElements) {
			for (int i = capacity - 1 ; i > _position; i--)
			{
					data[i] = data[i - 1];
			}
			
		}
		data[_position] = _element;
		numberOfElements++;
	}
	void add(int _element) {
		if (numberOfElements == capacity) {
			replaceFullArray();
		}
		data[numberOfElements] = _element;
		numberOfElements++;
	}
	
	void replaceFullArray() {
		capacity *= 2; 
		int[] temporary = new int[capacity];
		
		for (int i = 0; i < numberOfElements; i++) {
			temporary[i] = data[i];
		}
		data = null;
		data = new int [capacity];
		for (int i = 0; i < numberOfElements; i++) {
			data[i] = temporary[i];
		}
	}
	public Integer get(int _position) {
		if (_position > capacity + 1 || _position > numberOfElements)
		{
			System.out.println("ERREUR");
		}
		System.out.println("get = " + data[_position]);
		return data[_position];
	}
	void remove(int _position) {
		if (_position > capacity + 1) {
			System.out.println("ERREUR");
		}
		else {
			for (int i = _position; i < capacity - 1; i++) {
				int temp = data[_position + 1];
				data[i] = temp;
			}		
			numberOfElements--;

		}
}
	public String toString() {
		String returnString = "[";
		for (int i = 0; i < numberOfElements; i++) {
			returnString += "," + String.valueOf(data[i]);
		}
		returnString += "]";
		System.out.println(returnString);
		return returnString;
	}
	public Boolean isEmpty(){
		Boolean returnAnswer = numberOfElements == 0;
		System.out.println("Is Empty ? " + returnAnswer);
		return returnAnswer;
	}
	
	void clear() {
		if (numberOfElements > 0) {
			for (int i = 0; i < numberOfElements; i++) {
		
			data[i] = 0;
		}
		numberOfElements =0;
		}
	}
	public Boolean contains(int _element) {
		Boolean containsElement = false;
		for (int i = 0; i < numberOfElements; i++) {
		
			if  (data[i] == _element) {
				containsElement = true;
			}
		}
		System.out.println("Contains " + _element  + " ? "  + containsElement);
		return containsElement;
	}
	public Integer size() {
		System.out.println("Size = " + numberOfElements);
		return numberOfElements;
	}
	public Integer capacity() {
		System.out.println("Capacity = " + capacity);
		return capacity;
	}
}
