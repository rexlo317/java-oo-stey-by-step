package practice08;

public class Klass {
    private int classNum = 0;
    private String className = null;
    private Student leader = null;

    public Klass(int classNum){
        this.classNum=classNum;
        this.className = "Class " + classNum;
    }
    public int getNumber(){
        return this.classNum;
    }
    public String getDisplayName(){
        return className;
    }
    public void assignLeader(Student leader){
        this.leader = leader;
    }
    public Student getLeader(){
        return leader;
    }
}
