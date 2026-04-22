package main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        String employeeData = "employee-data.csv";
        try {
            FileReader fileReader = new FileReader(employeeData);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            System.out.println(bufferedReader.readLine()); // We can read the file with this line, now we need to make a while loop to read the info we want

        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}

