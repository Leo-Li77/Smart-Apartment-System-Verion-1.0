/**
 * Points to Note
 * 1. Check-out Application: It is necessary to check that there are successfully completed accommodation applications before processing the check-out application.
 * 2. Accommodation Transfer Application: It is necessary to check whether there are successfully completed accommodation applications and unsuccessful check-out applications.
 * 3. Item Borrowing Application: Check if the previous item borrowing application was successfully completed.
 * 4. Activity Room Borrowing Application: Check if the previous activity room borrowing application was successfully completed.
 */


import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Driver {


    ArrayList<StudentApartment> studentStore = new ArrayList<>();
    Scanner input = new Scanner(System.in);


    public static void main(String[] args) {

        Driver driver = new Driver();

    }


    Driver() {

        runMenu();

    }


//    private void addStudent() {
//
//        System.out.print("Enter name: ");
//        String name = input.nextLine();
//        while (name.isEmpty()) {
//            System.out.print("Please enter a valid student name: ");
//            name = input.nextLine();
//        }
//
//        System.out.print("Enter student ID: ");
//        String studentID = input.nextLine();
//        while (studentID.length() != 12) {
//            System.out.print("Please enter a valid student ID: ");
//            studentID = input.nextLine();
//        }
//
//        System.out.print("Enter phone number: ");
//        String phoneNumber = input.nextLine();
//        if (phoneNumber.length() != 11) {
//            System.out.print("Please enter a valid phone number: ");
//            phoneNumber = input.nextLine();
//        }
//
//        StudentApartment newStudent = new StudentApartment(name, studentID, phoneNumber);
//        studentStore.add(newStudent);
//
//
//
//
//    }



    public void startProject() {

        System.out.println("\n---------------");
        System.out.println(" Start Project ");
        System.out.println("---------------");


        System.out.print("Enter name: ");
        String name = input.nextLine();
        while (name.isEmpty()) {
            System.out.print("Please enter a valid student name: ");
            name = input.nextLine();
        }

        System.out.print("Enter student ID: ");
        String studentID = input.nextLine();
        while (studentID.length() != 12) {
            System.out.print("Please enter a valid student ID: ");
            studentID = input.nextLine();
        }

        //TODO
        System.out.print("Enter phone number: ");
        String phoneNumber = input.nextLine();
        while (phoneNumber.length() != 11) {
            System.out.print("Please enter a valid phone number: ");
            phoneNumber = input.nextLine();
        }

        StudentApartment newStudent = new StudentApartment(name, studentID, phoneNumber);
        studentStore.add(newStudent);

        System.out.print("""
                ------------------------
                 Smart Apartment System
                ------------------------
                1) Accommodation Application
                2) Check-out Application
                3) Accommodation Transfer Application
                4) Apply Early
                5) Apply Late
                6) Item Borrowing Application
                7) Activity Room Borrowing Application
                8) Accommodation Notice
                """);
        System.out.print("Enter your iterm number to start: ");
        int startProjectNumber = input.nextInt();
        input.nextLine();


        boolean flag = false;
        for (int i = 0; i < studentStore.size(); i++) {
            if (studentStore.get(i).getStudentID().equals(studentID)) {
                studentStore.get(i).iterms.set(startProjectNumber - 1, 1);
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println("<Please enter a valid student ID!>");
        }





        /* 注意点
        1. 退宿申请：检查，有成功办结的住宿申请，才能办理退宿申请。
        2. 调宿申请：检查，有成功办结的住宿申请，且没有成功办结的退宿申请。
        3. 物品借用申请：检查，上一次的物品借用申请是否成功办结。
        4. 活动室借用申请：检查，上一次的活动室借用申请是否成功办结。
         */

    }



//    public void endProject() {
//
//
//
//    }


    public void updateStatus() {

        System.out.println("\n---------------");
        System.out.println(" Update Status ");
        System.out.println("---------------");

        System.out.print("Enter your studentID: ");
        String studentID = input.nextLine();
        while (studentID.length() != 12) {
            System.out.println("Please enter a valid student ID: ");
            studentID = input.nextLine();
        }

        System.out.print("""
                ------------------------
                 Smart Apartment System
                ------------------------
                1) Accommodation Application
                2) Check-out Application
                3) Accommodation Transfer Application
                4) Apply Early
                5) Apply Late
                6) Item Borrowing Application
                7) Activity Room Borrowing Application
                8) Accommodation Notice
                """);
        System.out.print("Enter your iterm number to update: ");
        int itermNumber = input.nextInt();
        input.nextLine();

        System.out.print("""
                \n----------------
                 Update Options
                ----------------
                1) Cancel the Application
                2) Application Succeeded
                3) Application Failed
                """);
        System.out.print("Enter your update option: ");
        int option = input.nextInt();
        input.nextLine();


        boolean flag = false;
        for (int i = 0; i < studentStore.size(); i++) {
            if (studentStore.get(i).getStudentID().equals(studentID)) {
                switch (option) {
                    case 1:
                         studentStore.get(i).cancelTerm(itermNumber - 1);
                         flag = true;
                        break;
                    case 2:
                        studentStore.get(i).applicationSuccess(itermNumber - 1);
                        flag = true;
                        break;
                    case 3:
                      studentStore.get(i).applicationFailed(itermNumber - 1);
                       flag = true;
                       break;
                      default:
                          System.out.println("<Please enter a valid option!>");
                          break;
                }
                break;
            }
        }
        if (!flag) {
            System.out.println("<Please enter a valid term number!>");
        }


}


//    public void queryProject() {
//
//        String studentID = input.nextLine();
//        while (studentID.length() != 12) {
//            System.out.println("Please enter a valid student ID:");
//            studentID = input.nextLine();
//        }
//
//        boolean flag = false;
//        for (int i = 0; i < studentStore.size(); i++) {
//            if (studentStore.get(i).getStudentID().equals(studentID)) {
//                System.out.println(studentStore.get(i));
//                flag = true;
//                break;
//            }
//        }
//        if (!flag) {
//            System.out.println("Student ID does not exist!");
//        }
//
//    }


    public void displayPersonalProject() {

        System.out.println("\n--------------------------");
        System.out.println(" Display Personal Project ");
        System.out.println("--------------------------");

        System.out.print("Enter your studentID: ");
        String studentID = input.nextLine();
        while (studentID.length() != 12) {
            System.out.println("Please enter a valid student ID: ");
            studentID = input.nextLine();
        }

        boolean flag = false;
        for (int i = 0; i < studentStore.size(); i++) {
            if (studentStore.get(i).getStudentID().equals(studentID)) {
                System.out.println(studentStore.get(i));
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println("<Student ID does not exist!>");
        }

    }


    public void displayAllProject() {

        System.out.println("---------------------");
        System.out.println(" Display All Project ");
        System.out.println("---------------------");

        for (int i = 0; i < studentStore.size(); i++) {
            System.out.println(studentStore.get(i));
        }

    }


    public void accommodationNotice() {
        System.out.println(
                """
                               -----------------------
                                 Accommodation Notice
                               -----------------------
                               1. Keep Quiet: Do not make loud noises after 23:30, open and close doors softly.
                               2. Shared Hygiene: take turns cleaning, clean up garbage daily, and arrange items neatly.
                               3. Save Resources: Turn off the lights and water at will, and use electrical appliances reasonably.
                               4. Friendship and Mutual Assistance: Respect differences, get along harmoniously, and communicate minor conflicts in a timely manner.
                               5. Safety First: Do not use illegal electrical appliances and lock doors and windows when leaving the dormitory.
                               """
                );
    }


    public int getOption0() {

        System.out.print("""
                --------------------
                 Operation Choosing
                --------------------
                0) Exit
                1) Start Processing
                2) Update Project Status
                3) Display Your Projects
                4) Display Everyone's Projects
                5) Accommodation Notice
                """);
        System.out.print("Enter the number of option to handle: ");
        int getOperationNumber = input.nextInt();
        input.nextLine();
        return getOperationNumber;

    }

    public void runMenu() {

        int option = getOption0();
        while (option != 0) {
            switch (option) {
                case 1:
                    startProject();
                    break;
                case 2:
                    updateStatus();
                    break;
                case 3:
                    displayPersonalProject();
                    break;
                case 4:
                    displayAllProject();
                    break;
                case 5:
                    accommodationNotice();
                    break;
                default:
                    System.out.println("<Invalid option. Try again.>");
                    break;
            }
            System.out.println("\n<Press Enter to continue...>");
            input.nextLine();
            option = getOption0();

        }


    }



} // End of Driver Class