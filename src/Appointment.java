public class Appointment {
    private String name;
    private DayEnum day;

    private String reason;

    public Appointment(String name, DayEnum day, String reason) {
        this.name = name;
        this.day = day;
        this.reason = reason;
    }
    public void createAppoint(){
        switch (this.day){
            case MON : {
                System.out.println("Appointment set for Morning");
            }break;
            case TUE:{
                System.out.println("Appointment set for Afternoon");
            }break;
            case WED:{
                System.out.println("Appointment set for Evening");
            }break;
            case THU: {
                System.out.println("Appointment set for Lunch");
            }break;
            case FRI: {
                System.out.println("No its friday");
            }break;
            default:{
                System.out.println("NO APPOINTMENT AVAILABLE");
            }
        }
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "name='" + name + '\'' +
                ", day=" + day +
                ", reason='" + reason + '\'' +
                '}';
    }
}
