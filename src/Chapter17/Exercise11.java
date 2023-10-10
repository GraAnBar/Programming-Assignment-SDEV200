package Chapter17;

import java.io.*;
        
public class Exercise11 {

    public static void main(String[] args) throws IOException {
        // Chapter 17 Exercise 11
        if (args.length != 2) {
            System.out.println(
                    "Usage: java Exercise_17_11 SourceFile numberOfPieces");
            System.exit(1);
        } // If end
        
        int numberOfPieces = Integer.parseInt(args[1]);
        RandomAccessFile[] splits = new RandomAccessFile[numberOfPieces];

        // Create a random access file
        try (
                RandomAccessFile inout = new RandomAccessFile(args[0], "r");
                )
        {
        // Add files to the array
        for (int i = 0; i < splits.length; i++) {
            splits[i] = new RandomAccessFile(args[0] + "." + (i + 1), "rw");
        } // for
        int size = Math.round(inout.length() / numberOfPieces);
        // Counting number of pieces written
        int count = 0;  
        byte[] b;
        
        for (int i = 0; i < numberOfPieces - 1; i++) {
            inout.seek(count * size);
            b = new byte[size];
            inout.read(b);
            splits[i].write(b);
            count++;
        } // for
        inout.seek(count * size);
        b = new byte[(int)inout.length() - (count * size)];
        inout.read(b);
        splits[numberOfPieces - 1].write(b);
        } // body
    }
} // class
