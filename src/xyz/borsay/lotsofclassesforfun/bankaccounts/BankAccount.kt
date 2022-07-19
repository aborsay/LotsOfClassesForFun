package xyz.borsay.lotsofclassesforfun.bankaccounts

class BankAccount {
    var interestRate = 1.0
    var amount: Int = 0
    get() = field
    set(value) {
        if(value < 1000)
            interestRate = 1.0
        else if(value < 10000)
            interestRate = 0.5
        else
            interestRate = 0.2
        field = value
        println("The Client has $value and an Interest Rate of $interestRate%")
    }
}