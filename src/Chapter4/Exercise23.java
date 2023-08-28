package Chapter4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise23 {

    public static void main(String[] args) {
        // Chapter 4 Exercise 23 
        // We will be creating a program that lets you input an Employee's info 
        // and roll out a payroll statement for that employee.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the employee's name: ");
        String name = input.next();
        System.out.print("Enter the number of hours worked in a week: ");
        double hours = input.nextDouble();
        System.out.print("Enter the hourly pay rate: ");
        double hourlyRate = input.nextDouble();
        System.out.print("Enter the federal tax withholding rate: ");
        double fedTax = input.nextDouble();
        System.out.print("Enter the state tax withholding rate: ");
        double stateTax = input.nextDouble();
        
        //Totaling each required field
        // Gross Pay
        double grossPay = hours * hourlyRate;
        // Federal Tax
        double fedTaxWithholding = grossPay * fedTax;
        // State Tax
        double stateTaxWithholding = grossPay * stateTax;
        // Total Deduction
        double totalDeduction = fedTaxWithholding + stateTaxWithholding;
        // Net Pay
        double netPay = grossPay - totalDeduction;
        
        // Results are displayed
        System.out.println("Employee Name: " + name +
                "\nPay Rate: " + formatCurrency(hourlyRate) +
                "\nHours Worked: " + hours +
                "\nGross Pay: " + formatCurrency(grossPay) +
                "\nDeductions: "+
                "\n Federal Withholding ("+ formatPercent(fedTax)+"): " + formatCurrency(fedTaxWithholding) +
                "\n State Withholding ("+ formatPercent(stateTax)+"): " + formatCurrency(stateTaxWithholding) +
                "\n Total Deduction: " + formatCurrency(totalDeduction) +
                "\nNet Pay: " + formatCurrency(netPay));
    }
    
    //Brining in the symbols of currency
    public static String formatCurrency(double money){
        return DecimalFormat.getCurrencyInstance().format(money);
    }
    
    //Bringing in the formatting of the money
    public static String formatPercent(double percent) {
        return DecimalFormat.getPercentInstance().format(percent);
    }
    
}
