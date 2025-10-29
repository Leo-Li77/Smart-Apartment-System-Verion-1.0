public class Apartment {

    String name;
    long studentID;
    long phoneNumber;

    Apartment() {
        this.name = "";
        this.studentID = 202500000000L;
        this.phoneNumber = 11111111111L;
    }

    Apartment(String name, long studentID, long phoneNumber) {


    }


    // Setters and Getters
    public String getName() {
        return name;
    }
    public long getStudentID() {
        return studentID;
    }
    public long getPhoneNumber() {
        return phoneNumber;
    }

    //TODO
    public void setName(String name) {
        this.name = name;
    }
    public void setStudentID(long studentID) {
        this.studentID = studentID;
    }
    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
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
