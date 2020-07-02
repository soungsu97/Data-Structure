import java.util.Comparator;

public class Student implements Comparable<Student> {
   public static final Comparator<Student> WITH_NAME = new WithName();
   public static final Comparator<Student> WITH_DEPT = new WithDept();
   public static final Comparator<Student> WITH_GRADE = new WithGrade();
   
   int id;
   String name;
   String dept;
   Integer grade;
   
   public Student(int IDIn, String nameIn, String deptIn, int gradeIn) { //생성자
      id = IDIn;
      name = nameIn;
      dept = deptIn;
      grade = gradeIn;
   }
   public int getID() {return id;};
   public String getName() {return name;};
   public String getDept() {return dept;};
   public int getGrade() {return grade;};
   
   public static class WithName implements Comparator<Student>{ //이름으로 비교하는 compare()
	   public int compare(Student s1,Student s2) {
		   return s1.name.compareTo(s2.name);
	   }
   }
   public static class WithDept implements Comparator<Student>{ //학과이름으로 비교하는 compare()
	   public int compare(Student s1,Student s2) {
		   return s1.dept.compareTo(s2.dept);
	   }
   }
   public static class WithGrade implements Comparator<Student>{ //학년으로 비교하는 compare()
	   public int compare(Student s1,Student s2) {
		   return s1.grade-s2.grade;
	   }
   }
   public int compareTo(Student s1) {
	   return this.id - s1.id;
	   
   }
}