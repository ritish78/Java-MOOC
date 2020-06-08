
import java.util.Arrays;


public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {-1,3,1,2,3,-5};
        //System.out.println("Smallest: "+ MainProgram.smallest(array));
        //System.out.println("Index of smallest: "+MainProgram.indexOfSmallest(array));
        //System.out.println(MainProgram.indexOfSmallestFrom(array, 0));
        //System.out.println(MainProgram.indexOfSmallestFrom(array, 2));
       
        System.out.println(Arrays.toString(array));
        MainProgram.sort(array);
        System.out.println(Arrays.toString(array));
        
    }
    public static int smallest(int[] array){
        int smallest=array[0];
        for (int num:array){
            if (num<smallest){
                smallest=num;
            }
        }
        return smallest;
    }
    public static int indexOfSmallest(int[] array){
        int smallest=array[0];
        int index=0;
        for(int i=0; i<array.length;i++){
            if (array[i]<smallest){
                smallest=array[i];
                index=i;
            }
        }
        return index;
    }
    public static int indexOfSmallestFrom(int[] table, int startIndex){
       int smallest=table[startIndex];
       int index=startIndex;
       int i=startIndex;
       for(; i<table.length; i++){
           if (table[i]<smallest){
               smallest=table[i];
               index=i;
           }
       }
       return index;
    }
    public static void swap(int[] array, int index1, int index2){
        int temp = array[index1];
        array[index1]=array[index2];
        array[index2]=temp;
    }
    
    public static void sortArrays(int[] array){
       
        int a=0;
        for (int i=0; i<array.length; i++){
            for (int j=0; j<=i; j++){
                if(array[j]>array[i]){
                    a=array[j];
                    array[j]=array[i];
                    array[i]=a;
                }
                System.out.println(Arrays.toString(array));
            }
        }      
    }
    public static void sort(int[] array){
      
        int n = array.length;
        for(int i = 0; i<n-1; i++){
            int min=i;
            for(int j=i+1; j<n; j++){
                if(array[j]<array[min]){
                    min=j;
                }
            }
            int temp=array[min];
            array[min]=array[i];
            array[i]=temp;
            System.out.println(Arrays.toString(array));
        }
    }
}
