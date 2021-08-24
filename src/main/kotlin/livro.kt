open class Livro(nomeDaObra: String) {
    // val informe:String = "infome o nome da obra"
    var autor = readLine()
    var nomeDaObra = readLine()
    val classificacao = readLine()

    fun informacoes(){
        println("Nome do autor : $autor")
        println("Nome da obra : $nomeDaObra")
        println("Classidicação : $classificacao")
    }

    open fun alterarNomeDaObra(nomeDaObra: String): String? {
        println("Informe o nome da obra")
        var nomeDaObra = readLine()
        println("Informe Para Qual Nome Deseja Trocar")
        var alterar = readLine()
        if (alterar != nomeDaObra) {
            nomeDaObra = alterar
            println("Nome Alterado Com Sucesso : ${alterar}")
        }else{
            if(alterar== nomeDaObra)
                println("os nome são iguais tente novamente")
        }
        return null
    }
}
