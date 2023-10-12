package Chapter32;

import java.util.Random;

public class Summation extends Thread {
    
    private double[] arr;
    
    private int low, high;
    double partial;
    
    public Summation(double[] arr, int low, int high){
        this.arr = arr;
        this.low = low;
        this.high = Math.min(high, arr.length);
    }
    
    public double getPartialSum(){
        return partial;
    }
    
    public void run() {
        partial = sequentialSum(arr, low, high);
    }
    
    public static double sequentialSum(double[] arr){
        return sequentialSum(arr, 0, arr.length);
    }
    
    public static int sequentialSum(double[] arr, int low, int high) {
        int total = 0;
        for (int i = low; i < high; i++) {
            total += arr[i];
        }
        return total;
    }
    
    public static double parallelSum(double[] arr){
        return parallelSum(arr, Runtime.getRuntime().availableProcessors());
    }
    
    public static double parallelSum(double[] arr, int threads){
        int size = (int)Math.ceil(arr.length * 1.0/threads);
        Summation[] sums = new Summation[threads];
        for (int i = 0; i < threads; i++){
            sums[i] = new Summation(arr, i* size,(i + 1) * size);
            sums[i].start();
        }
        try {
            for (Summation sum : sums) {
                sum.join();
            }
        } catch (InterruptedException e) {}
        int total = 0;
        for (Summation sum : sums) {
            total += sum.getPartialSum();
        }
        return total;
    }
    
    public static void main(String[] args) {
        Random rand = new Random();
        
        double[] arr = new double[9000000];
        
        for(int i = 0; i < arr.length; i++){
            arr[i] = rand.nextInt(101) + 1;
        }
        long start = System.currentTimeMillis();
        System.out.println("Sequential sum = " + Summation.sequentialSum(arr));
        System.out.println("Sequential summ took: " + (System.currentTimeMillis() - start) + " ms");
        start = System.currentTimeMillis();
        System.out.println("Parallel sum = " + Summation.parallelSum(arr));
        System.out.println("Parallel sum took: " + (System.currentTimeMillis() - start) + " ms");
    }
}
