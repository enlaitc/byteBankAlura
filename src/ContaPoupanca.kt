class ContaPoupanca(
    titular: String,
    numero: Int
) : ContaTransferivel(
    titular = titular,
    numero = numero
) {
    override fun saca(valor: Double) {
        if (saldo >= valor) {
            saldo -= valor
        }
    }

}