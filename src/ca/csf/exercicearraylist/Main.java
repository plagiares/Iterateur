package ca.csf.exercicearraylist;

public class Main {

	public static void main(String[] args) {
		CustomArrayListInteger custom = new CustomArrayListInteger(5);
		custom.toString();
		custom.size();
		custom.capacity();
		custom.isEmpty();
		custom.add(3);
		custom.add(4);
		custom.toString();
		custom.add(0,7);
		custom.toString();
		custom.get(1);
		custom.size();
		custom.capacity();
		custom.isEmpty();
		custom.contains(3);
		custom.remove(1);
		custom.toString();
		custom.contains(3);
		custom.add(3, 44);
		custom.add(2,44);
		custom.toString();
		custom.get(3);
		custom.remove(3);
		custom.add(55);
		custom.add(66);
		custom.toString();
		custom.size();
		custom.capacity();
		custom.add(77);
		custom.toString();
		custom.size();
		custom.capacity();
		custom.clear();
		custom.toString();
		custom.isEmpty();
		custom.size();
		custom.capacity();
	}

}
