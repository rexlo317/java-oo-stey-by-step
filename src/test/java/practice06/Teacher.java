package practice06;

public class Teacher {
    private String name;
    private int age;
    private int classNum;
    public Teacher(String name, int age, int classNum){
        this.name=name;
        this.age=age;
        this.classNum=classNum;
    }

    public Teacher(String name, int age){
        this.name=name;
        this.age=age;
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
        if (this.classNum != 0)
            return  "My name is " + this.name + ". I am " + this.age + " years old. I am a Teacher. I teach Class " +  classNum + ".";
        else
            return "My name is " + this.name + ". I am " + this.age + " years old. I am a Teacher. I teach No Class.";
    }
}
