package practice07;

public class Klass {
    private int classNum = 0;
    private String className = null;
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
}
