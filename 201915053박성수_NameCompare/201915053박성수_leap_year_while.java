import java.util.*; 

public class leap_year_while {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);  
		
		while(true) { 
		System.out.print("연도를 입력하세요(단,0보다 작은 수를 입력하면 종료) : ");
		
		int y = s.nextInt();
		
		if(y <=0){ 
			System.out.println("프로그램을 종료합니다.");
			break; }
		
		if((y%4 == 0 && y%100 != 0)|| y%400 == 0) {
			
			System.out.println(y + "년은 윤년입니다.");
			
		}else
			System.out.println(y + "년은 평년입니다.");
		    
	}
}
}
