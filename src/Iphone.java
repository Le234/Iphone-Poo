


public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
    @Override
    public void iniciarCorreioVoz() {
    System.out.println("Iniciando correio de voz");
    }
    @Override
    public void atender(){
    System.out.println("Iphone Atendido");
    }
    @Override
    public void ligar(String numero) {
    System.out.println("Ligando para " + numero + "...");
    }
    @Override
    public void atualizarPagina(){
    System.out.println("Atualizado");
    }
    @Override
    public void adicionarNovaAba(){
    System.out.println("Adicionar Aba");
    }
    @Override
    public void exibirPagina(String url){
    System.out.println("Exibindo página: " + url);
    }
    @Override
    public void tocar(){
    System.out.println("Tocar musica");
    }
    @Override
    public void pausar(){
    System.out.println(" Pausar musica");
    }
    @Override
    public void selecionarMusica(String musica){
    System.out.println("Música selecionada: " + musica);
    }

    public static void main(String[] args) {
        Iphone meuIphone = new Iphone();

        // Testando o Reprodutor Musical
        meuIphone.selecionarMusica("Imagine - John Lennon");
        meuIphone.tocar();
        meuIphone.pausar();

        // Testando o Aparelho Telefônico
        meuIphone.ligar("123-456-789");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        // Testando o Navegador na Internet
        meuIphone.exibirPagina("www.example.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}
