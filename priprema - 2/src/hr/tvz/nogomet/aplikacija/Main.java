package hr.tvz.nogomet.aplikacija;

import hr.tvz.nogomet.klase.Igrac;
import hr.tvz.nogomet.klase.NogometniKlub;
import hr.tvz.nogomet.klase.Stadion;
import hr.tvz.nogomet.klase.Trener;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Koliko klubova želite unijeti: ");
        int brojKlubova = scanner.nextInt();
        scanner.nextLine();
        NogometniKlub[] klubovi = new NogometniKlub[brojKlubova];

        for (int i = 0; i < brojKlubova; i++) {
            System.out.println();
            System.out.println("===== UNOS KLUBA " + (i + 1) + " =====");

            String nazivKluba = procitajString(scanner, "Naziv kluba: ");
            String gradKluba = procitajString(scanner, "Grad: ");
            System.out.print("Godina osnivanja: ");
            int godinaOsnivanja = scanner.nextInt();
            scanner.nextLine();
            String nazivStadiona = procitajString(scanner, "Naziv stadiona: ");
            String gradStadiona = procitajString(scanner, "Grad stadiona: ");
            System.out.print("Kapacitet: ");
            Integer kapacitet = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Godina izgradnje: ");
            Integer godinaIzgradnje = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Je li stadion natkriven (true/false): ");
            Boolean natkriven = scanner.nextBoolean();
            scanner.nextLine();
            Stadion stadion = new Stadion(nazivStadiona, gradStadiona, kapacitet, godinaIzgradnje, natkriven);

            String imeTrenera = procitajString(scanner, "Ime trenera: ");
            String prezimeTrenera = procitajString(scanner, "Prezime trenera: ");
            System.out.print("Godina rođenja: ");
            int godinaRodenjaTrenera = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Godine iskustva: ");
            int godineIskustva = scanner.nextInt();
            scanner.nextLine();
            Trener trener = new Trener(imeTrenera, prezimeTrenera, godinaRodenjaTrenera, godineIskustva);

            System.out.print("Koliko igrača želite unijeti: ");
            int brojIgraca = scanner.nextInt();
            scanner.nextLine();
            Igrac[] igraci = new Igrac[brojIgraca];

            for (int j = 0; j < brojIgraca; j++) {
                System.out.println();
                System.out.println("--- IGRAČ " + (j + 1) + " ---");
                String imeIgraca = procitajString(scanner, "Ime: ");
                String prezimeIgraca = procitajString(scanner, "Prezime: ");
                System.out.print("Godina rođenja: ");
                int godinaRodenjaIgraca = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Broj dresa: ");
                int brojDresa = scanner.nextInt();
                scanner.nextLine();
                String pozicija = procitajString(scanner, "Pozicija: ");
                igraci[j] = new Igrac(imeIgraca, prezimeIgraca, godinaRodenjaIgraca, brojDresa, pozicija);
            }

            klubovi[i] = new NogometniKlub(nazivKluba, gradKluba, godinaOsnivanja, stadion, trener, igraci);
        }

        while (true) {
            System.out.println();
            System.out.println("===== NOGOMETNI KLUBOVI =====");
            System.out.println();
            System.out.println("1 - Pretraži klub");
            System.out.println("0 - Završi program");
            System.out.println();

            System.out.print("Odabir: ");
            int odabir = scanner.nextInt();
            scanner.nextLine();

            if (odabir == 0) {
                break;
            }

            if (odabir == 1) {
                String trazeniNaziv = procitajString(scanner, "Unesite naziv kluba: ");
                NogometniKlub pronadeniKlub = pronadiKlubPoNazivu(klubovi, trazeniNaziv);

                if (pronadeniKlub == null) {
                    System.out.println("Nema kluba s tim nazivom.");
                } else {
                    System.out.println(pronadeniKlub.getOpis());
                }
            } else {
                System.out.println("Nepoznata opcija.");
            }
        }

        System.out.println("Program završen.");
    }

    private static NogometniKlub pronadiKlubPoNazivu(NogometniKlub[] klubovi, String naziv) {
        for (NogometniKlub klub : klubovi) {
            if (klub != null && klub.getNaziv() != null && klub.getNaziv().equalsIgnoreCase(naziv)) {
                return klub;
            }
        }
        return null;
    }

    private static String procitajString(Scanner scanner, String poruka) {
        while (true) {
            System.out.print(poruka);
            String unos = scanner.nextLine().trim();
            if (!unos.isEmpty()) {
                return unos;
            }
            System.out.println("Unos ne smije biti prazan.");
        }
    }
}

