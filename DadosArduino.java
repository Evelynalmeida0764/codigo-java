public class DadosArduino {
    private int critico;
    private float porcentagem;

    public DadosArduino(int critico, float porcentagem) {
        this.critico = critico;
        this.porcentagem = porcentagem;
    }

    public int getCritico() {
        return critico;
    }

    public void setCritico(int critico) {
        this.critico = critico;
    }

    public float getPorcentagem() {
        return porcentagem;
    }

    public void setPorcentagem(float porcentagem) {
        this.porcentagem = porcentagem;
    }

    @Override
    public String toString() {
        return "DadoArduino [critico=" + critico + ", porcentagem=" + porcentagem + "]";
    }
}