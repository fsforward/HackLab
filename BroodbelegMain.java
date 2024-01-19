package Assignments;

class Broodbeleg {
    String soort;
    String naam;
    double prijs;
    String houdbaarheidsdatum;

    public Broodbeleg(String soort, String naam, double prijs, String houdbaarheidsdatum) {
        this.soort = soort;
        this.naam = naam;
        this.prijs = prijs;
        this.houdbaarheidsdatum = houdbaarheidsdatum;
    }
}

public class BroodbelegMain {
    public static void main(String[] args) {
        Broodbeleg[] broodbelegArray = new Broodbeleg[]{
                new Broodbeleg("hartig", "Ham", 2.50, "2024-03-01"),
                new Broodbeleg("hartig", "Kaas", 3.00, "2024-02-15"),
                new Broodbeleg("hartig", "Kipfilet", 2.75, "2024-02-28"),
                new Broodbeleg("zoet", "Jam", 2.20, "2024-04-10"),
                new Broodbeleg("zoet", "Hagelslag", 1.80, "2024-03-20"),
                new Broodbeleg("zoet", "Pasta", 2.30, "2024-03-15")
        };

        System.out.println("\n*** Broodbeleg ***");
        ToonBroodbeleg(broodbelegArray);

        System.out.println("\n*** Hartig Broodbeleg ***");
        HartigBroodbeleg(broodbelegArray);

        System.out.println("\n*** Zoet Broodbeleg ***");
        ZoetBroodbeleg(broodbelegArray);
    }

    private static void ToonBroodbeleg(Broodbeleg[] array) {
        for (Broodbeleg beleg : array)
            System.out.println(beleg.naam + " - Soort: " + beleg.soort + ", Prijs: €" + beleg.prijs + ", Houdbaar tot: " + beleg.houdbaarheidsdatum);
    }

    private static void HartigBroodbeleg(Broodbeleg[] array) {
        for (Broodbeleg beleg : array)
            if (beleg.soort.equals("hartig"))
                System.out.println(beleg.naam + " - Prijs: €" + beleg.prijs + ", Houdbaar tot: " + beleg.houdbaarheidsdatum);
    }

    private static void ZoetBroodbeleg(Broodbeleg[] array) {
        for (Broodbeleg beleg : array)
            if (beleg.soort.equals("zoet"))
                System.out.println(beleg.naam + " - Prijs: €" + beleg.prijs + ", Houdbaar tot: " + beleg.houdbaarheidsdatum);
    }
}
