/*
Primjer unosa jednog kluba:
Koliko klubova želite unijeti: 2

===== UNOS KLUBA 1 =====

Naziv kluba: Hajduk
Grad: Split
Godina osnivanja: 1911

Naziv stadiona: Poljud
Grad stadiona: Split
Kapacitet: 33000
Godina izgradnje: 1979
Je li stadion natkriven: false

Ime trenera: Ivan
Prezime trenera: Horvat
Godina rođenja: 1975
Godine iskustva: 15

Koliko igrača želite unijeti: 2

--- IGRAČ 1 ---
Ime: Marko
Prezime: Marić
Godina rođenja: 1998
Broj dresa: 1
Pozicija: VRATAR


===== NOGOMETNI KLUBOVI =====

1 - Pretraži klub
0 - Završi program


Primjer:
Odabir: 1

Unesite naziv kluba: hajduk

===== HAJDUK =====
Grad: Split
Godina osnivanja: 1911
Trener: Ivan Horvat
Stadion: Poljud

Za prikaz pronađenog kluba koristi se funkcija getOpis() iz klase NogometniKlub.

Ako klub ne postoji:
Unesite naziv kluba: Barcelona

Nema kluba s tim nazivom.
 */


void main() {

    Scanner sc = new Scanner(System.in);

    int clubCount;

    System.out.print("Koliko klubova želite unijeti: ");
    clubCount = Integer.parseInt(sc.nextLine());

    NogometniKlub[] clubs = new NogometniKlub[clubCount];

    for(int i = 0; i < clubCount; i++) {
        String clubName;
        String clubTown;
        int esablishmentYear;

        System.out.printf("\n===== UNOS KLUBA %d =====",i+1);

        System.out.print("\nNaziv kluba: "); clubName = sc.nextLine();
        System.out.print("Grad: "); clubTown = sc.nextLine();
        System.out.print("Godina osnivanja: "); esablishmentYear = Integer.parseInt(sc.nextLine());

        String stadionName;
        String stadionTown;
        int capacity;
        int buildYear;
        boolean covered;

        System.out.print("\nNaziv stadiona: "); stadionName = sc.nextLine();
        System.out.print("Grad stadiona: "); stadionTown = sc.nextLine();
        System.out.print("Kapacitet: "); capacity = Integer.parseInt(sc.nextLine());
        System.out.print("Godina izgradnje: "); buildYear = Integer.parseInt(sc.nextLine());
        System.out.print("Je li stadion natkriven: "); covered = Boolean.parseBoolean(sc.nextLine());

        String coachName;
        String coachSurname;
        int yearOfBirth;
        int yearsInField;

        System.out.print("\nIme trenera: "); coachName = sc.nextLine();
        System.out.print("Prezime trenera: "); coachSurname = sc.nextLine();
        System.out.print("Godina rođenja: "); yearOfBirth = Integer.parseInt(sc.nextLine());
        System.out.print("Godine iskustva: ");  yearsInField = Integer.parseInt(sc.nextLine());

        clubs[i]=new NogometniKlub(
                clubName,clubTown,esablishmentYear,
                new Stadion(stadionName,stadionTown,capacity,buildYear,covered),
                new Trener(coachSurname,coachName,yearOfBirth,yearsInField),
                null
        );

        int playerCount;
        System.out.print("\nKoliko igrača želite unijeti :");
        playerCount = Integer.parseInt(sc.nextLine());


        for(int j = 0; j < playerCount; j++) {

            String playerName;
            String playerSurname;
            //int yearOfBirth; used in coach input, reused in player input
            int number;
            String role;
            System.out.printf("\n--- IGRAČ %d ---",j+1);
            System.out.print("\nIme: "); playerName = sc.nextLine();
            System.out.print("Prezime: "); playerSurname = sc.nextLine();
            System.out.print("Godina rođenja: "); yearOfBirth = Integer.parseInt(sc.nextLine());
            System.out.print("Broj dresa: "); number = Integer.parseInt(sc.nextLine());
            System.out.print("Pozicija: "); role = sc.nextLine();
            clubs[i].addPlayer(new Igrac(playerName,playerSurname,yearOfBirth,number,role),j,playerCount);
        }
    }

    while(true) {
        System.out.print("""
            1 - Pretraži klub
            0 - Završi program
            """);

        switch (Integer.parseInt(sc.nextLine())) {

            case 0:{
                sc.close();
                System.exit(0);
                break;
            }
            case 1:{
                String clubName;
                int flag;

                do{
                    System.out.print("Unesite naziv kluba: "); clubName = sc.nextLine();
                    if( -1 == (flag = clubExists(clubName,clubs))){
                        System.out.println("Nema kluba s tim nazivom.\n\n");
                    }
                }while(flag == -1);

                printClub(flag,clubs);

            }

        }
    }

}

int clubExists(String clubName, NogometniKlub[] clubs) {
    for(int i = 0; i<NogometniKlub.instanceCount;i++){
        if(clubs[i].getNaziv().equalsIgnoreCase(clubName)){
            return i;
        }
    }
    return -1;
}

void printClub(int index, NogometniKlub[] clubs) {
    System.out.println(clubs[index].getOpis());
}
