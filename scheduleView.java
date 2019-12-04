import java.util.ArrayList; 

public class scheduleView {
   public void printScheduleDetails(ArrayList<classModel> Class){
      System.out.println("Class: ");
      for (classModel i: Class){
          System.out.println(i.getTitle());
      }
   }
}