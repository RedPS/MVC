public class scheduleController{
    private scheduleView SCVIEW;
    private scheduleModel SCMODEL;

    public scheduleController(scheduleView SCVIEW, scheduleModel SCMODEL){
        this.SCVIEW = SCVIEW;
        this.SCMODEL = SCMODEL;
    }
    
    public void AddClassToSchedule(classModel CLASSMODEL){
        SCMODEL.AddClass(CLASSMODEL);
    }
    public void ClassscheduleView(){
        SCVIEW.printScheduleDetails(SCMODEL.getClassinfo());
    }
}