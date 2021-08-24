fun main(args: Array<String>) {
    val obra =  Livro("a mordida do vampiro banguelo")

    obra.informacoes()
    obra.alterarNomeDaObra("pe de feijao")

    val tela = Midia("pe de feijao")

    tela.addFavorito()

    tela.alterarNomeDaObra("pao")

}