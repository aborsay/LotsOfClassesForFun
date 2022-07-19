package xyz.borsay.lotsofclassesforfun.jetpaks

class JetPack {
    var userHeight: Int =0
    var topHeight = 5000

    fun burn(seconds: Int){
        do{
            userHeight += seconds

        }while(userHeight < topHeight)
    }
    fun stop(seconds: Int){
        do{
            userHeight -= seconds*3

        }while(userHeight >= 0)
    }
}