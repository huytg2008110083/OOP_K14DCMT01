package Buoi10;

public class Emloyee extends person {
    private double salary;

    @Override
    public String toString(){
        return "name :" + this.name + "birthday: " +
        this.birthday + "salary: " + this.salary;
    }
}
