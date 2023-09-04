package object_oriented_programming

class Account(val accountName: String) {

    var balance = 0
    var transactions = mutableListOf<Int>()

    fun deposit(amount: Int) {
        if (amount > 0) {
            transactions.add(amount)
            balance += amount
            println("$amount deposited. Balance is now ${this.balance}.")
        } else {
            println("Cannot deposit negative sums.")
        }
    }

    fun withdraw(withdrawal: Int) {
        if (-withdrawal < 0) {
            transactions.add(withdrawal)
            this.balance += -withdrawal
            println("$withdrawal withdrawn. Balance is now ${this.balance}.")
        } else {
            println("Cannot withdraw negative sums.")
        }
    }

    fun calculateBalance(): Int {
        this.balance = 0
        for (transaction in transactions) {
            this.balance += transaction
        }
        return this.balance
    }
}

fun main() {
    val michaelAccount = Account("Michael")
    michaelAccount.deposit(1000)
    michaelAccount.withdraw(500)
    michaelAccount.deposit(-20)
    michaelAccount.withdraw(-100)

    val balance = michaelAccount.calculateBalance()
    println("Balance is $balance.")
    michaelAccount.balance = 1000
}