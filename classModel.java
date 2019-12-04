public class classModel{
    private int number;
    private String title;
    private String instructor;
    private String meetingDays;
    private String meetingTimes;

    public void setNumber(int number){
        this.number = number;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public void setInstructor(String instructor){
        this.instructor = instructor;
    }
    public void setMeetingDays(String meetingDays){
        this.meetingDays = meetingDays;
    }
    public void setMeetingTimes(String meetingTimes){
        this.meetingTimes = meetingTimes;
    }
    public int getNumber(){
        return number;
    }
    public String getTitle(){
        return title;
    }
    public String getInstructor(){
        return instructor;
    }
    public String getMeetingDays(){
        return meetingDays;
    }
    public String getMeetingTimes(){
        return meetingTimes;
    }
}