package ie.atu;

import java.lang.reflect.Array;

public class Employee {
    private Array name;
    private Array pps;
    private String gender;
    private  String employmentType;
    private int age;

    public Employee() {

    }

    public Employee(String name, int pps, String gender, String employmentType, int age) {
        this.name = name;
        this.pps = pps;
        this.gender = gender;
        this.employmentType = employmentType;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPps() {
        return pps;
    }

    public void setPps(int pps) {
        this.pps = pps;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmploymentType() {
        return employmentType;
    }

    public void setEmploymentType(String employmentType) {
        this.employmentType = employmentType;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
