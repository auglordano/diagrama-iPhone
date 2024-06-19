# diagrama-iPhone

classDiagram

    iPhone <|-- ReprodutorMusical
    iPhone <|-- AparelhoTelefonico 
    iPhone <|-- NavegadorInternet
    iPhone : -ReprodutorMusical
    iPhone : -AparelhoTelefonico
    iPhone : -NavegadorInternet
    iPhone: +tocar()
    iPhone: +pausar()
    iPhone: +selecionarMusica(musica String)
    iPhone: +ligar(numero String)
    iPhone: +atender()
    iPhone: +iniciarCorreioVoz()
    iPhone: +exibirPagina(url String)
    iPhone: +adicionarNovaAba()
    iPhone: +atualizarPagina()

    class ReprodutorMusical{
      +tocar()
      +pausar()
      +selecionarMusica(musica String)
    }
    
    class AparelhoTelefonico {
      +ligar(numero String)
      +atender()
      +iniciarCorreioVoz()
    }
    
    class NavegadorInternet{
      +exibirPagina(url String)
      +adicionarNovaAba()
      +atualizarPagina()
    }