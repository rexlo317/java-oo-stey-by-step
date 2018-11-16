package practice02;

public class Student {
    private String name;
    private int age;
    private int classNum;
    public Student(String name, int age, int classNum){
        this.name=name;
        this.age=age;
        this.classNum=classNum;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public int getKlass(){
        return classNum;
    }
    public String introduce(){
        return "I am a Student. I am at Class " + classNum + ".";
    }
}
