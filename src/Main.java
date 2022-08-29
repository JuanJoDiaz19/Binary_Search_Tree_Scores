import java.util.Scanner;

public class Main {
    public Scanner sc;
    public ArbolDeBusquedaBinaria tree = new ArbolDeBusquedaBinaria();

    public static void main(String[] args) {
        Main main = new Main();
        main.execute();
    }

    public void posOrderMax10() {
        System.out.println("Puntaje\t\tNombre del usuario" );
        tree.posOrderMax10();
    }
    public Main() {
        sc= new Scanner(System.in);
    }

    public void inOrder() {
        System.out.println("Puntaje\t\tNombre del usuario" );
        tree.inOrder();
    }
    public void searchByScore() {
        System.out.println("Ingrese el puntaje de busqueda");
        int points = sc.nextInt();
        sc.nextLine();
        System.out.println(tree.searchByPoints(points));
    }

    public void addRegister() {
        System.out.println("Ingrese el nombre del jugador: ");
        String name = sc.nextLine();
        System.out.println("Ingrese el puntaje del jugador: ");
        int score = sc.nextInt();
        sc.nextLine();
        tree.insert(score, name);

    }
    public void executeOption(int option) {
        switch (option) {
            case 1 :
                addRegister();
                break;
            case 2:
                searchByScore();
                break;
            case 3:
                inOrder();
                break;
            case 4:
                posOrderMax10();
                break;
            case 5:
                System.out.println("Muchas Gracias por usar nuestro programa :)");
                break;
        }
    }
    public void execute() {
        System.out.println("*******  EA Games *******");
        int option;
        do{
            System.out.println("\nElija una de las opciones:\n");
            System.out.println("\t1. Agregar registro\n" +
                    "\t2. Buscar registro por puntaje\n" +
                    "\t3. Ver puntajes de menor a mayor\n" +
                    "\t4. Ver TOP 10, de mayor a menor\n" +
                    "\t5. Salir");
            option = sc.nextInt();
            sc.nextLine();
            executeOption(option);
        }while(option != 5);
    }


}
