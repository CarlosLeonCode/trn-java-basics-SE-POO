public class Doctor {
//   Class attributes are
    static int id = 0;
    String name;
    String speciality;

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
}
