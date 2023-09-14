package Chapter19;

import java.util.Scanner;

public class Exercise5 {
    
    public static void main (String[] args) {
        // Chapter 19 Exercise 5
        Integer[] list =  new Integer[10];
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 10 integers(Whole numbers): ");
        for (int i = 0; i < list.length; i++){
            list[i] = scan.nextInt();
        }
        System.out.println("Max = " + max(list));
    }
    
    public static <E extends Comparable<E>> E max(E[] list){
        E max = list[0];
        for(int i = 1; i < list.length; i++){
            if(max.compareTo(list[i])<0){
                max = list[i];
            }
        }
        return max;
    }
}
