public class OfficeWorker extends Worker{
    private String deskID;
    private int iq;

    public OfficeWorker(String name, String lastname, int age, int experience, Building building, int iq) {
        super(name, lastname, age, experience, building);
        IqCheck(iq);
        this.deskID = generatorID();
        this.iq = iq;
    }

    public String getDeskID() {
        return deskID;
    }

    public void setWorkerID(String workerID) {
        this.deskID = workerID;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    @Override
    public String getWorkerSpecificInfo() {
        return " ID stanowiska: " + getDeskID() + " iq: " + getIq() + " wartość: " + getExperience() * getIq();
    }
    public void IqCheck(int iq){
        if(iq < 70 || iq > 150){throw new IllegalArgumentException("iq 70 - 150");}
    }
}
