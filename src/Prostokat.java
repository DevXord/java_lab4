/* zad.2
      a) stworzyć klasę kwadrat i prostokat które będą dziedziczyć po klasie Figura
      b) zaimplementować metody abstrakcyjne odpowiednimi wzorami,
      c) stworzyć objekty tych klas i wyświetlić przykładowe wyliczenia
      */


class Prostokat extends Figura {

    private int a,b;

    public Prostokat(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    int pole() {
        return getA() * getB();
    }

    @Override
    int obwod() {
        return 2*getA() + 2*getB() ;
    }
}
