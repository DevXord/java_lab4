/*      a) stworzyć klasę Kierownik która będzie implementować interfejs PracownikI,
        b) zaimplementować wszystkie metody, i stworzyć pola

  */
class Kierownik implements PracownikI{

    private String imie,nazwisko,stanowisko;
    private int wiek;



    public Kierownik(String imie, String nazwisko, String stanowisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.stanowisko = stanowisko;
        this.wiek =0;
    }
    public Kierownik(String imie, String nazwisko, String stanowisko,int wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.stanowisko = stanowisko;
        this.wiek =wiek;
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

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
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
        return "Kierownik " + imie + " " + nazwisko + ", stanowisko " + stanowisko + ", wiek " + wiek;
    }
}
