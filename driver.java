public class driver {
   public static void main(String[] args) {
     
      classModel model  = new classModel();
      classView view = new classView();

      classModel model2  = new classModel();
      classView view2 = new classView();

      scheduleModel scmodel= new scheduleModel();
      scheduleView scview = new scheduleView();

      scheduleController sc_controller = new scheduleController(scview, scmodel);

      ClassController controller = new ClassController(model, view);
      ClassController controller2 = new ClassController(model2, view2);

      controller.setClassNumber(34);
      controller.setClassTitle("MATH");
      controller.setClassInstructor("Prof. good");
      controller.setClassMeetingDays("Tuesdays");
      controller.setClassMeetingTimes("1 PM");

      controller.updateClass();
      sc_controller.AddClassToSchedule(model);

      controller2.setClassNumber(35);
      controller2.setClassTitle("MATH2");
      controller2.setClassInstructor("Prof. bad");
      controller2.setClassMeetingDays("Thursdays");
      controller2.setClassMeetingTimes("7 PM");

      controller2.updateClass();
      sc_controller.AddClassToSchedule(model2);


      sc_controller.ClassscheduleView();
   }
}