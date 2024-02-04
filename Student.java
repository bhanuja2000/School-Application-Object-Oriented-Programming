public class Student extends Person {
    // instance variable
    private int IdNumber;
    private double fee;
    private int grade;

    public Student(String name,int age,String gender,int id_number){
        super(name, age, gender);
        IdNumber=id_number;

    }
   public int  getIdNUm(){  //id number getter
    return IdNumber;
    }
    public double getFee(){ // fee getter
        return fee;
    }
    public void setgrade(int grade){
        this.grade=grade;           //grade setter
    }
    public void setId(int IdNumber){  // id setter

        this.IdNumber=IdNumber;
    }
    public void setFee(double fee){
        this.fee=fee;       //fee setter
    }
    public int getgrade(){
        return grade;   // grade getter
    }
public String toString(){   //toString method
    return super.toString()+" ID Number= "+IdNumber+" Fee= "+fee+" Grade= "+grade; 
}
}
