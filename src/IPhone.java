public class IPhone implements IPod, Telefone, Navegador {
    @Override
    public void tocar() {
        System.out.println("Tocando música...");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música...");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando música...");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página...");
    }

    @Override
    public void novaAba() {
        System.out.println("Nova aba...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página...");
    }

    @Override
    public void ligar() {
        System.out.println("Discando...");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação...");

    }

    @Override
    public void caixaPostal() {
        System.out.println("Conectando à Caixa Postal...");
    }
}
