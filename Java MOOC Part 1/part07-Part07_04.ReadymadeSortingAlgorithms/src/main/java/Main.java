
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;



public class Main {

    public static void main(String[] args) {
        // insert test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        String[] stringArray = {"mero", "nam", "k", "ho", "a"};
        ArrayList<Integer> integerArray = new ArrayList<>();
        integerArray.add(2);
        integerArray.add(-1);
        integerArray.add(3);
        integerArray.add(-5);
        integerArray.add(4);
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("what");
        stringArrayList.add("kati");
        stringArrayList.add("dherai");
        stringArrayList.add("type");
        stringArrayList.add("garnu");
        
        sort(array);
        System.out.println(Arrays.toString(array));
        sort(stringArray);
        System.out.println(Arrays.toString(stringArray));
        sortIntegers(integerArray);
        System.out.println(integerArray);
        sortStrings(stringArrayList);
        System.out.println(stringArrayList);
    }
    public static void sort(int[] array){
        Arrays.sort(array);
        
    }
    public static void sort(String[] array){
        Arrays.sort(array);
        
    }
    public static void sortIntegers(ArrayList<Integer> integers){
        Collections.sort(integers);
        
    }
    public static void sortStrings(ArrayList<String> strings){
        Collections.sort(strings);
        
    }

}
