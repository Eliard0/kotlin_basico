 class Livro : Comunicacao() {

    var nomeDaObra = readLine()

    fun informacoes(){
        println("Nome da obra : $nomeDaObra")
    }

     //sobrescrita
     override fun brilho() {
         println("Brilho Normal")
     }

     fun alterarNomeDaObra(nomeDaObra: String): String? {
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
