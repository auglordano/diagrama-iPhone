package DiagramaIPhone;

public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

	public static void main(String[] args) {
		
		iPhone iphone = new iPhone();
		
		// Testando as funcionalidades do Reprodutor Musical
		iphone.tocar();
		iphone.pausar();
		iphone.selecionarMusica("Imagine - John Lennon");
		
		// Testando as funcionalidades do Aparelho Telefonico
		iphone.ligar("1234-5678");
		iphone.atender();
		iphone.iniciarCorreioVoz();
		
		// Testando as funcionalidades do Navegador Internet
		iphone.exibirPagina("www.apple.com");
		iphone.adicionarNovaAba();
		iphone.atualizarPagina();

	}

	public void exibirPagina(String url) {
		System.out.println("Exibindo página " + url);	
	}

	public void adicionarNovaAba() {
		System.out.println("Nova aba adicionada!");
	}

	public void atualizarPagina() {
		System.out.println("Página atualizada!");
	}

	public void ligar(String numero) {
		System.out.println("Ligando para o número " + numero);
	}

	public void atender() {
		System.out.println("Chamada atendida!");
	}

	public void iniciarCorreioVoz() {
		System.out.println("Iniciando correio de voz...");
	}

	public void tocar() {
		System.out.println("Reproduzindo música!");
	}

	public void pausar() {
		System.out.println("Música pausada!");
	}

	public void selecionarMusica(String musica) {
		System.out.println("Selecionando a música " + musica + " para reprodução...");
	}

}
