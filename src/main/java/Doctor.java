import java.util.ArrayList;
import java.util.Date;

public class Doctor {
//   Class attributes are
    static int id = 0;
    private String name;
    private String speciality;
    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();

//    Constructor definition, by default it is created one if we don't define one.
    Doctor(){
        System.out.println("This is my constructor method");
    }

//    Overload - Sobrecarga | method
    Doctor(String name, String speciality){
        System.out.println("The doctor name is " + name);
        id++;
        this.name = name;
        this.speciality = speciality;
    }

//    Class Methods
    public void showName(){
        System.out.println(name);
    }

    public void showId(){
        System.out.println("Doctor ID: " + id);
    }

    public void addAppointment(Date date, String time){
        availableAppointments.add(new AvailableAppointment(date, time));
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public static class AvailableAppointment{
        private int id;
        private Date date;
        private String time;

        public AvailableAppointment(Date date, String time){
            this.date = date;
            this.time = time;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }
    }
}
