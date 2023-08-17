// students grade calculater based on thier percentage criteria 
// implemented using core java with console based interface

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the codsoft task-2!");
        System.out.println("task-2: Students Grade Calculator.");
        System.out.println("---------------------------------");
        System.out.println();
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();
        
        int total_Marks = 0;
        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter marks obtained in subject " + i + ": ");
            int marks = scanner.nextInt();
            total_Marks += marks;
        }
        
        double avg_Percentage = (double) total_Marks / numSubjects;
        char grade = calculateGrade(avg_Percentage);
        System.out.println("--------------------------------------");
        System.out.println("\nTotal Marks: " + total_Marks);
        System.out.println("Average Percentage: " + avg_Percentage + "%");
        System.out.println("Grade: " + grade);
        
        scanner.close();
    }
    
    public static char calculateGrade(double percentage) {
        if (percentage >= 90) {
            return 'A';
        } else if (percentage >= 80) {
            return 'B';
        } else if (percentage >= 70) {
            return 'C';
        } else if (percentage >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
}
