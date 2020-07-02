public class main2 {

	public static void main(String[] args) {
		SList<String> s = new SList<String> (); 
		s.insertFront("apple"); 
		s.insertFront("orange");
		s.insertAfter("peach", s.head.getNext());
		s.insertFront("kiwi");
		
		s.print();
		System.out.println(": s의 길이=" + s.size()+ "\n");
		System.out.println("복숭아가 \t" + s.search("peach")+ "번째에 있다.");
		System.out.println("사과가 \t" + s.search("apple")+ "번째에 있다.\n");
		s.deleteAfter(s.head);
		s.print();
		System.out.println(": s의 길이=" + s.size());
		System.out.println();
		s.deleteFront();
		s.print();
		System.out.println(": s의 길이=" + s.size());
		System.out.println();
		
		SList<Integer> t= new SList<Integer>(); 
		t.insertFront(500); t.insertFront(200);
		t.insertAfter(400, t.head);
		t.insertFront(100);
		t.insertAfter(300, t.head.getNext());
		t.print();
		System.out.println(": t의 길이=" + t.size());
		

	}

}
