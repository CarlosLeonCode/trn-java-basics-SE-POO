import model.Doctor;

public class Main {
    public static void main(String[] args){
//      == Object instance from model.Doctor class
        Doctor juanito = new Doctor("carlos", "Programmer");
        juanito.setSpeciality("Cirugano");
//      == Object manipulation
        System.out.println(juanito);
//        System.out.println(juanito.id);
//        juanito.showName();
//        juanito.showId();
//
//        model.Doctor cracken = new model.Doctor();
//        cracken.showId();
//        ui.UIMenu.showMenu();
    }
}