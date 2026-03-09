package ex3;

public class Main {
    public static void main(String[] args) {
        Placar jogo = new Placar("Dragões", "Tubarões");

        jogo.registrarPonto("casa", 2); // casa marca 2 pontos
        jogo.registrarPonto("visitante", 3); // visitante marca 3 pontos
        jogo.registrarPonto("casa", 1); // casa marca 1 ponto

        System.out.println(jogo); // Exibe o placar

        jogo.proximoQuarto();
        System.out.println("Após o próximo quarto: " + jogo);

        // Avançar até o final
        jogo.proximoQuarto();
        jogo.proximoQuarto();
        jogo.proximoQuarto(); // aqui vai avisar que o jogo terminou
    }
}