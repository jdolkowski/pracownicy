public class Salesman extends Worker{
    protected enum Efficiency{
        NISKA(60), SREDNIA(90), WYSOKA(120);
        private final int numVal;
        Efficiency(int numVal){this.numVal = numVal;}
        public int getNumVal(){ return numVal;}
    }

    private Efficiency efficiency;
    private String provision;

    public Salesman(String name, String lastname, int age, int experience, Building building, Efficiency efficiency, String provision) {
        super(name, lastname, age, experience, building);
        this.efficiency = efficiency;
        this.provision = provision;
    }

    public String getEfficiencyString() {
        return efficiency.toString();
    }

    public Efficiency getEfficiency() {
        return efficiency;
    }

    public void setEfficiency(Efficiency efficiency) {
        this.efficiency = efficiency;
    }

    public String getProvision() {
        return provision;
    }

    public void setProvision(String provision) {
        this.provision = provision;
    }

    @Override
    public String getWorkerSpecificInfo() {
        return " wydajnosc: " + getEfficiencyString() + " prowizja: " + getProvision() + " wartość: " + getExperience() * getEfficiency().getNumVal();
    }


    public double getProvisionDouble(){
        String tmp = getProvision().replace("%", "");
        return Double.parseDouble(tmp) / 100.f;
    }
}
