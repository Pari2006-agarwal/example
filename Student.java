public class Student {
    String name;
    int grade;
    public void displayInfo(){
        System.out.println("StudentName:"+name+"|Grade:"+grade);
    }
    public static void main(String[] args){
        Student student1 = new Student();
        student1.name = "Pari";
        student1.grade = 1;
        Student student2 = new Student();
        student2.name = "Neha";
        student2.grade = 2;
        student1.displayInfo();
        student2.displayInfo();

    }
}
