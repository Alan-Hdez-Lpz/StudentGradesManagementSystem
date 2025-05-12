import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {

        double[] grades = new double[10];
        Scanner input = new Scanner(System.in);
        boolean validation = false;
        boolean inputGrades = false;
        do{
            System.out.println("Welcome to the Student Grades Management System!\n" +
                    "\n" +
                    "Please select an operation:\n" +
                    "1. Input grades\n" +
                    "2. Calculate the average grade\n" +
                    "3. Find the highest and lowest grades\n" +
                    "4. Display the grades");
            int operation = input.nextInt();
            switch (operation) {
                case 1:
                    System.out.println("Enter the grades: ");
                    for (int i = 0; i < grades.length; i++) {
                        System.out.println("Grade " + (i + 1) + ": ");
                        grades[i] = input.nextDouble();
                    }
                    inputGrades = true;
                    break;
                case 2:
                    if(inputGrades) {
                        double average = 0;
                        for (int i = 0; i < grades.length; i++) {
                            average += grades[i];
                        }
                        average /= grades.length;
                        System.out.println("Average grade: " + average);
                    }
                    else {
                        System.out.println("You need to Input Grades first!");
                    }
                    break;
                case 3:
                    if(inputGrades) {
                        double maxGrade = grades[0];
                        double minGrade = grades[0];
                        for (int i = 1; i < grades.length; i++) {
                            if (maxGrade < grades[i]){
                                maxGrade = grades[i];
                            }
                            if (minGrade > grades[i]){
                                minGrade = grades[i];
                            }
                        }
                        System.out.println("Highest Grade: " + maxGrade);
                        System.out.println("Lowest Grade: " + minGrade);
                    } else {
                        System.out.println("You need to Input Grades first!");
                    }
                    break;
                case 4:
                    if(inputGrades) {
                        for (int i = 0; i < grades.length; i++) {
                            System.out.println("Grade " + (i + 1) + ": " + grades[i]);
                        }
                    } else {
                        System.out.println("You need to Input Grades first!");
                    }
                    break;
                default:
                    System.out.println("Invalid operation");
                    break;
            }
            System.out.println("Do you want to make another operation? (y/n)");
            String answer = input.next();
            if (answer.equalsIgnoreCase("y")) {
                validation = true;
            } else if (answer.equalsIgnoreCase("n")) {
                validation = false;
            } else {
                System.out.println("Invalid input");
                validation = false;
            }
        } while (validation);
    }
}
