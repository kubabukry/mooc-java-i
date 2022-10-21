import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private ArrayList<Bird> birds;

    public UserInterface(Scanner scanner){
        this.scanner = scanner;
        this.birds = new ArrayList<>();
    }

    public void start(){
        while(true){
            System.out.print("? ");
            String command = scanner.nextLine();

            if(command.equals("Quit")){
                break;
            }
            if(command.equals("Add")){
                System.out.print("Name: ");
                String name = scanner.nextLine();
                System.out.print("Name in Latin: ");
                String latin = scanner.nextLine();

                birds.add(new Bird(name, latin));
                continue;
            }
            if(command.equals("Observation")){
                System.out.print("Bird?");
                String name = scanner.nextLine();
                boolean listed = false;
                for(Bird bird : birds){
                    if(bird.getName().equals(name)){
                        bird.addObservation();
                        listed = true;
                    }
                }
                if(listed == false){
                    System.out.println("Not a bird!");
                }
                continue;
            }
            if(command.equals("All")){
                for(Bird bird : birds){
                    System.out.println(bird);
                }
                continue;
            }
            if(command.equals("One")){
                System.out.print("Bird?");
                String name = scanner.nextLine();
                for (Bird bird : birds){
                    if(bird.getName().equals(name)){
                        System.out.println(bird);
                    }
                }
                continue;
            }
        }
    }
}
