package FirstWeekEx2;

public class Sculpture extends ArtWork {
    private double altezza;
    private double larghezza;
    private double profondita;

    public Sculpture(String tit, String art, double height, double width, double depth) {
        super(tit, art);
        this.altezza = height;
        this.larghezza = width;
        this.profondita = depth;
    }

    public double getAltezza() {
        return altezza;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    public double getLarghezza() {
        return larghezza;
    }

    public void setLarghezza(double larghezza) {
        this.larghezza = larghezza;
    }

    public double getProfondita() {
        return profondita;
    }

    public void setProfondita(double profondita) {
        this.profondita = profondita;
    }

    @Override
    public double printEncumbrance() {
        System.out.println("The space(m * m * m) occupied is:");
        return this.altezza * this.larghezza * this.profondita;
    }
}
