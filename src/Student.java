/* zad.2
      a) napisać klasę Student która będzie implementować interfejs StudentI
      b) napisać klasę Pracownik która będzie implementować interfejs PracownikI
      c) stworzyć pola, gettery i settery, metodę toString dla obu klas, (constructor z przeciążeniem - jak ktoś chce ),
      (gettery i settery / toString() ..., najlepiej wygenerować: Code/Prawy myszy-->Generate-->getters/setters/toString)
      */



class Student implements StudentI{


    private String imie,nazwisko;
    private int wiek;
    private Integer numerAlbumu;


    public Student(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public Student(String imie, String nazwisko, int wiek, Integer numerAlbumu) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.numerAlbumu = numerAlbumu;
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

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public Integer getNumerAlbumu() {
        return numerAlbumu;
    }

    public void setNumerAlbumu(Integer numerAlbumu) {
        this.numerAlbumu = numerAlbumu;
    }

    @Override
    public void pomachaj() {
            System.out.print("Macha");
    }

    @Override
    public void zagadaj() {
            System.out.print("Zagaduje");
    }

    @Override
    public void podajNumerAlbumu() {
       System.out.print("To moj numer albumu " + numerAlbumu);
    }

    @Override
    public void podajKierunekStudiow() {
            System.out.print("Mój kierunek to Filozofia");
    }

    @Override
    public void zaplacZaStudia() {
             System.out.print("Płace za studia....");
    }

    @Override
    public String toString() {
        return "Student " + imie + " " + nazwisko + ", wiek " + wiek +", numer albumu " + numerAlbumu;
    }
}
