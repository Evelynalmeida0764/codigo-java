import java.util.ArrayList;
import java.util.List;

public class LeitorDadosArduino {
    private List<DadosArduino> dadosList;

    public LeitorDadosArduino() {
        dadosList = new ArrayList<>();
    }

    public void adicionarDado(int critico, float porcentagem) {
        DadosArduino novoDado = new DadosArduino(critico, porcentagem);
        dadosList.add(novoDado);
    }

    public List<DadosArduino> getDadosList() {
        return dadosList;
    }
}