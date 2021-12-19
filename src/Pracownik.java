/* zad.2
      a) napisać klasę Student która będzie implementować interfejs StudentI
      b) napisać klasę Pracownik która będzie implementować interfejs PracownikI
      c) stworzyć pola, gettery i settery, metodę toString dla obu klas, (constructor z przeciążeniem - jak ktoś chce ),
      (gettery i settery / toString() ..., najlepiej wygenerować: Code/Prawy myszy-->Generate-->getters/setters/toString)
      */

class Pracownik implements  PracownikI {

    private int wiek;
    private String imie,nazwisko,stanowisko;



    public Pracownik(String imie, String nazwisko) {

        this.imie = imie;
        this.nazwisko = nazwisko;
        this.stanowisko = "Brak";
        this.wiek = 0;
    }
    public Pracownik(String imie, String nazwisko, String stanowisko) {

        this.imie = imie;
        this.nazwisko = nazwisko;
        this.stanowisko = stanowisko;
        this.wiek = 0;
    }
    public Pracownik(String imie, String nazwisko, String stanowisko, int wiek) {

        this.imie = imie;
        this.nazwisko = nazwisko;
        this.stanowisko = stanowisko;
        this.wiek = wiek;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getStanowisko() {
        return stanowisko;
    }

    public void setStanowisko(String stanowisko) {
        this.stanowisko = stanowisko;
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
    public String toString() {
        return "Pracownik " + imie  +
                " " + nazwisko  +
                ", stanowisko " + stanowisko +", wiek " + ((wiek == 0) ? "Nie podano" : wiek) ;

    }
}
