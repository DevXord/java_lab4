
class Wiedzmin extends Pracownik implements PracownikI, StudentI{
    public Wiedzmin(String imie, String nazwisko, String stanowisko, int wiek) {
        super(imie, nazwisko, stanowisko, wiek);
    }

    @Override
    public void pomachaj() {
        System.out.print("Wiedzmin macha");
    }

    @Override
    public void zagadaj() {
        System.out.print("Wiedzmin zagaduje");
    }

    @Override
    public void wstanDoPracy() {
        System.out.print("Wiedzmin wstaje do pracy");
    }

    @Override
    public void zaspijDoPracy() {
        System.out.print("Wiedzmin zaspal do pracy");
    }

    @Override
    public void pracuj() {
        System.out.print("Wiedzmin pracuje");
    }

    @Override
    public void podajNumerAlbumu() {
        System.out.print("Nie mam numeru albumu");
    }

    @Override
    public void podajKierunekStudiow() {
        System.out.print("Nie studiuje");
    }

    @Override
    public void zaplacZaStudia() {
        System.out.print("Nie mam Orenów");
    }


    @Override
    public String toString() {
        return "Wiedzmin " + super.getImie() + " " + super.getNazwisko() + ", stanowisko " + super.getStanowisko() + ", wiek " + super.getWiek();
    }
}
