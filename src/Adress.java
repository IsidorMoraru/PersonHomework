public class Adress {

    private String streetName;
    private int streetNumber;

    public Adress(String streetName, int streetNumber) {
        this.streetName = streetName;
        this.streetNumber = streetNumber;
    }

    public String getAdress() {
        return streetName+streetNumber;
    }


    @Override
    public String toString() {
        return "streetName='" + streetName + ", streetNumber=" + streetNumber;
    }

    public void add(Adress adress) {

    }
}
