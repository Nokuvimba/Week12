package ie.atu;

import java.util.ArrayList;
import java.util.Scanner;
import java.lang.reflect.Array;

import java.util.Scanner;

public class Employee {
    private String name;
    private String pps;
    private String gender;
    private String employmentType;
    private int age;


    public Employee() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPps(String pps) {
        this.pps = pps;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setEmploymentType(String employmentType) {
        this.employmentType = employmentType;
    }

    public void setAge(int age) {
        this.age = age;
    }

    Scanner input = new Scanner(System.in);

    public void getDetails() {

        String[]invalid=new String[]{"ARRAY"};
        System.out.println("Enter your name:");
        String name = input.nextLine();


        if (name.length() >= 3 || name.length() <= 25) {
            setName(name);
        } else {
            System.out.println("Invalid name error");
        }
        System.out.println("Enter your PPS ID");
        String pps=input.nextLine();
        if(pps.length()!=11) {
            setPps(pps);
            System.out.println(invalid);

        }

        System.out.println("Enter your employment type ");
        String employmentType = input.nextLine();
        if (employmentType == "Full-time" || employmentType == "Part-time" || employmentType == "Contract") {
            setEmploymentType(employmentType);
        } else {
            System.out.println(invalid);
        }

        System.out.println("Enter gender using either Man,Women or Non-Binary");
        String gender = input.nextLine();
         setGender(gender);

        try {
            System.out.println("Enter your age:");
            int age = input.nextInt();
            if (age < 16 && age > 66) {
                System.out.println(invalid);
            }
        } catch (NumberFormatException e) {
            System.out.println(invalid + e.getMessage());
            e.printStackTrace();
        }
    }


}






