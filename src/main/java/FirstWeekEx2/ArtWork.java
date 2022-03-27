package FirstWeekEx2;

public abstract class ArtWork {
    protected String titolo;
    protected String artista;

    ArtWork(String tit, String art) {
        this.titolo = tit;
        this.artista = art;
    }

    public abstract double printEncumbrance();

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }


    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public boolean equals(Object o) {
        if (o instanceof ArtWork) {
            return ((ArtWork) o).getTitolo().equals(this.getTitolo()) &&
                    ((ArtWork) o).getArtista().equals(this.getArtista());
        } else {
            return false;
        }
    }
}
