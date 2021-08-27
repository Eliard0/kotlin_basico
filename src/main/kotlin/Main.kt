fun main(args: Array<String>) {

    //mensagem polimorfica
    val autor : Comunicacao = Livro()

    val autor1 : Comunicacao = Midia()

    aumentar(autor)
    aumentar(autor1)

}

fun aumentar(comunicacao: Comunicacao) {
    comunicacao.brilho()

}



