/**
 * Points to Note
 * 1. Check-out Application: It is necessary to check that there are successfully completed accommodation applications before processing the check-out application.
 * 2. Accommodation Transfer Application: It is necessary to check whether there are successfully completed accommodation applications and unsuccessful check-out applications.
 * 3. Item Borrowing Application: Check if the previous item borrowing application was successfully completed.
 * 4. Activity Room Borrowing Application: Check if the previous activity room borrowing application was successfully completed.
 */


import java.util.Scanner;
import java.util.ArrayList;

public class Driver {


    ArrayList<StudentApartment> studentStore = new ArrayList<>();
    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {



    }


    //TODO
    Driver() {



    }


    //TODO
    private void addStudent() {

    }


    //TODO
    private void printTable() {

        System.out.print("");

    }



    //TODO
    public void startProject() {

        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.print("Enter your studentID: ");
        String studentID = input.nextLine();
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
                Enter your iterm number to update: """);
        int startProjectNumber = input.nextInt();
        input.nextLine();

        /* 注意点
        1. 退宿申请：检查，有成功办结的住宿申请，才能办理退宿申请。
        2. 调宿申请：检查，有成功办结的住宿申请，且没有成功办结的退宿申请。
        3. 物品借用申请：检查，上一次的物品借用申请是否成功办结。
        4. 活动室借用申请：检查，上一次的活动室借用申请是否成功办结。
         */

    }


    //TODO
    public void endProject() {

    }


    //TODO
    public void updateStatus() {

        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.print("Enter your studentID: ");
        String studentID = input.nextLine();
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
                Enter your iterm number to update: """);



        int itermNumber = input.nextInt();
        input.nextLine();




    }


    //TODO
    public void queryProject() {

    }


    //TODO
    public void displayPersonalProject() {

    }


    //TODO
    public void displayAllProject() {

    }


    //TODO
    public void accommodationNotice() {

    }


    //TODO
    public void getOption() {

        System.out.print("""
                --------------------
                 Operation Choosing
                --------------------
                0) Exit
                1) Start Processing
                2) End Processing
                3) Update Project Status
                4) Query Project
                5) Display Your Projects
                6) Display Everyone's Projects
                7) Accommodation Notice
                Enter the number of option to handle: """);

        int getOperationNumber = input.nextInt();
        input.nextLine();

    }


} // End of Driver Class