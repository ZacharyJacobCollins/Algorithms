import java.util.*;
public class InsertionSort {
    
       public static void main(String args[]) {
    	   insertionSort();
       }
       
       public static ArrayList<Integer> insertionSort() {
    	   ArrayList<Integer> list = new ArrayList<Integer>();
    	   Scanner input = new Scanner(System.in);
    	   int operations;
    	   
    	   operations = input.nextInt();
    	   
    	   for (int i=0; i<=operations; i++) {
    		   list.add(input.nextInt());
    	   }
    	   
    	   Collections.sort(list); 	   
    	   
    	   for (int num : list) {
    		   System.out.println(num);
    	   }
    	   
    	   input.close();
    	   return list;
       }     
}
