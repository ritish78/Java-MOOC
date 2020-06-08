
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        for (int i = 1; i <= number; i++) {
            System.out.print("*");
        }
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        for (int i = 1; i <= number; i++) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        for (int i = 1; i <= size; i++) {
            for (int j = i; j < size; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void christmasTree(int height) {
        //int i,j,k,l,m,n;
        
        for (int i = 1; i <= height; i++) {
            for (int j=(height-i); j>=1; j--){
                System.out.print(" ");
            }
            for (int k=1; k<=(i*2)-1; k++){
                System.out.print("*");
            }
            System.out.println("");
        }
        int maxWidth =(height*2)+1;
        int center=maxWidth/2-1;
        for (int i=0; i<2; i++){
            for (int j=center-1; j>=1; j--){
                System.out.print(" ");
            }
            for (int k=(height/2)-1; k<=(height/2)+1; k++){
                System.out.print("*");
            }
            System.out.println("");
        }
        
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.
        //printStars(4);
        //printSpaces(4);

        printTriangle(5);
        System.out.println("---");
        christmasTree(10);
        System.out.println("---");
        //christmasTree(10);
    }
}
