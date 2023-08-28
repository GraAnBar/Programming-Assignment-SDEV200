package Chapter5;

public class Exercise5 {

    
    public static void main(String[] args) {
        // Chapter 5 Exercise 5
        // This program will write a table out that displays the information from
        // a previous exercise that displays kilograms to pounds and pounds to kilograms
        System.out.printf("%-12s%8s", "Kilograms", "Pounds");
        System.out.printf("\t\t|\t\t");
        System.out.printf("%-12s%-8s\n", "Pounds", "Kilograms");
        
        for (int i = 1, j = 20; i < 200; i++, j += 5 ) {
            System.out.printf("%-12d%8.1f", i, i * 2.2);
            System.out.printf("\t\t|\t\t");
            System.out.printf("%-12d%-8.2f\n", j, j / 2.2);
            
        }
    }
    
}
