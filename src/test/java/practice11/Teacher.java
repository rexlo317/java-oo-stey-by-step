package practice11;

import java.util.LinkedList;

public class Teacher {
    private String name;
    private int age;
    private LinkedList<Klass> klass;
    private int id;

    public Teacher(int id, String name, int age, LinkedList<Klass> klasses){
        this.name=name;
        this.age=age;
        this.klass=klasses;
        this.id = id;
        for(Klass klass: klasses){
            klass.setTeacher(this);
        }
    }

    public Teacher(int id, String name, int age){
        this.name=name;
        this.age=age;
        this.id = id;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public LinkedList<Klass> getClasses(){
        return klass;
    }

    public String introduce(){
        if(this.klass != null){
            int klassSize = klass.size();
            String klassString = Integer.toString(this.klass.get(0).getNumber());
            for(int i = 1; i<=klass.size()-1; i++){
                klassString +=", ";
                klassString +=Integer.toString(this.klass.get(i).getNumber());
                i++;
            }
           return "My name is " + this.name + ". I am " + this.age + " years old. I am a Teacher. I teach Class " + klassString + ".";
        }
        else
            return "My name is " + this.name + ". I am " + this.age + " years old. I am a Teacher. I teach No Class.";
    }

    public void knowStudentIn(Student student){
        System.out.print("I am " + name + ". I know " + student.getName() + " has joined Class " + student.getKlass().getNumber()+ ".\n");
    }

    public void knowStudentLeader(Student student){
        System.out.print("I am " + name + ". I know " + student.getName() + " become Leader of Class " + student.getKlass().getNumber()+ ".\n");
    }

    public String introduceWith(Student student){

        if (this.klass.contains(student.getKlass()))
            return  "My name is " + this.name + ". I am " + this.age + " years old. I am a Teacher. I teach " + student.getName() + ".";
        else
            return  "My name is " + this.name + ". I am " + this.age + " years old. I am a Teacher. I don't teach " + student.getName() + ".";
    }

    public boolean isTeaching(Student student){
        if (this.klass.contains(student.getKlass())){
            return true;
        }
        else
            return false;
    }
/*
    public void showStudentIn(Student student){
        System.out.print("I am " + this.name + ". I know " + student.getName() + " has joined Class " + student.getKlass().getNumber() + ".\n");
    }

    public void showStudentLeader(Student student){
        System.out.print("I am " + this.name + ". I know " + student.getName() + " become Leader of Class " + student.getKlass().getNumber() + ".\n");
    }
*/
}
