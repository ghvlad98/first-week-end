package FirstWeekEx2;

public class Square extends ArtWork {
    private double altezza;
    private double larghezza;

    public Square(String tit, String art, double height, double width) {
        super(tit, art);
        this.altezza = height;
        this.larghezza = width;
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

    @Override
    public double printEncumbrance() {
        System.out.println("The space(m * m) occupied is:");
        return this.larghezza * this.altezza;
    }
}
