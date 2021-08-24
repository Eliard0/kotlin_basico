class Midia (nomeDaObra : String): Livro(nomeDaObra) {
    var favorito: Boolean = false

    override fun alterarNomeDaObra(nomeDaObra: String): String? {
        if(favorito==false){
            super.alterarNomeDaObra(nomeDaObra + println("nao er um favorito"))
        }else {
            return super.alterarNomeDaObra(nomeDaObra + println(favorito))
        }
        return null
    }


    fun addFavorito(){
        if(favorito==false){
            favorito = true
            println("adicionado aos favoritos com sucesso")
        }else{
            if(favorito == true)
                println("ja er um favorito")
        }
    }
}