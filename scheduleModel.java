import java.util.ArrayList; 

public class scheduleModel{
    ArrayList<classModel> ClassNames = new ArrayList <>();
    public scheduleModel(){
    }
    public void AddClass(classModel CLASSMODEL){
        ClassNames.add(CLASSMODEL);
    }
    public ArrayList<classModel> getClassinfo(){
        return ClassNames;
    }
}