import java.util.UUID;

public abstract class Worker {
    private final String ID;
    private String name;
    private String lastname;
    private int age;
    private int experience;
    private Building building;

    public Worker(String name, String lastname, int age, int experience, Building building) {
        checkConstructorData(age, experience);
        this.ID = generatorID();
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.experience = experience;
        this.building = building;
    }
    public String toStringWorker(){
        return getID() + " " + getName() + " " + getLastname() + " " + getAge() + " " + getExperience() + " " + getBuilding().getCity() + " " + getWorkerSpecificInfo() + "\n";
    }

    public abstract String getWorkerSpecificInfo();

    protected String getID() {
        return ID;
    }

    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected String getLastname() {
        return lastname;
    }

    protected void setLastname(String lastname) {
        this.lastname = lastname;
    }

    protected int getAge() {
        return age;
    }

    protected void setAge(int age) {
        this.age = age;
    }

    protected int getExperience() {
        return experience;
    }

    protected void setExperience(int experience) {
        this.experience = experience;
    }

    protected Building getBuilding() {
        return building;
    }

    protected void setBuilding(Building building) {
        this.building = building;
    }

    protected String getCity(){
        return getBuilding().getCity();
    }

    protected String generatorID(){
        return UUID.randomUUID().toString();
    }

    private void checkConstructorData(int age, int experience){
        if(age < 18 || experience < 0){throw new IllegalArgumentException("niepoprawne dane");}
    }
}
