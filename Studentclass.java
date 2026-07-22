class Student {
    int rollNo;
    String name;
    String dept;
    String Section;
    int Year;
    
    Student(int rollNo, String name,String dept,String Section,int Year)
    {
        this.rollNo= rollNo;
        this.name= name;
        this.dept= dept;
        this. Section= Section;
        this.Year= Year;
    }
    void display(){
        System.out.println("Rollno:"+ rollNo);
        System.out.println("Name:"+ name);
        System.out.println("Dept:"+ dept);
        System.out.println("Section:"+ Section);
        System.out.println("Year:"+ Year);
    }
}
public class Main{
     public static void main(String[] args) {
         Student[] Student= new Student[3];
         Student s1= new Student(101,"adhi","CSE","A",2006);
         Student[0]=s1;
         Student s2= new Student(102,"arun","CSE","A",2006);
         Student[1]=s2;
         Student[2]= new Student(103,"anu","CSE","A",2006);
         for(int i=0;i<Student.length;i++){
             Student[i].display();
         }
     
         }
}
