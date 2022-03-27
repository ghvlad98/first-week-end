package FirstWeekEx2;

public class Test {
    public static void main(String[] args) {
        ArtWork square1 = new Square("Night Watch", "Rembrandt", 3.63, 4.37);
        ArtWork square2 = new Square("The Tragedy", "Picasso", 1.05, 0.69);
        ArtWork sculpture1 = new Sculpture("Pieta", "Michelangelo", 1.74, 1.95, 0.69);

        Collection col = new Collection("Uffizi", "Florence");
        col.addWork(square1);
        System.out.println("Current works: ");
        col.printWorks();
        col.givenEncumbrance(sculpture1);

        System.out.println();

        col.addWork(square2);
        col.addWork(sculpture1);
        System.out.println("Current works: ");
        col.printWorks();
        col.givenEncumbrance(sculpture1);

    }
}
