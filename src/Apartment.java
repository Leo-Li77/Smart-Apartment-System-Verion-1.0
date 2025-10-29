import java.util.ArrayList;
import java.util.List;

public class Apartment {

    // Use ArrayList to simulate the dictionary (Use the first element in the arraylist as a key).
    // This list is created to store the objects.
    // Every person has 7 terms.
    // "false" indicates that this person has not applied for the iterm, "true" is the opposite.
    ArrayList<Boolean> iterms = new ArrayList<>(List.of(false, false, false, false, false, false, false));

    String name;
    String studentID;
    String phoneNumber;


    Apartment() {
        this.name = "NAME";
        this.studentID = "000000000000";
        this.phoneNumber = "00000000000";
    }

    Apartment(String name, String studentID, String phoneNumber) {
        setName(name);
        setStudentID(studentID);
        setPhoneNumber(phoneNumber);
    }


    // Setters and Getters
    public String getName() {
        return name;
    }
    public String getStudentID() {
        return studentID;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }

    //TODO
    public void setName(String name) {
        this.name = name;
    }
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    //TODO
    public void addTerm(int serialNumber) {

    }


    //TODO
    public void deleteTerm(int serialNumber) {

    }


    @Override
    public String toString() {
        return "Apartment{" +
                "name='" + name + '\'' +
                ", studentID=" + studentID +
                ", phoneNumber=" + phoneNumber +
                '}';
    }


}
