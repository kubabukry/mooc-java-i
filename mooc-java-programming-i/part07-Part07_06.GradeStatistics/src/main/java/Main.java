
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter points totals, -1 stops:");
        Points points = new Points();
        while (true){
            int input = Integer.valueOf(scanner.nextLine());
            if(input==-1){
                break;
            }
            points.add(input);
        }
        System.out.println("Point average (all): "+points.average());
        System.out.println("Point average (passing): "+points.averagePassing());
        System.out.println("Pass percentage: "+points.passPercentage());
        System.out.println("Grade distribution: ");
        points.gradeDistribution();
        // Write your program here -- consider breaking the program into 
        // multiple classes.
    }
}
