import java.util.*; //키보드에서 입력 받은 수를 가져오는 기능을 포함

public class multi {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);  //scanner 생성
		
		System.out.print("숫자를 입력하세요 : ");  
		int n = s.nextInt();                 //입력된 수를 변수 n에 저장
		
		for(int i=1; i<=9; i++) {            //반복문 이용
			System.out.println(n + " X " + i + " = " + i * n);
			               //입력받은수              1~9         1~9 입력받은수
		}
	}
}
