public class Person {
    protected String myNAme;
    protected int myAge;
    protected String myGender;
   public Person(){} 
public Person(String name,int age,String gender){
myNAme=name;
myAge=age;
myGender=gender;
}
@Override
public String toString(){
    return myNAme+",age= "+myAge+",gender= "+myGender;
}
public int getage(){
    return myAge;
}
public String getgender(){
    return myGender;
}
public void setAge(int age){
myAge=age;
}
public void setgender(String gender){
    myGender=gender;
}
    
}
