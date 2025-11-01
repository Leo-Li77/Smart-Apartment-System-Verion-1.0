import java.util.ArrayList;
import java.util.List;

public class StudentApartment {

    // Use ArrayList to simulate the dictionary (Use the first element in the arraylist as a key).
    // This list is created to store the objects.
    // Every person has 7 terms.
    /*
    Each term has 4 status:
      0: Not in Progress (before start but not succeeded or failed)
      1: In Progress
      2: Processing Succeeded
      3: Processing Failed
     */
    ArrayList<Integer> iterms = new ArrayList<>(List.of(0, 0, 0, 0, 0, 0, 0, 0));
    ArrayList<String> status = new ArrayList<>(List.of("<Not in Progress>", "<In Progress>", "<Processing Succeeded>", "<Processing Failed>"));

    String name;
    String studentID;
    String phoneNumber;


    StudentApartment() {
        this.name = "NAME";
        this.studentID = "000000000000";
        this.phoneNumber = "00000000000";
    }

    StudentApartment(String name, String studentID, String phoneNumber) {
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


//    public void startApplication(int serialNumber) {
//
//    }


    //TODO 1
    public void cancelTerm(int serialNumber) {

        if (iterms.get(serialNumber) == 1) {
            iterms.set(serialNumber, 3);
        }

    }


    //TODO 1
    public void applicationSuccess(int serialNumber) {

        if (iterms.get(serialNumber) == 1) {
            iterms.set(serialNumber, 2);
        }

    }


    //TODO 1
    public void applicationFailed(int serialNumber) {

        if (iterms.get(serialNumber) == 1) {
            iterms.set(serialNumber, 3);
        }

    }


    @Override
    public String toString() {

        return "{" +
               "<Name> " + name + "\n" +
               "<Student ID> " + studentID + "\n" +
               "<Phone Number> " + phoneNumber + "\n" +
               "<Iterms' Status> " + "\n" +
               "  [Accommodation Application] " + status.get(iterms.get(0)) + "\n" +
               "  [Check-out Application] " + status.get(iterms.get(1)) + "\n" +
               "  [Accommodation Transfer Application] " + status.get(iterms.get(2)) + "\n" +
               "  [Apply Early] " + status.get(iterms.get(3)) + "\n" +
               "  [Apply Late] " + status.get(iterms.get(4)) + "\n" +
               "  [Item Borrowing Application] " + status.get(iterms.get(5)) + "\n" +
               "  [Activity Room Borrowing Application] " + status.get(iterms.get(6)) + "\n" +
               "  [Accommodation Notice] " + status.get(iterms.get(7)) + "\n" +
               "}\n";

    }


} // End of StudentApartment Class