package FirstWeekEx2;

import java.util.Arrays;

public class Collection {
    private String name;
    private String place;
    private ArtWork[] works;

    public Collection(String na, String pa) {
        this.name = na;
        this.place = pa;
        this.works = new ArtWork[0];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public void setWorks(ArtWork[] works) {
        this.works = works;
    }

    public void addWork(ArtWork work) {
        int n = this.works.length;
        ArtWork[] actual = new ArtWork[n + 1];
        System.arraycopy(this.works, 0, actual, 0, n);
        actual[n] = work;
        this.works = actual;
    }

    public void printWorks() {
        for (ArtWork work: this.works) {
            System.out.println("Titolo: " + work.getTitolo() +
                    ", Artista: " + work.getArtista());
        }
    }

    public void givenEncumbrance(ArtWork work) {
        if (Arrays.asList(this.works).contains(work)) {
            System.out.println(work.printEncumbrance());
        } else {
            System.out.println("Error, work not found!");
        }
    }
}
