/**
 * Created by David Simon on 03.11.2016.
 */
public class Agenda {
    static String[] listName = new String[3]; // store the names
    static int index = 0;
    private static int i;

    public static void main(String[] args) {
        System.out.println("Bine ati venit! Selectati optiunea dorita");
        int option = 0;


        do {
            System.out.println("1. Introduceti datele in agenda");
            System.out.println("2. Printati datele");
            System.out.println("3. Iesire");
            //selectare optiune
            option = SkeletonJava.readIntConsole("Selectie: ");

            if (option == 1) {
                add();
            } else if (option == 2) {
                print();
            } else if (option == 3) {
                exit();

            }
        }
        while (option != 0);

    }

    static void add() {

        if (index < listName.length) {
            ;
            String name = SkeletonJava.readStringConsole("Introduceti numele:");
            listName[index] = name;
            index++;
        } else {
            System.out.println("gata memoria, schimba telul ");
        }
    }

    static void print() {
        System.out.println("Contactele din agenda sunt urmatoarele: ");

        for (int i = 0; i < listName.length; i++) {
            String nume = listName[i];
            System.out.println(nume);
        }
    }

    static void exit() {
        for (int i = 0; i < listName.length; i++) ;
        System.out.println();
        System.exit(0);
    }
}









