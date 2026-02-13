import java.util.HashMap;
import java.util.Map;

public class Urna {
    // Atributos
    private Map<Integer, Integer> conteoVotos;
    private int totalVotos;

    // Constructor
    public Urna() {
        this.conteoVotos = new HashMap<>();
        this.totalVotos = 0;
    }

    // Método para registrar un voto
    public void registrarVoto(int numeroCandidato) {
        if (numeroCandidato > 0) {
            conteoVotos.put(numeroCandidato, conteoVotos.getOrDefault(numeroCandidato, 0) + 1);
            totalVotos++;
        }
    }

    // Método para mostrar resultados
    public void mostrarResultados() {
        if (totalVotos == 0) {
            System.out.println("No hay votos registrados.");
            return;
        }

        System.out.println("\n--- RESULTADOS FINALES ---");
        System.out.println("Total de votos: " + totalVotos);
        
        for (Map.Entry<Integer, Integer> entry : conteoVotos.entrySet()) {
            double porcentaje = (entry.getValue() * 100.0) / totalVotos;
            System.out.printf("Candidato %d: %.2f%% (%d votos)%n", 
                               entry.getKey(), porcentaje, entry.getValue());
        }
    }
}
