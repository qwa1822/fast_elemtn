package ch05;

public class MyListQueueTest {

	public static void main(String[] args) {

		
		
		MyLinkedQueue listQueue=new MyLinkedQueue();
		listQueue.enQueue("A");
		listQueue.enQueue("b");
		listQueue.enQueue("c");
		
		
		listQueue.printAll();
		
		
		System.out.println(listQueue.deQueue());
		System.out.println(listQueue.deQueue());
		
	}

}
