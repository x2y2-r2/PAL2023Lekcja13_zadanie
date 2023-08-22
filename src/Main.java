// !!! NIE MODYFIKUJ IMPORTOW !!!
import klasa.osoby.Nauczyciel;
import klasa.osoby.Osoba;
import klasa.osoby.Uczen;
import klasa.przedmioty.Krzeslo;
import klasa.przedmioty.Lawka;
import klasa.przedmioty.Przedmiot;
import klasa.przedmioty.Tablica;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        Napraw kod, tak aby na konsoli pojawiło się:
//        !!! Nie modyfikuj importów !!!

//        Dzien dobry, jestem nauczycielem o imieniu Lucyna
//        Siemaneczko! Jestem Przemek
//        Siemaneczko! Jestem Magda
//        Moja ocena to: 3
//        Moja ocena to: 5
//        Cena za wszystko to 130.0

        Nauczyciel nauczyciel = new Nauczyciel("Lucyna");
        Uczen uczen1 = new Uczen("Przemek");
        Uczen uczen2 = new Uczen("Magda");

        List<Osoba> osoby = new ArrayList<>();
        osoby.add(nauczyciel);
        osoby.add(uczen1);
        osoby.add(uczen2);

        for(Osoba osoba : osoby) {
            osoba.przywitajSie();
        }

        nauczyciel.wystawOcene(uczen1, 3);
        nauczyciel.wystawOcene(uczen2, 5);

        uczen1.pokazOcene();
        uczen2.pokazOcene();


        Krzeslo krzeslo = new Krzeslo(10);
        Lawka lawka = new Lawka(20);
        Tablica tablica = new Tablica(100);

        List<Przedmiot> przedmioty = new ArrayList<>();
        przedmioty.add(krzeslo);
        przedmioty.add(lawka);
        przedmioty.add(tablica);

        double cena = 0;

        for (Przedmiot przedmiot: przedmioty) {
            cena += przedmiot.getCena();
        }

        System.out.println("Cena za wszystko to " + cena);
    }
}