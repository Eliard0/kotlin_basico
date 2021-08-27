class Midia : Comunicacao() {
    var favorito: Boolean = false

    //sobrescrita
    //sobrecarga adicionando outra informação
    override fun brilho() {
        print("Brilho Alto. Er favorito : " + "$favorito")
    }

    fun addFavorito(){
        var favorito:Boolean = true
        if(favorito==true){
            println("adicionado aos favoritos com sucesso")
        }
    }

    fun reagir(reacao:Int){
        if(reacao==5){
            println("mais ou menos")
        }
        if(reacao<5) {
        println("nao gostei")
        }
        if(reacao>=6){
            println("bom")
        }
    }

    fun reagir(reacao:Boolean){
        if(reacao==true){
            println("gostei")
        }
        if(reacao==false) {
            println("nao gostei")
        }
    }
}