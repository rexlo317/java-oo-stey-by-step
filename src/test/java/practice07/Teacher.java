package practice07;

public class Teacher {
    private String name;
    private int age;
    private Klass klass;

    public Teacher(String name, int age, Klass klass){
        this.name=name;
        this.age=age;
        this.klass=klass;
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
    public Klass getKlass(){
        return klass;
    }

    public String introduce(){
        if (this.klass != null)
            return  "My name is " + this.name + ". I am " + this.age + " years old. I am a Teacher. I teach Class " +  klass.getNumber() + ".";
        else
            return "My name is " + this.name + ". I am " + this.age + " years old. I am a Teacher. I teach No Class.";
    }

    public String introduceWith(Student student){
        if (this.klass.getNumber() != student.getKlass().getNumber())
            return  "My name is " + this.name + ". I am " + this.age + " years old. I am a Teacher. I don't teach " + student.getName() + ".";
        else
            return  "My name is " + this.name + ". I am " + this.age + " years old. I am a Teacher. I teach " + student.getName() + ".";
    }

}
