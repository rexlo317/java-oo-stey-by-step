package practice03;

public class Worker {
    private String name;
    private int age;
    public Worker(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String introduce(){
        return "I am a Worker. I have a job.";
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
}
