public class Test {
    

    public static void main(String[] args) {
        Person jack=new Person("jack Brooke",27,"M");
        System.out.println(jack);
        Student beth=new Student("Elisebeth Smith", 16, "F", 1222233);
        Student Bhanuja=new Student("Bhanuja Rathsara", 23, "M", 20005);
        Student Kavidu=new Student("Kavidu Kumara", 21, "M", 122567);
        Teacher sam=new Teacher("Same Hamilton", 34, 50000, "M", "Computer Science",Bhanuja,Kavidu,beth);
        System.out.println(sam);
    }
}
