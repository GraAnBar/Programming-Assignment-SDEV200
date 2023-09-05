package Chapter7;

import java.util.Scanner;


public class Exercise1 {

    static final int THRESHOLD = 4;
    
    public static void main(String[] args) {
        // TODO code application logic here
        // Chapter 7 Exercise 1
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = input.nextInt();
        System.out.print("Enter " + n + " scores: ");

        int[][] students = new int[3][n + THRESHOLD];

        for (int i = 0; i < n; i++) {
            students[0][i] = input.nextInt();
        }

        int bestScore = getBestScore(students);
        setGradeRange(students, bestScore);

        for (int i = 0; i < students[0].length - THRESHOLD; i++) {

            char grade = getStudentGrade(students, i);
            System.out.println("Student " + i + " score is " + students[0][i] + " and grade is " + grade);
        }
    }

    public static int getBestScore(int[][] students) {
        int bestScore = students[0][0];

        for (int i : students[0]) {
            if (i > bestScore) {
                bestScore = i;
            }
        }


        return bestScore;
    }

    public static void setGradeRange(int[][] students, int bestScore) {

        for (int i = 0; i < 4; i++) {
            students[1][i] = bestScore - (10 * (i + 1));

            students[2][i] = ('A' + i);
        }
    }

    public static char getStudentGrade(int[][] students, int index) {

        int grade = students[0][index];
        for (int i = 0; i < 4; i++) {
            if (grade >= students[1][i]) {
                return (char) students[2][i];
            }
        }
        return 'F';
    }
    
}
