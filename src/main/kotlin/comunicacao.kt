open class Comunicacao {
    var brilho: Int = 0

    //Base
   open fun brilho(){
       brilho
        println(brilho)
    }

    fun aumentaBrilho(){
        brilho++
    }

    fun diminuiBrilho(){
        brilho--
    }
}