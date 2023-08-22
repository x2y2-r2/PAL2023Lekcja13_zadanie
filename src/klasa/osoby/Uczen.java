package klasa.osoby;

public class Uczen extends Osoba{
    int ocena;


    public Uczen(String imie) {
        super(imie);
    }

    @Override
    public void przywitajSie() {
        System.out.println("Siemaneczko! Jestem " + imie);
    }

    public void pokazOcene() {
        System.out.println(imie + " Moja ocena to: " + ocena);
    }
}

