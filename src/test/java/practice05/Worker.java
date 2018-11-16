package practice05;

public class Worker {
    private String name;
    private int age;
    public Worker(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String introduce(){
        return "My name is " + this.name + ". I am " + this.age + " years old. I am a Worker. I have a job.";
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
}
