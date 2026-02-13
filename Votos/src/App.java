import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Urna miUrna = new Urna(); // Creamos el objeto
        int voto;

        System.out.println("Bienvenido al Sistema de Votación");
        System.out.println("Ingrese el número del candidato (0 para salir):");

        do {
            voto = sc.nextInt();
            if (voto != 0) {
                miUrna.registrarVoto(voto);
            }
        } while (voto != 0);

        miUrna.mostrarResultados();
        sc.close();
    }
}
