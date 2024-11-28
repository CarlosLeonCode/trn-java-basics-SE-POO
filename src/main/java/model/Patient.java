package model;

//Use Command + N to generate Getters & Setters from IDE
public class Patient extends User {
    private String birthday;
    private Double weight;
    private Double height;
    private String blood;

    Patient(String name, String email){
        super(name, email);
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getHeight() {
        return height + " Mts.";
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    public void setWeight(){
        this.weight = weight;
    }

    public String getWeight(){
        return this.weight + " kg.";
    }
}
