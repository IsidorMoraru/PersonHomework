import java.util.ArrayList;
import java.util.List;

public class Hobby {

    private String hobbyName;
    private int frequency;

    private ArrayList<Adress> adress;


    public Hobby(String hobbyName, int frequency, List<Adress> adress) {
        this.hobbyName = hobbyName;
        this.frequency = frequency;
        this.adress = new ArrayList<>();
    }

    public void addAdress(Adress adress) {
        adress.add(adress);
    }


    public String getHobbyName() {
        return hobbyName;
    }

    public int getFrequency() {
        return frequency;
    }

    public List<Adress> getAdresses() {
        return adress;
    }

    public void setHobbyName(String hobbyName) {
        this.hobbyName = hobbyName;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

//    public void setAdress(List<Adress> adress) {
//        this.adress = adress;
//    }

    @Override
    public String toString() {
        return "Hobby{" +
                "hobbyName='" + hobbyName + '\'' +
                ", frequency=" + frequency +
                ", adress=" + adress +
                '}';
    }
}
