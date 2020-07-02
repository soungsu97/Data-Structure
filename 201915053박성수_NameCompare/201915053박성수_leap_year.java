import java.util.*; 

public class leap_year {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);  
		System.out.print("연도를 입력하세요 : ");
		int y = s.nextInt();
		
		if((y%4 == 0 && y%100 != 0)|| y%400 == 0) {
	
			System.out.println(y + "년은 윤년입니다.");
		}else
			System.out.println(y + "년은 평년입니다.");
	}
}
