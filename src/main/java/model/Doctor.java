package model;

import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User {
//   Class attributes
    private String speciality;
    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();

//    == Constructor definition, by default it is created one if we don't define one.
//    model.Doctor(){
//        System.out.println("This is my constructor method");
//    }

//    Overload - Sobrecarga | method
    Doctor(String name, String email){
        super(name, email);
        System.out.println("The doctor name is " + super.getName());
        this.speciality = speciality;
    }

//    Class Methods

    public void addAppointment(Date date, String time){
        availableAppointments.add(new AvailableAppointment(date, time));
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

    @Override
    public String toString() {
        return super.toString() + "\nSpeciality: " +  speciality;
    }
}
