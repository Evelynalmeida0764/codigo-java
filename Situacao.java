public class Situacao {
    public static void verificarSituacao(DadosArduino dado) {
        int critico = dado.getCritico();
        float porcentagem = dado.getPorcentagem();

        if (critico == 1) {
            System.out.println("Molhe agora");
        } else if (porcentagem < 30) {
            System.out.println("Molhe hoje");
        } else if (porcentagem >= 30 && porcentagem < 60) {
            System.out.println("Molhe essa semana");
        } else {
            System.out.println("Não molhar");
        }
    }
}