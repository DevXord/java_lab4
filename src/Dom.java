
/* zad.2
     a) napisać klasę Dom implementującą interfejs Budynek,
     b) zaimplementować wszystkie metody,
     c) stworzyć brakujące pola(prywatne), gettery i settery, napisać metodę toString
     (gettery i settery najlepiej wygenerować: Code/Prawy myszy --> Generate --> getters/setters/toString)
     d) stworzyć jedną dowolną metodę przez siebie
     */

class Dom implements Budynek {

    private double powierzchcnia;
    private String adres;
    private int okna;
    private int mieszkancy;
    private KolorEnum kolor;


    public double getPowierzchcnia() {
        return powierzchcnia;
    }

    public void setPowierzchcnia(double powierzchcnia) {
        this.powierzchcnia = powierzchcnia;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public int getOkna() {
        return okna;
    }

    public void setOkna(int okna) {
        this.okna = okna;
    }

    public int getMieszkancy() {
        return mieszkancy;
    }

    public void setMieszkancy(int mieszkancy) {
        this.mieszkancy = mieszkancy;
    }

    public KolorEnum getKolor() {
        return kolor;
    }

    public void setKolor(KolorEnum kolor) {
        this.kolor = kolor;
    }




    @Override
    public double powierzchnia(double pow) {
        setPowierzchcnia(pow);
        return  getPowierzchcnia();
    }

    @Override
    public String adresBudynku(String adres) {
        setAdres(adres);
        return getAdres();
    }

    @Override
    public int liczbaOkien(int value) {
        setOkna(value);
        return getOkna();
    }

    @Override
    public void liczbaMieszkancow(int value) {
        setMieszkancy(value);
    }

    @Override
    public void kolorDomu(KolorEnum kolor) {
        setKolor(kolor);
    }

    @Override
    public void pomaluj(KolorEnum kolorFarby, double pow) {
        setKolor(kolorFarby);
        setPowierzchcnia(pow);
    }

    public void wymienOkna() {

    }



    @Override
    public String toString() {
        return "Dom o powierzchni " + powierzchcnia + ", z adresem " + adres + ", mieszkanców " + mieszkancy + ", kolor budynku " + kolor;
    }
}