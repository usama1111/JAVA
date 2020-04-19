import java.util.ArrayList;
class Course{
private String Name;
ArrayList<String> list = new <String> ArrayList();
Course(String Name){
    this.Name=Name;
}    
public void addStudent(String student){
        list.add(student);
    }

public void dropStudent(String student){
        System.out.println(list.remove(student)?"Succesfully drop the student":"Enter the correct name");
    }

 public ArrayList<String> getList(){
        return list;
    }
public String getName()
{
    return Name;
}
}
public class Task4{
    public static void main(String[] args){
    Course[] p=new Course[2];
    p[0] = new Course("Computer"); 
    p[1] = new Course("English");
    Course[] q=new Course[2];
    q[0] = new Course("Maths");
    q[1] = new Course("OC");
    for(int i=0;i<p.length;i++){
        p[i].addStudent(i+ "Muhammad Asim");
        p[i].dropStudent(i+"Muhammad Asim");
        p[i].addStudent(i+"Muhammad Sami");
        p[i].dropStudent(i+"Muhammad Sami");
        p[i].addStudent(i+"Asad");
        System.out.println("No of student in "+p[i].getName()+" is: "+p[i].getList());}
     for(int i=0;i<q.length;i++){   
        q[i].addStudent("Muhammad Nazim");
        q[i].dropStudent("Muhammad Nazim");
        q[i].addStudent("Muhammad Asad");
        q[i].addStudent("Muhammad Sami");
        q[i].addStudent("Muhammad Nazim");
        q[i].dropStudent("Muhammad Sami");
        System.out.println("No of student in "+q[i].getName()+" is: "+q[i].getList());}
   
    
    
}
}  
