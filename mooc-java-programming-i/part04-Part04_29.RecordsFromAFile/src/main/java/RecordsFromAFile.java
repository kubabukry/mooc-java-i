
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file: ");
        String file = scanner.nextLine();

        try (Scanner read = new Scanner(Paths.get(file))){

            while(read.hasNextLine()){
                String line = read.nextLine();
                String [] parts = line.split(",");
                String name = parts[0];
                int age = Integer.valueOf(parts[1]);

                if(age==1){
                    System.out.println(parts[0]+", age: "+parts[1]+" year");
                } else {
                    System.out.println(parts[0]+", age: "+parts[1]+" years");
                }
            }
        }
        catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}
