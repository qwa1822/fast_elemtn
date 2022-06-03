package ch02;

public class MyLINKEDTEST {

	public static void main(String[] args) {

		
		MyLinkedList n1=new MyLinkedList();
		n1.addElement("A");
		n1.addElement("B");
		n1.addElement("C");
		n1.printAll();
		
		n1.insertElement(3, "D");
		n1.printAll();
		n1.removeElement(0);
		n1.printAll();
		n1.removeElement(1);
		n1.printAll();
		
		
	}

}
