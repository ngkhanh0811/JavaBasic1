package Java14.test;

public class ClassStuff {
    private int classId;
    private String className;

    public ClassStuff(int classId, String className){
        this.classId = classId;
        this.className = className;
    }

    public int getClassId(){
        return classId;
    }

    public String getClassName(){
        return className;
    }

    void setClassId(int classId){
        this.classId = classId;
    }

    void setClassName(String className){
        this.className = className;
    }

    public String toString(){
        return "Id of class is: "+classId+", Name of class is: "+className;
    }
}
