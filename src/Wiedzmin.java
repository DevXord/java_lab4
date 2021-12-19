
class Wiedzmin extends Pracownik implements PracownikI, StudentI{
    public Wiedzmin(String imie, String nazwisko, String stanowisko, int wiek) {
        super(imie, nazwisko, stanowisko, wiek);
    }

    @Override
    public void pomachaj() {

    }

    @Override
    public void zagadaj() {

    }

    @Override
    public void wstanDoPracy() {

    }

    @Override
    public void zaspijDoPracy() {

    }

    @Override
    public void pracuj() {

    }

    @Override
    public void podajNumerAlbumu() {

    }

    @Override
    public void podajKierunekStudiow() {

    }

    @Override
    public void zaplacZaStudia() {

    }


    @Override
    public String toString() {
        return "Wiedzmin " + super.getImie() + " " + super.getNazwisko() + ", stanowisko " + super.getStanowisko() + ", wiek " + super.getWiek();
    }
}
