package gradepack;

import java.util.Arrays;

public class Operations {

    public double average(int[] grades) {
        int sum = 0;

        for (int g : grades) {
            sum += g;
        }

        return (double) sum / grades.length;
    }

    public int minimum(int[] grades) {
        int min = grades[0];

        for (int g : grades) {
            if (g < min) {
                min = g;
            }
        }

        return min;
    }

    public int maximum(int[] grades) {
        int max = grades[0];

        for (int g : grades) {
            if (g > max) {
                max = g;
            }
        }

        return max;
    }

    public double median(int[] grades) {
        int[] sorted = grades.clone();
        Arrays.sort(sorted);

        int n = sorted.length;

        if (n % 2 == 1) {
            return sorted[n / 2];
        } else {
            return (sorted[n / 2 - 1] + sorted[n / 2]) / 2.0;
        }
    }

    public double standardDeviation(int[] grades) {
        double avg = average(grades);
        double sum = 0;

        for (int g : grades) {
            sum += Math.pow(g - avg, 2);
        }

        return Math.sqrt(sum / grades.length);
    }
}




import java.util.Scanner;
import gradepack.Operations;

public class GradesStatistics {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Number of students must be positive.");
            sc.close();
            return;
        }

        int[] grades = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter grade " + (i + 1) + ": ");
            grades[i] = sc.nextInt();

            if (grades[i] < 0 || grades[i] > 100) {
                System.out.println("Invalid grade! Enter between 0 and 100.");
                i--;
            }
        }

        Operations op = new Operations();

        System.out.printf("Average: %.2f%n", op.average(grades));
        System.out.println("Minimum: " + op.minimum(grades));
        System.out.println("Maximum: " + op.maximum(grades));
        System.out.printf("Median: %.2f%n", op.median(grades));
        System.out.printf("Standard Deviation: %.2f%n",
                          op.standardDeviation(grades));

        sc.close();
    }
}