
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File: ");
        String file = scan.nextLine();
        try(Scanner read = new Scanner(Paths.get(file))){
            System.out.println("Team: ");
            String team = scan.nextLine();

            int games = 0;
            int wins = 0;
            int losses = 0;
            while(read.hasNextLine()){
                String line = read.nextLine();
                String[] parts = line.split(",");
                int firstScore = Integer.valueOf(parts[2]);
                int secondScore = Integer.valueOf(parts[3]);
                if(parts[0].equals(team) || parts[1].equals(team)){
                    games++;
                }
                if(parts[0].equals(team) && firstScore>secondScore){
                    wins++;
                }
                else if(parts[1].equals(team) && secondScore>firstScore){
                    wins++;
                }
                else if(parts[0].equals(team) && secondScore>firstScore){
                    losses++;
                }
                else if(parts[1].equals(team) && secondScore<firstScore){
                    losses++;
                }
            }

            System.out.println("Games: "+games);
            System.out.println("Wins: "+wins);
            System.out.println("Losses: "+losses);

        }
        catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
    }

}
