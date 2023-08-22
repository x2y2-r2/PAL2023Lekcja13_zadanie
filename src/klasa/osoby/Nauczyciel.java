package klasa.osoby;

public class Nauczyciel extends Osoba{


    public Nauczyciel(String imie) {
        super(imie);
    }

    @Override
    public void przywitajSie() {
        System.out.println("Dzień dobry, jestem nauczycielem o imieniu " + imie);
    }

    public void wystawOcene(Uczen uczen, int ocena) {
        uczen.ocena = ocena;
    }
}

