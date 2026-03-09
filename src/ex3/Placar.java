package ex3;

public class Placar {

    private String nomeTimeCasa;
    private String nomeTimeVisitante;
    private int pontosCasa;
    private int pontosVisitante;
    private int periodoQuarto;

    // Construtor
    public Placar(String nomeTimeCasa, String nomeTimeVisitante) {
        this.nomeTimeCasa = nomeTimeCasa;
        this.nomeTimeVisitante = nomeTimeVisitante;
        this.pontosCasa = 0;
        this.pontosVisitante = 0;
        this.periodoQuarto = 1; // inicia no 1º quarto
    }

    // Método para registrar pontos
    public void registrarPonto(String time, int tipo) {
        int pontos = 0;

        // Define os pontos de acordo com o tipo
        if (tipo == 1) {
            pontos = 1; // lance livre
        } else if (tipo == 2) {
            pontos = 2; // cesta normal
        } else if (tipo == 3) {
            pontos = 3; // cesta de três
        } else {
            System.out.println("Tipo de ponto inválido!");
            return;
        }

        // Soma os pontos ao time correspondente
        if (time.equalsIgnoreCase("casa")) {
            pontosCasa += pontos;
        } else if (time.equalsIgnoreCase("visitante")) {
            pontosVisitante += pontos;
        } else {
            System.out.println("Time inválido! Use 'casa' ou 'visitante'.");
        }
    }

    // Método para avançar para o próximo quarto
    public void proximoQuarto() {
        if (periodoQuarto < 4) {
            periodoQuarto++;
        } else {
            System.out.println("O jogo já terminou!");
        }
    }

    // toString para mostrar o placar
    @Override
    public String toString() {
        return nomeTimeCasa + " [" + pontosCasa + "] x [" + pontosVisitante + "] " + nomeTimeVisitante +
                " - Período: " + periodoQuarto;
    }
}