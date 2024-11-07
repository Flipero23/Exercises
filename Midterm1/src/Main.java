import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double s1,s2,s3;
        System.out.println("Enter score for test 1: ");
        s1 = scanner.nextDouble();
        System.out.println("Enter score for test 2: ");
        s2 = scanner.nextDouble();
        System.out.println("Enter score for test 3: ");
        s3 = scanner.nextDouble();

        double average = (s1+s2+s3)/3.0;

        String performance;
        if(average>=85){
            performance = "Excellent";
        } else if (average<85 && average >=70) {
            performance = "Good";
        } else if (average<70 && average >=50) {
            performance = "Average";
        }
        else {
            performance = "Poor";
        }

        System.out.println("\nAverage score: " + average);
        System.out.println("Performance: " + performance);


    }
}