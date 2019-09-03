public class AdminPers extends Person {

    private int vacation;

    public AdminPers() {
    }

    public AdminPers(String name, String CPR) {
        this.setName(name);
        this.setCPR(CPR);
        this.setHours(37);
        this.setSalary(23000);
        vacation = 5;
    }

    @Override
    public String toString() {
        return super.toString() + "\t\t" + vacation;
    }
}
