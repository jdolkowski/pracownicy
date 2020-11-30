public class Handworker extends Worker {
    private int stamina;

    public Handworker(String name, String lastname, int age, int experience, Building building, int stamina) {
        super(name, lastname, age, experience, building);
        staminaCheck(stamina);
        this.stamina = stamina;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    @Override
    public String getWorkerSpecificInfo() {
        return " siła: " + getStamina() + " wartość: " +  getExperience() * (double) (getStamina() / getAge());
    }

    public void staminaCheck(int stamina){
        if(stamina < 0 || stamina > 100){throw new IllegalArgumentException("siła 1 - 100");}
    }
}
