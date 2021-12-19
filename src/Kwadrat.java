/* zad.2
      a) stworzyć klasę kwadrat i prostokat które będą dziedziczyć po klasie Figura
      b) zaimplementować metody abstrakcyjne odpowiednimi wzorami,
      c) stworzyć objekty tych klas i wyświetlić przykładowe wyliczenia
      */


class Kwadrat extends Figura{

    private int a;


    public Kwadrat(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    @Override
    int pole() {
        return getA() * getA();
    }

    @Override
    int obwod() {
        return 4 * getA();
    }
}
