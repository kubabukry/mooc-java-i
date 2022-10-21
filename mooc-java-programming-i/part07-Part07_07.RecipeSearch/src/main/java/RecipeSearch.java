
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Recipe> recipes = new ArrayList<>();
        ArrayList<String> lines = new ArrayList<>();

        System.out.print("File to read: ");
        String fileName = scanner.nextLine();
        System.out.println("Commands: ");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
        try(Scanner read = new Scanner(Paths.get(fileName))){
            int i = 0;
            ArrayList<String> ingredients = new ArrayList<>();
            while(true){
                String row = read.nextLine();
                if(row.isEmpty() || !(read.hasNextLine())){
                    i=0;
                    recipes.add(new Recipe(lines.get(0), Integer.valueOf(lines.get(1)), ingredients));
                    ingredients = new ArrayList<>();
                    continue;
                }
                lines.add(i, row);
                if(i>1){
                    ingredients.add(row);
                }
                i++;
            }
        } catch (Exception e){
            System.out.println("Error: "+ e.getMessage());
        }
        System.out.println("");
        String command = "";
        while(true){
            System.out.print("Enter command: ");
            command = scanner.nextLine();
            if(command.equals("list")){
                for(Recipe recipe : recipes){
                    recipe.show();
                    System.out.println("");
                }
            }
            if(command.equals("find name")) {
                String word = "";
                System.out.print("Searched word: ");
                word = scanner.nextLine();
                for (Recipe recipe : recipes) {
                    if (recipe.getName().contains(word)) {
                        recipe.show();
                    }
                }
                System.out.println("");
            }
            if(command.equals("find cooking time")){
                System.out.print("Max cooking time: ");
                int maxTime = Integer.valueOf(scanner.nextLine());
                System.out.println("");
                System.out.println("Recipes: ");
                for(Recipe recipe : recipes){
                    if(recipe.getTime()<=maxTime){
                        recipe.show();
                    }
                }
                System.out.println("");
            }
            if(command.equals("find ingredient")){
                System.out.print("Ingredient: ");
                String ingredient = scanner.nextLine();
                System.out.println("Recipes: ");
                for(Recipe recipe : recipes){
                    for(int i=0; i<recipe.getIngredients().size(); i++){
                        if(recipe.getIngredients().get(i).equals(ingredient)){
                            recipe.show();
                        }
                    }
                }
                System.out.println("");
            }
            if(command.equals("stop")){
                break;
            }

        }

    }

}
