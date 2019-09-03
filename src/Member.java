public class Member extends Person {

    private String name;
    private String CPR;
    private String membType;
    private int fee;

    public Member() {

    }

    public Member(String name, String CPR, String membType) {
        this.name = name;
        this.CPR = CPR;
        if (membType.equalsIgnoreCase("basic")) {
            this.fee = 199;
            setMembType("basic");
        } else {
            this.fee = 299;
            setMembType("full");
        }

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

    public String getMembType() {
        return membType;
    }

    public void setMembType(String membType) {
        this.membType = membType;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return name + "\t\t"+  CPR + "\t\t" + membType + "\t\t\t" + fee;
    }
}
