import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Person> empList = new ArrayList<>();
        List<Member> memberList = new ArrayList<>();
        List<Person> personList = new ArrayList<>();

        Person person = new Person();

        empList.add(new AdminPers("Claus", "221175-1011"));
        empList.add(new Instructor("Tove", "011080-1014", 20));
        empList.add(new AdminPers("Anna", "011080-1012"));
        empList.add(new Instructor("Henning", "011080-1014", 15));

        memberList.add(new Member("Morten", "130195-1303", "full"));
        memberList.add(new Member("Martin", "221175-1011", "basic"));
        memberList.add(new Member("Martina", "050970-1409", "full"));
        memberList.add(new Member("Marcel", "221175-1011", "basic"));

        System.out.println("FITNESS EMPLOYEES");
        System.out.println();
        System.out.println("Name\t\tCPR\t\t\t\tHours\t\tSalary\t\tVacation");
        System.out.println("******************************************************************");
        for (Person i : empList) {
            System.out.println(i);
        }
        System.out.println("==================================================================\n");

        System.out.print("FITNESS EMPLOYEES");
        System.out.println();
        System.out.println("Name\t\tCPR\t\t\t\tMember type\t\tFee");
        System.out.println("******************************************************************");
        for (Member i : memberList) {
            System.out.println(i);
        }
        System.out.println("==================================================================\n");

        System.out.println("EMPLOYEES & MEMBERS");
        System.out.println("Name\t\t\tCPR");
        System.out.println("******************************************************************");
        for (Person i : empList) {
            System.out.print(i.getName() + "\t\t\t");
            System.out.println(i.getCPR());

        }

        for (Member i : memberList) {
            System.out.print(i.getName() + "\t\t\t");
            System.out.println(i.getCPR());
        }


    }
}
