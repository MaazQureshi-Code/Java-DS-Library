
import java.util.Scanner;

public class Q1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of students:");
        int numStudents = scanner.nextInt();

        int[] scores = new int[numStudents];
        String[] studentGrades = new String[numStudents];

        System.out.printf("Enter scores for %d students:%n", numStudents);
        for (int i = 0; i < scores.length; i++) {
            scores[i] = scanner.nextInt();
        }

        assignGrades(scores, studentGrades);

        for (int i = 0; i < scores.length; i++) {
            System.out.printf("Student %d score is %d and grade is %s%n", i + 1, scores[i], studentGrades[i]);
        }
        scanner.close();




    }



    public static void assignGrades(int[] scores, String[] grades) {
        int maxScore = 0;

        // Find the max score and assign grades in one loop
        for (int score : scores) {
            if (score > maxScore) {
                maxScore = score;
            }
        }

        // Assign grades based on the grading scheme
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] >= maxScore - 10) {
                grades[i] = "A";
            } else if (scores[i] >= maxScore - 20) {
                grades[i] = "B";
            } else if (scores[i] >= maxScore - 30) {
                grades[i] = "C";
            } else if (scores[i] >= maxScore - 40) {
                grades[i] = "D";
            } else {
                grades[i] = "F";
            }
        }
    }
}