import java.util.ArrayList;
import java.util.List;

public class Apartment {

    // Use ArrayList to simulate the dictionary (Use the first element in the arraylist as a key).
    // This list is created to store the objects.
    // Every person has 7 terms.
    /*
    Each term has 4 status:
      0: Not in Progress
      1: In Progress
      2: Successfully Processed
      3: Processing Failed
     */
    ArrayList<Integer> iterms = new ArrayList<>(List.of(0, 0, 0, 0, 0, 0, 0));

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
