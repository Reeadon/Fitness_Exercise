public class Person {

    private String name;
    private String CPR;
    private int hours;
    private int salary;

    public Person() {

    }

    public Person(String name, String CPR, int hours, int salary, int vacation) {
        this.name = name;
        this.CPR = CPR;
        this.hours = hours;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCPR() {
        return CPR;
    }

    public void setCPR(String CPR) {
        this.CPR = CPR;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return name + "\t\t"+  CPR;
    }
}
