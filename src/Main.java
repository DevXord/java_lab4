
public class Main {

    public static void main(String[] args) {

        /* zad.1
        a) stworzyć klasę abstrakcyjną Figura
        b) stworzyć metody abstrakcyjne pole() i obwod()
        c) stworzyć zwykłą metodę nazwaFigury(String figura), która będzie zwracała tekst 'To jest figura: .....',
        */

        /* zad.2
        a) stworzyć klasę kwadrat i prostokat które będą dziedziczyć po klasie Figura
        b) zaimplementować metody abstrakcyjne odpowiednimi wzorami,
        c) stworzyć objekty tych klas i wyświetlić przykładowe wyliczenia
        */
        System.out.print("\n\n");
        Kwadrat kwadrat = new Kwadrat(5);
        System.out.print("Kwadrat z A równym " +kwadrat.getA() +", Pole " + kwadrat.pole() + ", Obwód " + kwadrat.obwod());
        System.out.print("\n\n");
        Prostokat prostokat = new Prostokat(6,5);
        System.out.print("Prostokat z A równym " +prostokat.getA() +", B równym "+prostokat.getB() + ", Pole " + prostokat.pole() + ", Obwód " + prostokat.obwod());
        System.out.print("\n\n");
    }
}
