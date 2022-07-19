package xyz.borsay.lotsofclassesforfun.jobs

open class Jobs {
    var name = "Generic Job"
    var revenue = 0.00
    var salary = 30000.00

    fun work(){
        revenue += salary
    }

    fun study(){
        salary += 5000
    }
}