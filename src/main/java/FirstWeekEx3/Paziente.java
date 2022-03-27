package FirstWeekEx3;

public class Paziente {
    private int numTessera;
    private String medResp;

    public Paziente(int numT, String medR) {
        this.numTessera = numT;
        this.medResp = medR;
    }

    public int getNumTessera() {
        return numTessera;
    }

    public void setNumTessera(int numTessera) {
        this.numTessera = numTessera;
    }

    public String getMedResp() {
        return medResp;
    }

    public void setMedResp(String medResp) {
        this.medResp = medResp;
    }
}
