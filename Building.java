public class Building {
    private String streetName;
    private String streetNo;
    private String premisesNo;
    private String city;

    public Building(String streetName, String streetNo, String premisesNo, String city) {
        this.streetName = streetName;
        this.streetNo = streetNo;
        this.premisesNo = premisesNo;
        this.city = city;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getStreetNo() {
        return streetNo;
    }

    public void setStreetNo(String streetNo) {
        this.streetNo = streetNo;
    }

    public String getPremisesNo() {
        return premisesNo;
    }

    public void setPremisesNo(String premisesNo) {
        this.premisesNo = premisesNo;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
