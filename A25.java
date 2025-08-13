import java.util.Scanner;

public class A25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking student data as input
        System.out.println("Enter student name: ");
        String studentName = input.nextLine();

        System.out.println("Enter student ID: ");
        int studentID = input.nextInt();

        System.out.println("Enter student age: ");
        int studentAge =input.nextInt();
        

        System.out.println("Enter student fee: ");
        float studentFee = input.nextFloat();

        System.out.println("Enter student grade: ");
        char studentGrade = input.next().charAt(0);

        // Printing student details
        System.out.println("\nStudent Details:");
        System.out.println("Student name: " + studentName);
        System.out.println("Student ID: " + studentID);
        System.out.println("Student age: " + studentAge);
        System.out.println("Student fee: " + studentFee);
        System.out.println("Student grade: " + studentGrade);

        input.close();
    }
}
