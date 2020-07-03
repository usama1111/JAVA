
import java.util.ArrayList;
import java.util.List;


 
 class Person{
 
 
    private int Id;
    private String Name;
 
 Person( int Id, String Name){
 
 this.Id=Id;
 this.Name=Name;
 }
public String getName(){

return Name;
} 
public int getId(){

return Id;


}
 public String toString() {
    
    
        return "Id : "+Id+ " name :"+Name;
    }
 
 
 }
 class School {

static String schoolName = "Allied School(Shahrah-e-Faisal) Campus ";

    private List<Teacher> teachers;
    private List<Student> students;
    private static int  totalMoneyEarned;
    private static int totalMoneySpent;

    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned=0;
        totalMoneySpent=0;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    public static void updateTotalMoneyEarned(int MoneyEarned) {
        totalMoneyEarned += MoneyEarned;
    }

    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    public static void updateTotalMoneySpent(int moneySpent) {
        totalMoneyEarned-=moneySpent;
     }
}
 class Student extends Person{

    
    private int grade;
    private int feesPaid;
    private int feesTotal;
    Student h;

    public Student(int Id,String Name,int grade){
     super(Id,Name);
        this.feesPaid=0;
        this.feesTotal=30000;
        this.grade=grade;

    }

    public void setGrade(int grade){
        this.grade=grade;
    }


    public void payFees(int fees){
        feesPaid+=fees;
        School.updateTotalMoneyEarned(feesPaid);
    }
    public int getGrade() {
        return grade;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }
    public int getRemainingFees(){
        return feesTotal-feesPaid;
    }

public void logon(SwipeCard s){
		s.Swipe(h);
	}
    @Override
    public String toString() {
    
    super.toString();
        return 
                " Total fees paid so far $"+ feesPaid;
    }
}
class Teacher extends Person{

    private int salary;
    private int salaryEarned;
    Teacher t;


    public Teacher(int Id, String Name, int salary){
    super(Id,Name);
        this.salary=salary;
        this.salaryEarned=0;
    }

    public int getSalary(){
        return  salary;
    }

    public void setSalary(int salary){
        this.salary=salary;
    }

    public void receiveSalary(int salary){
        salaryEarned+=salary;
        School.updateTotalMoneySpent(salary);
    }
    public void logon(SwipeCard s){
		s.Swipe(t);
	}
    @Override
    public String toString() {
super.toString();
        return " Total salary earned so far $"
                + salaryEarned;
    }
}

class SwipeCard
{
private String madeofCard;

public SwipeCard(){};

public SwipeCard(String madeofCard)
{
this.madeofCard = madeofCard;

}

public String getMakeofCard(){


	return madeofCard;
}

public void Swipe(Teacher teacher){

	System.out.println("Swipe the teacher");
}
public void Swipe(Student student){

	System.out.println("Swipe the student");
}
}
class Test{

    public static void main(String[] args) 
    {
        Teacher amjad = new Teacher(1,"Amjad",500);
        Teacher ahmed = new Teacher(2,"Ahmed",700);
        Teacher laiba = new Teacher(3,"Laiba",600);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(amjad);
        teacherList.add(ahmed);
        teacherList.add(laiba);


        Student ashraf = new Student(1,"Ashraf",4);
        Student suleman = new Student(2,"Suleman",12);
        Student rabbi = new Student(3,"Rabbi",5);
        List<Student> studentList = new ArrayList<>();

        studentList.add(ashraf);
        studentList.add(suleman);
        studentList.add(rabbi);




        School ghs = new School(teacherList,studentList);

        Teacher megan = new Teacher(6,"Megan", 900);
 Student usama = new Student(1,"Usama", 8);
        ghs.addTeacher(megan);


        rabbi.payFees(5000);
        suleman.payFees(6000);
        
        System.out.println(ghs.schoolName);
        System.out.println("GHS has earned $"+ ghs.getTotalMoneyEarned());

        System.out.println("------Making SCHOOL PAY SALARY----");
        ahmed.receiveSalary(ahmed.getSalary());
        System.out.println("GHS has spent for salary to " + ahmed.getName()
        +" and now has $" + ghs.getTotalMoneyEarned());

        amjad.receiveSalary(amjad.getSalary());
        System.out.println("GHS has spent for salary to " + amjad.getName()
                +" and now has $" + ghs.getTotalMoneyEarned());


        System.out.println(laiba);


        laiba.receiveSalary(laiba.getSalary());

        System.out.println(laiba);



        System.out.println("------Student report----");
        System.out.printf("best student : %s \n " , ashraf.getName());
    
    SwipeCard s = new SwipeCard("C25896");
    megan.logon(s);
    usama.logon(s);
    }
    }