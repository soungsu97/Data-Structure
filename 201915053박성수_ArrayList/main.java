public class main {

	public static void main(String[] args) {
		ArrList<String> s = new ArrList<String>();
		s.insertLast("peach"); s.print();
		s.insertLast("mandarin"); s.print();
		s.insertLast("apple"); s.print();
		s.insertLast("pear"); s.print();
		s.insert("dragonfruit", 1); s.print();
		s.insert("lime", 4); s.print();
		s.insertLast("kiwi"); s.print();
		
		s.delete(4); s.print();
		s.delete(0); s.print();
		s.delete(0); s.print();
		s.delete(3); s.print();
		s.delete(0); s.print();
		
		System.out.println("1번째 항목은 " + s.peek(1) + " 이다.");
		System.out.println();
		
		ArrList<Integer> t = new ArrList<Integer>();
		t.insertLast(100);
		t.insertLast(200);
		t.insertLast(300);
		t.insertLast(400);
		t.print();
		
		t.insert(350, 3); t.print();
		t.insert(250, 2); t.print();
		t.insertLast(500); t.print();


	
		

	}

}
