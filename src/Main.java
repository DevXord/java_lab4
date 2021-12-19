


public class Main {
    public static void main(String[] args) {

        /* zad.1
        a) Stwożyć interfejs Budynek,
        b) interfejs powinien mieć metody:
            - double powierzchnia(double pow);
            - String adresBudynku(String adres);
            - int liczbaOkien(int value);
            - void liczbaMieszkancow(int value);
            - void kolorDomu(KolorEnum kolor);
        c) stworzyć enum KolorEnum z przykładowymi kolorami,
        d) stworzyć jedną metodę z 2 parametrami wymyśloną przez siebie,
        */

        /* zad.2
        a) napisać klasę Dom implementującą interfejs Budynek,
        b) zaimplementować wszystkie metody,
        c) stworzyć brakujące pola(prywatne), gettery i settery, napisać metodę toString
        (gettery i settery najlepiej wygenerować: Code/Prawy myszy --> Generate --> getters/setters/toString)
        d) stworzyć jedną dowolną metodę przez siebie
        */

        /* zad.3
        a) w klasie Main stworzyć 2 objekty typu Dom deklarując pierwszy objekt Typem Dom,
        drugi objekt typem Budynek,
        b) wykorzystać wszystkie metody do implementacji pól
        c) wyświetlić w konsoli metodę toString (na obu objektach) opisującą zachowanie klasy Dom
        */
        System.out.println(" ");
        Dom dom = new Dom();
        dom.setOkna(2);
        dom.setAdres("Ćwiartki 3 przez 4");
        dom.setKolor(KolorEnum.Czarny);
        dom.setMieszkancy(5);
        dom.setPowierzchcnia(45.20);
        System.out.print(dom +"\n\n");

        Budynek dom2 = new Dom();
        dom2.liczbaOkien(3);
        dom2.adresBudynku("Ul. Adamieczyw 2");
        dom2.kolorDomu(KolorEnum.Czerwony);
        dom2.liczbaMieszkancow(1);
        dom2.powierzchnia(15.20);
        System.out.print(dom2 +"\n\n");


    }
}
