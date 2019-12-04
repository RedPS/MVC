public class ClassController{
    private classModel CLASSMODEL;
    private classView CLASSVIEW;

    public ClassController(classModel CLASSMODEL, classView CLASSVIEW){
        this.CLASSMODEL = CLASSMODEL;
        this.CLASSVIEW = CLASSVIEW;
    }
    
    public void setClassNumber(int number){
        CLASSMODEL.setNumber(number);
    }
    public void setClassTitle(String title){
        CLASSMODEL.setTitle(title);
    }
    public void setClassInstructor(String instructor){
        CLASSMODEL.setInstructor(instructor);
    }
    public void setClassMeetingDays(String meetingDays){
        CLASSMODEL.setMeetingDays(meetingDays);
    }
    public void setClassMeetingTimes(String meetingTimes){
        CLASSMODEL.setMeetingTimes(meetingTimes);
    }

    /// getters 
    public int getClassNumber(){
        return CLASSMODEL.getNumber();
    }
    public String getClassTitle(){
        return CLASSMODEL.getTitle();
    }
    public String getClassInstructor(){
        return CLASSMODEL.getInstructor();
    }
    public String getClassMeetingDays(){
        return CLASSMODEL.getMeetingDays();
    }
    public String getClassMeetingTimes(){
        return CLASSMODEL.getMeetingTimes();
    }

    public void updateClass(){
        CLASSVIEW.printClassDetails(CLASSMODEL.getNumber(), CLASSMODEL.getTitle(), CLASSMODEL.getInstructor(), CLASSMODEL.getMeetingDays(), CLASSMODEL.getMeetingTimes());
    }
}