import java.util.Scanner;

public class UserInterface {
    private JokeManager manager;
    private Scanner scanner;

    public UserInterface(JokeManager jokeManager, Scanner scanner){
        this.manager = jokeManager;
        this.scanner = scanner;
    }

    public void start(){
        while(true) {
            System.out.println("Commands: ");
            System.out.println("1 - add a joke");
            System.out.println("2 - draw a joke");
            System.out.println("3 - list jokes");
            System.out.println("X - stop");
            String command = scanner.nextLine();
            if (command.equals("X")) {
                break;
            }
            if(command.equals("1")){
                System.out.println("Write the joke to be added: ");
                String joke = scanner.nextLine();
                manager.addJoke(joke);
                continue;
            }
            if(command.equals("2")){
                System.out.println("Drawing joke: ");
                System.out.println(manager.drawJoke());
                continue;
            }
            if(command.equals("3")){
                System.out.println("Printing jokes.");
                manager.printJokes();
                continue;
            }
            if(command.equals("X")||command.equals("x")){
                break;
            }
        }
    }
}
