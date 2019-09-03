public class Instructor extends Person {

    private int tempSalary;

    public Instructor() {
    }

    public Instructor(String name, String CPR, int hours) {
        this.setHours(hours);
        this.setName(name);
        this.setCPR(CPR);
        this.tempSalary = 199;
        int sal = this.tempSalary * this.getHours();
        this.setSalary(sal);
    }

}
