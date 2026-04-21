package main;

import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {

        String employeeData = "employee-data.csv";
        try {
            FileReader fileReader = new FileReader();
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String input = bufferedReader.readLine();
        }

    }
}

