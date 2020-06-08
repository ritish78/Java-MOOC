
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        System.out.print("File to read: ");
        String file = scanner.nextLine();
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
        while (true) {
            try (Scanner fileScanner = new Scanner(Paths.get(file))) {

                System.out.println("Enter command: ");
                String command = scanner.nextLine();
                if (command.equals("stop")) {
                    break;
                } else if (command.equals("list")) {
                    System.out.println("Recipes:");
                    System.out.println(fileScanner.nextLine() + ", cooking time: " + fileScanner.nextLine());
                    while (fileScanner.hasNextLine()) {
                        if (fileScanner.nextLine().isBlank()) {
                            System.out.println(fileScanner.nextLine() + ", cooking time: " + fileScanner.nextLine());
                        }
                    }
                } else if (command.equals("find name")) {
                    System.out.print("Searched word: ");
                    String word = scanner.nextLine();
                    while (fileScanner.hasNextLine()) {
                        String recipeName = fileScanner.nextLine();
                        if (recipeName.contains(word)) {
                            System.out.println(recipeName + ", cooking time: " + fileScanner.nextLine());
                        }
                    }
                } else if (command.equals("find cooking time")) {
                    System.out.print("Max cooking time: ");
                    int time = Integer.valueOf(scanner.nextLine());
                    System.out.println("Recipes:");
                    String recipeName = fileScanner.nextLine();
                    int cookingTime = Integer.valueOf(fileScanner.nextLine());
                    if (cookingTime <= time) {
                        System.out.println(recipeName + ", cooking time: " + cookingTime);
                    }
                    while (fileScanner.hasNextLine()) {
                        if (fileScanner.nextLine().isBlank()) {
                            recipeName = fileScanner.nextLine();
                            cookingTime = Integer.valueOf(fileScanner.nextLine());
                            if (cookingTime <= time) {
                                System.out.println(recipeName + ", cooking time: " + cookingTime);
                            }
                        }
                    }
                } else if (command.equals("find ingredient")) {
                    System.out.print("Ingredient: ");
                    String ingredient = scanner.nextLine();
                    String recipeName = fileScanner.nextLine();
                    int cookingTime = Integer.valueOf(fileScanner.nextLine());
                    while (fileScanner.hasNextLine()) {
                        String line = fileScanner.nextLine();
                        if (line.equals(ingredient)) {
                            System.out.println(recipeName + ", cooking time: " + cookingTime);
                        }
                        if (line.isEmpty()) {
                            recipeName = fileScanner.nextLine();
                            cookingTime = Integer.valueOf(fileScanner.nextLine());
                        }
                    }
                }

            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
