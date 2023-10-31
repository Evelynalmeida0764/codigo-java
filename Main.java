import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LeitorDadosArduino leitor = new LeitorDadosArduino();


        // Adicione alguns dados de exemplo
        leitor.adicionarDado(1, 10.0f);
        leitor.adicionarDado(0, 25.0f);
        leitor.adicionarDado(0, 50.0f);
        leitor.adicionarDado(0, 70.0f);

        System.out.println("O que você gostaria de ver? Digite 'array' ou 'situacao':");
        String escolha = scanner.next();

        if (escolha.equals("array")) {
            // Mostrar o array de dados
            for (DadosArduino dado : leitor.getDadosList()) {
                System.out.println(dado);
            }
        } else if (escolha.equals("situacao")) {
            // Pedir ao usuário para escolher um índice na lista e mostrar a situação
            System.out.println("Digite o índice do dado que você deseja verificar (0 a " + (leitor.getDadosList().size() - 1) + "):");
            int indice = scanner.nextInt();
            if (indice >= 0 && indice < leitor.getDadosList().size()) {
                DadosArduino dadoSelecionado = leitor.getDadosList().get(indice);
                Situacao.verificarSituacao(dadoSelecionado);
            } else {
                System.out.println("Índice inválido.");
            }
        } else {
            System.out.println("Escolha inválida. Digite 'array' ou 'situacao'.");
        }
        scanner.close();
    }
}