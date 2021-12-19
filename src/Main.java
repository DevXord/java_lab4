import javax.management.InvalidAttributeValueException;
import java.util.Random;
import java.util.Scanner;



class Person {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}






public class Main {

    public static void main(String[] args) {

        /* zad.1
        a) stworzyć tablicę 6-cio elementową, uzupełnić przykładowymi wartościami (dowolny typ tablicy),
        b) wprowadzić z klawiatury numer indexu tablicy który chcemy wyświetlić, użyć metody next() --> scan.next();
        c) zabezpieczyć kod przed wprowadzeniem:
           - za dużej liczby (index > tab.length),
           - wprowadzeniem innego znaku niż liczba,
        d) użyć metody finally aby wyświetlić komunikat zakończenia programu
        e) wprowadzanie indeksu niech będzie zapętlone do momentu wprowadzenia poprawnego indeksu

           PODPOWIEDZI:
           scan.next() - można wprowadzać dowolny znak z klawiatury,
           index = Integer.parseInt(scan.next()); - parsowanie zmiennej do typu int (liczbowego calkowitego)

           warto stworzyć flagę np. isIndexCorrect = false, i niech pętla sie wykonuje, dopuki flaga jest false,
           boolean isIndexCorrect
           white(!isIndexCorrect) {}
        */
        boolean isIndexCorrect = true;
        Scanner sc = new Scanner(System.in);
        Random rnad = new Random();
        int[] tab_int = new int[6];
        for (int i= 0; i < tab_int.length; i++)
        {

            tab_int[i] = rnad.nextInt(50) * ((i == 0) ? 1 : i );
        }

        System.out.print("Podaj index tablicy od 0 do "+ (tab_int.length-1) + "\n>> ");
        int input = -1;

        while(isIndexCorrect) {
            try {

                input = Integer.parseInt(sc.next());

            } catch (Exception n) {

                System.out.println("Index musi być liczbą!");


                System.out.print("Podaj index tablicy od 0 do " + (tab_int.length - 1) + "\n>> ");

            } finally {

                if(input != -1) {

                    if (input < tab_int.length) {
                        System.out.println("W tablicy pod indexem " + input + " jest wartość " + tab_int[input]);
                        isIndexCorrect = false;
                    } else {
                        System.out.print("Liczba jest za duża!\n\n");

                        System.out.print("Podaj index tablicy od 0 do " + (tab_int.length - 1) + "\n>> ");
                    }
                }
            }
        }






        /* zad.2
        a) stworzyć dowolny przykład z NullPonterException,
        b) stworzyć dowolny przykład z ArithmeticException ,
        c) stworzyć dowolny przykład z 2 lub 3 blokami catch i z blokiem finally,
         */
        Person p = null;
        System.out.println("\n\n");
        try {
            p.getName();
        }
        catch (Exception n)
        {
            System.out.println("NullPonterException");
        }


        System.out.println("\n");
        int x = 2;
        int y = 0;
        try {
            int zero = x / y;
        }
        catch (Exception n)
        {
            System.out.println("ArithmeticException\n");
        }


        int[] tab_test = new int[1];
        int number;

        try {
            System.out.println("\n" +tab_test[-1]);
            number = Integer.parseInt("Text");
        }
        catch(ArrayIndexOutOfBoundsException a)
        {
            System.out.println("ArrayIndexOutOfBoundsException");
        }
        catch(NumberFormatException n)
        {

            System.out.println("\nNumberFormatException\n");

        }
        finally {
            System.out.println("To sie wykonca zawsze");
        }



    }



}
