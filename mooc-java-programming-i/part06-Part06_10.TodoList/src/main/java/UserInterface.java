import java.util.Scanner;

public class UserInterface {
    private TodoList list;
    private Scanner scanner;

    public UserInterface(TodoList list, Scanner scanner){
        this.list = list;
        this.scanner = scanner;
    }

    public void start(){
        while(true){
            System.out.print("Command: ");
            String command = scanner.nextLine();
            if(command.equals("stop")){
                break;
            }
            if(command.equals("add")){
                System.out.print("To add: ");
                String toAdd = scanner.nextLine();
                this.list.add(toAdd);
                continue;
            }
            if(command.equals("list")){
                this.list.print();
                continue;
            }
            if(command.equals("remove")){
                System.out.print("Which one is removed? ");
                int toRemove = Integer.valueOf(scanner.nextLine());
                this.list.remove(toRemove);
                continue;
            }
        }
    }
}
