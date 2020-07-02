public class main3 {

	public static void main(String[] args) {
		DList<String> s= new DList<String>();
		 
		s.insertAfter(s.head, "apple");
		s.insertBefore(s.tail, "peach");
		s.insertBefore(s.tail, "orange");
		s.insertAfter(s.head.getNext(), "grape");
		s.print();
		System.out.println();
		
		s.delete(s.tail.getPrevious());
		s.print();
		System.out.println();
		
		s.insertBefore(s.tail, "kiwi");
		s.print();
		System.out.println();
		
		s.delete(s.head.getNext());
		s.print();
		s.delete(s.head.getNext());
		s.print();
		s.delete(s.head.getNext());
		s.print();
		s.delete(s.head.getNext()); 
		s.print();

	}

}
