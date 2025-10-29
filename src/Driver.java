import java.util.Scanner;
import java.util.ArrayList;

public class Driver {


    ArrayList<Apartment> studentStore = new ArrayList<>();
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

    public void updateStatus() {

        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.print("Enter your studentID: ");
        String studentID = input.nextLine();
        System.out.print("""
                1)
                2)
                3)
                4)
                5)
                6)
                7)
                Enter your iterm number to update: 
                """);
        int itermNumber = input.nextInt();
        input.nextLine();




    }

public void getOption() {

        System.out.print("""
                0) Exit
                1) Start Processing
                2) End Processing
                3) Update Project Status
                4) Query Project
                5) Display Your Projects
                6) Display Everyone's Projects
                Enter the number to handle: 
                """);
        int projectNumber = input.nextInt();
        input.nextLine();

}


}
