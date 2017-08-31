package WydawcaISubW_Obserwator;


import java.util.ArrayList;

public class KaczorDonald implements IWydawca {
    private ArrayList<IOdbiorca> _odbiorcy;
    private String _numer;

    KaczorDonald() {
        _odbiorcy = new ArrayList<>();
    }

    @Override
    public void dodajPrenumeratora(IOdbiorca prenumerator) {
        _odbiorcy.add(prenumerator);
    }

    @Override
    public void usunPrenumeratora(IOdbiorca prenumerator) {
        _odbiorcy.remove(prenumerator);
    }

    @Override
    public void wyslijNowyNumer() {
        for (IOdbiorca odbiorca : _odbiorcy) {
            odbiorca.odbierzGazete(_numer);
        }
    }

    public void wydajNumer(String numer) {
        _numer = numer;
        wyslijNowyNumer();
    }
}
