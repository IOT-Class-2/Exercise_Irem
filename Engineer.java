package Merve_Hoca_Mext.Day2;

public class Engineer extends Employee {

    public Engineer(String name, double salary, int age) {
        super(name, salary, age);
    }

    public double getAnnualBonus(){
        return super.salary * .05;
    }

}


