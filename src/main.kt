fun main() {

    println("Olá Mundo!")

    val contaPoupanca = ContaPoupanca(
        titular = "Alex",
        numero = 1000
    )

    val contaCorrente = ContaCorrente(
        titular = "Fran",
        numero = 1001
    )

    contaCorrente.deposita(valor = 1000.0)
    contaPoupanca.deposita(valor = 1000.0)

    println("Saldo Poupança ${contaPoupanca.saldo}")
    println("Saldo Corrente ${contaCorrente.saldo}")

    contaCorrente.saque(valor = 100.0)
    contaPoupanca.saque(valor = 200.0)

    println("Saldo Poupança depois de saque ${contaPoupanca.saldo}")
    println("Saldo Corrente depois de saque ${contaCorrente.saldo}")

    contaCorrente.transfere(valor = 100.0, destino = contaPoupanca)
    println("Saldo Poupança depois de transferencia ${contaPoupanca.saldo}")
    println("Saldo Corrente depois de transferencia ${contaCorrente.saldo}")
}







