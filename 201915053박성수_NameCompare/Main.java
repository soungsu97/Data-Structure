import java.util.Arrays;

public class Main {

   public static void main(String[] args) {
      Student[] a = {
            new Student(14069, "김**", "영문",3),
            new Student(12051, "이**", "수학",4),
            new Student(15220, "이**", "디자인",2),
            new Student(12481, "박**", "수학",4),
            new Student(15505, "박**", "디자인",2),
            new Student(16962, "유**", "수학",1),
            new Student(15376, "최**", "디자인",2),
            new Student(16420, "류**", "경제",2),
            new Student(11293, "강**", "컴퓨터",4),
            new Student(10184, "차**", "경제",3),
            new Student(16104, "곽**", "컴퓨터",1),
            new Student(10390, "허**", "경영",4),
            new Student(14758, "백**", "경영",2)
      };
      Arrays.sort(a); //학번으로 정렬
      print(a,"ID");
      //학과이름으로 비교할 Comparator WITH_DEPT
      Arrays.sort(a,Student.WITH_DEPT);
      print(a,"학과");
      //학생이름으로 비교할 Comparator WITH_NAME
      Arrays.sort(a,Student.WITH_NAME);
      print(a,"이름");
      //학년으로 비교할 Comparator WITH_GRADE
      Arrays.sort(a,Student.WITH_GRADE);
      print(a,"학년");
      
   }

private static void print(Student[] a, String string) {
	 for(Student  student : a) {
		 System.out.println(student.getID()+" " + student.getDept() +"   "+ student.getName() +"  "+ student.getGrade());
	 }
}

}