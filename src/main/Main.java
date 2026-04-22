package main;

import com.pluralsight.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main
{
    static void main(String[] args)
    {
        try {
            FileReader fileReader = new FileReader("employee-data.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            bufferedReader.readLine();

            String line;
            line = bufferedReader.readLine();
            while(line != null)
            {
                String[]columns = line.split("\\|");

                String id = columns [0];
                String name = columns [1];
                double hours = Double.parseDouble(columns [2]);
                double rate = Double.parseDouble(columns [3]);

                Employee employee = new Employee(id, name, hours, rate);

                System.out.printf(employee.getEmployeeId() + employee.getName() + employee.getHours() + employee.getPayRate());

                line = bufferedReader.readLine();
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}

