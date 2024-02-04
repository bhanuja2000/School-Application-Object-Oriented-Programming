public class Teacher extends Person {

    double Salary;
    String Subject;
    Student student_1;
    Student student_2;
    Student student_3;

    
    public Teacher(String name,int age,double Salary,String gender,String subject,Student studet_1,Student student_2,Student student_3){
        super(name,age,gender);
        this.Salary=Salary;
        this.Subject=subject;
        this.student_1=studet_1;
        this.student_2=student_2;
        this.student_3=student_3;

    }
    public void setsalary(double Salary){
    this.Salary=Salary;
    }
    public void setsubject(String Subject){
        this.Subject=Subject;
    }
    public double getsalary(){
        return Salary;
    }
    public String getSubject(){
        return Subject;
    }
    public String toString(){
        return "Teacher Name= "+super.toString()+" Salary= "+Salary+" Subject= "+Subject+
        "   "+" First Student= "+student_1+" Second Student= "+student_2+" Third Student= "+student_3;
    }
    
}
