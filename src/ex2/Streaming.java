package ex2;

public class Streaming {

    private String usuario;
    private String plano;
    private float mensalidade;
    private boolean ativo;
    private String ultimoFilmeAssistido;

    // Construtor
    public Streaming(String usuario, String plano) {
        this.usuario = usuario;
        this.plano = plano;

        // Definir mensalidade automaticamente
        if (plano.equalsIgnoreCase("Básico")) {
            this.mensalidade = 25.90f;
        } else if (plano.equalsIgnoreCase("Premium")) {
            this.mensalidade = 45.90f;
        } else if (plano.equalsIgnoreCase("Família")) {
            this.mensalidade = 60.90f;
        } else {
            this.mensalidade = 0f;
        }

        this.ativo = true;
        this.ultimoFilmeAssistido = "";
    }

    // Método assistir filme
    public void assistirFilme(String nomeFilme) {
        if (ativo) {
            ultimoFilmeAssistido = nomeFilme;
            System.out.println("Assistindo: " + nomeFilme);
        } else {
            System.out.println("Conta suspensa. Pague a fatura para continuar assistindo.");
        }
    }

    // Cancelar assinatura
    public void cancelarAssinatura() {
        ativo = false;
    }

    // toString
    @Override
    public String toString() {
        String status = ativo ? "Ativo" : "Suspenso";

        return "Usuário: " + usuario +
                "\nPlano: " + plano +
                "\nMensalidade: R$ " + mensalidade +
                "\nStatus: " + status +
                "\nÚltimo filme assistido: " + ultimoFilmeAssistido;
    }
}
