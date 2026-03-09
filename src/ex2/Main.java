package ex2;

public class Main {
    public static void main(String[] args) {

        Streaming conta = new Streaming("João", "Premium");

        conta.assistirFilme("Interestelar");
        System.out.println(conta);

        conta.cancelarAssinatura();
        conta.assistirFilme("Avatar");

        System.out.println("\nApós cancelamento:");
        System.out.println(conta);
    }
}
