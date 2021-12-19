import java.util.ArrayList;
import java.util.List;





public class Main {
    public static void main(String[] args) {

        /* zad.1
        a) napisać interfejs CzlowiekI
        b) zadeklarować 2 metody

        c) napisać interfejs StudentI który dziedziczy po interfejsie CzlowiekI
        d) zadeklarować 3 metody

        e) napisać interfejs PracownikI który dziedziczy po interfejsie CzlowiekI
        f) zadeklarować 3 metody
         */

        /* zad.2
        a) napisać klasę Student która będzie implementować interfejs StudentI
        b) napisać klasę Pracownik która będzie implementować interfejs PracownikI
        c) stworzyć pola, gettery i settery, metodę toString dla obu klas, (constructor z przeciążeniem - jak ktoś chce ),
        (gettery i settery / toString() ..., najlepiej wygenerować: Code/Prawy myszy-->Generate-->getters/setters/toString)
        */

        /* zad.3
        a) stworzyć 2 objekty typu Student i uzupełnić wszystkie pola
        b) stworzyć 2 objekty typu Pracownik i uzupełnić wszystkie pola
        c) wypisać metody toString() wszystkich objektów
         */
        Student student1 = new Student("Jan","Kowal",18,55555);
        System.out.print("\n"+student1+"\n");
        Student student2 = new Student("Adam","SSSsss",28,55556);
        System.out.print("\n"+student2+"\n\n");


        Pracownik pracownik1 = new Pracownik("Geralt","Z_Rivii","Wiedzmin");
        System.out.print("============================================\n"+pracownik1+"\n");
        Pracownik pracownik2 =  new Pracownik("Jerzy","Kiler","Taksówkarz",30);
        System.out.print("\n"+pracownik2+"\n\n");


          /*zad.4 - Dla chętnych
        a) stworzyć klasę Kierownik która będzie implementować interfejs PracownikI,
        b) zaimplementować wszystkie metody, i stworzyć pola
        c) stworzyć 2 objekty typu Kierownik i uzupełnić wszystkie pola,
        d) stworzyć listę typu PracownikI --> List<PracownikI> listaPracownikow = new ArrayList<>();
        e) dodać do niej objekty typu Kierownik i Pracownik
        f) wypisać pętlą metody toString() wszystkich elementów listy
        */
        System.out.print("============================================\n\n");
        Kierownik kierownik1 = new Kierownik("Amadeusz","Nitke","Prezes");

        Kierownik kierownik2 =  new Kierownik("Anna","Sssss","Specjalista ds. Zatrudnienia",18);

        List<PracownikI> listaPracownikow = new ArrayList<>();
        listaPracownikow.add(pracownik1);
        listaPracownikow.add(pracownik2);
        listaPracownikow.add(kierownik1);
        listaPracownikow.add(kierownik2);
        for (var item: listaPracownikow) {
            System.out.print(item+"\n");
        }

        System.out.print("\n============================================\n\n");
        /* zad5 - Dla chętnych
        Stworzyć klasę która będzie implementować 2 lub 3 interfejsy następnie będzie
        dziedziczona przez inną klasę
        */
        Wiedzmin wiedzmin = new Wiedzmin("Adam","Zielonooki","Wiedzmin szkoła Kota",18);
        System.out.print(wiedzmin+ "\n");

    }
}
