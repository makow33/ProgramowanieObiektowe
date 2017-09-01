package Piatek0109Powtorzenie.Zad2Dekorator;


public class SokMalinowy extends NalewkaDekorator {

    private Nalewka _nalewka;

    public SokMalinowy(Nalewka nalewka) {
        this._nalewka = nalewka;
    }

    @Override
    public String pobierzOpis() {
        return _nalewka.pobierzOpis() + "Sok Malinowy";
    }
}
