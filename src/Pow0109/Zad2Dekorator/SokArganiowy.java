package Pow0109.Zad2Dekorator;


public class SokArganiowy extends NalewkaDekorator {

    Nalewka _nalewka;

    SokArganiowy(Nalewka nalewka) {
        _nalewka = nalewka;
    }

    @Override
    public String pobierzOpis() {
        return _nalewka.pobierzOpis() + "Sok Arganowy";
    }

    @Override
    public int alkohol() {
        return 0;
    }
}
