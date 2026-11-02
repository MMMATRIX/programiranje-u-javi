package hr.tvz.nogomet.aplikacija;

import hr.tvz.nogomet.apstraktne.Gradjevina;
import hr.tvz.nogomet.enumeracije.Pozicija;
import hr.tvz.nogomet.klase.*;
import hr.tvz.nogomet.zapisi.Adresa;

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
            //
            String imeTrenera = procitajString(scanner, "Ime trenera: ");
            String prezimeTrenera = procitajString(scanner, "Prezime trenera: ");
            System.out.print("Godina rođenja: ");
            int godinaRodenjaTrenera = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Godine iskustva: ");
            int godineIskustva = scanner.nextInt();
            scanner.nextLine();
            Trener trener = new Trener(imeTrenera, prezimeTrenera, godinaRodenjaTrenera, godineIskustva);
            //
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

                String pozicija;
                System.out.print("Pozicija (1 - VRATAR, 2 - BRANIC, 3 - VEZNJAK, 4 - NAPADAC): ");
                int poz = scanner.nextInt();
                scanner.nextLine();
                switch (poz) {
                    case 1:  pozicija = "VRATAR"; break;
                    case 2:  pozicija = "BRANIC"; break;
                    case 3:  pozicija = "VEZNJAK"; break;
                    case 4:  pozicija = "NAPADAC"; break;
                    default: pozicija = "err"; break;
                }
                igraci[j] = new Igrac(imeIgraca, prezimeIgraca, godinaRodenjaIgraca, brojDresa,Pozicija.valueOf(pozicija));
            }

            //

            System.out.print("Koliko građevina želite unijeti: ");
            int brojGradjevina = scanner.nextInt();
            scanner.nextLine();
            Gradjevina[] gradjevine = new Gradjevina[brojGradjevina];

            for (int j = 0; j < brojGradjevina; j++){
                System.out.println();
                System.out.println("--- GRAĐEVINA " + (j + 1) + " ---");

                System.out.print("Vrsta (1 - Stadion, 2 - MedicinskaOrdinacija, 3 - SportskiDom): ");
                int vrsta = scanner.nextInt();
                scanner.nextLine();

                String nazivGradjevine = procitajString(scanner, "Naziv: ");
                String ulicaGradjevine = procitajString(scanner, "Ulica: ");

                String brojGradjevine = procitajString(scanner, "Kućni broj: ");

                String gradGradjevine = procitajString(scanner, "Grad: ");

                Adresa adresa = new Adresa(ulicaGradjevine,"" + brojGradjevine,gradGradjevine);
                if(vrsta == 1){
                    System.out.print("Kapacitet: ");
                    int kapacitet = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Godina izgradnje: ");
                    int godinaIzgradnje = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Natkriven (true/false): ");
                    Boolean natkriven = scanner.nextBoolean();
                    scanner.nextLine();
                    gradjevine[j] = new Stadion(nazivGradjevine,adresa,kapacitet,godinaIzgradnje,natkriven);
                }else if(vrsta == 2){
                    System.out.print("Broj ambulatni: ");
                    int brojAmbulatni = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Ima hitnu službu (true/false): ");
                    Boolean hitna = scanner.nextBoolean();
                    scanner.nextLine();

                    gradjevine[j] = new MedicinskaOrdinacija(nazivGradjevine,adresa,brojAmbulatni,hitna);

                }else if(vrsta == 3){
                    System.out.print("Broj kreveta: ");
                    int brojKreveta = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Ima blagavaonicu (true/false): ");
                    Boolean blagavaonica = scanner.nextBoolean();
                    scanner.nextLine();

                    gradjevine[j] = new SportskiDom(nazivGradjevine,adresa,brojKreveta,blagavaonica);

                }

            }

            klubovi[i] = new NogometniKlub(nazivKluba, gradKluba, godinaOsnivanja, trener, igraci, gradjevine);
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

