
public class Main {

    public static void main(String[] args) {
        Gift book = new Gift("Harry Potter and the Philosopher's Stone", 2);
        Gift another = new Gift("Mula sag", 3);
        Package packages = new Package();
        packages.addGift(book);
        packages.addGift(another);
        System.out.println("Gift: "+book);
        System.out.println("Gift: "+another);
        System.out.println(packages.totalWeight());


        

    }
}
