class ContaPoupanca(
    titular: String,
    numero: Int
) : Conta(
    titular,
    numero
) {
    override fun saque(valor: Double) {
        if (saldo >= valor) {
            saldo -= valor
        }
    }

}