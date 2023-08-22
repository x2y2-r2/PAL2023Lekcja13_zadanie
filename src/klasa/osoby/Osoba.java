package klasa.osoby;

public class Osoba {
    String imie;

    public Osoba(String imie) {
        this.imie = imie;
    }

    public void przywitajSie() {
        System.out.println("" + imie);
    }
}
