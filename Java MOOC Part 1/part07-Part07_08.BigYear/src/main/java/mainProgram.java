
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter
        
        Scanner scanner = new Scanner(System.in);
        BirdWatcher birdWatcher = new BirdWatcher();
        while(true){
            System.out.print("? ");
            String input = scanner.nextLine();
            if (input.equals("quit") || input.equals("Quit")){
                break;
            }else if(input.equals("add") || input.equals("Add")){
                addBird(scanner, birdWatcher);
            }else if(input.equals("observation") || input.equals("Observation")){
                System.out.println("Bird? ");
                String bird = scanner.nextLine();
                increaseCounter(bird, birdWatcher);
            }else if(input.equals("all") || input.equals("All")){
                birdWatcher.showAll();
            }else if(input.equals("one") || input.equals("One")){
                System.out.println("Bird? ");
                String bird=scanner.nextLine();
                showBird(bird, birdWatcher);
            }          
        }
    }
    private static void addBird(Scanner scanner, BirdWatcher birdWatcher){
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Latin Name: ");
        String latinName = scanner.nextLine();
        birdWatcher.addBird(name, latinName);
    }
    private static void increaseCounter(String bird, BirdWatcher birdWatcher){
        for (Bird chara:birdWatcher.getBirds()){
            if (chara.getName().equals(bird) || chara.getLatinName().equals(bird)){
                chara.increaseCount();
                return;
            }
        }
        System.out.println("Not a bird!");
    }
    private static void showBird(String bird, BirdWatcher birdWatcher){
        for (Bird chara:birdWatcher.getBirds()){
            if (chara.getName().equals(bird) || chara.getLatinName().equals(bird)){
                System.out.println(chara);
                return;
            }
        }
        System.out.println("Not a bird!");
    }

}
