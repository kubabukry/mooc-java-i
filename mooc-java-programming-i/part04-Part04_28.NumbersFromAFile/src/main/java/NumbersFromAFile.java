
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        ArrayList<Integer> numbers = new ArrayList<>();

        try(Scanner read = new Scanner(Paths.get(file))){
            while(read.hasNextLine()){
                int number = Integer.valueOf(read.nextLine());
                if(number>=lowerBound && number<=upperBound) {
                    numbers.add(number);
                }
            }
        }
        catch (Exception e){
            System.out.println("Error: "+e.getMessage());
        }
        System.out.println("Numbers: "+numbers.size());

    }

}
