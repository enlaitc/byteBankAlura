open class Conta(var titular: String, var numero: Int) {
    var saldo = 0.0
        private set


    fun deposita(valor: Double) {
        if (valor > 0) {
            /*this.*/ saldo += valor
        }
    }

    open fun saque(valor: Double) {
        if (saldo >= valor) {
            saldo -= valor
        }
    }

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            destino.deposita(valor)
            return true
        }
        return false
    }

//    fun getSaldo(): Double {
//        return saldo
//    }
//
//    fun setSaldo(valor: Double) {
//        if (valor > 0) {
//            saldo = valor
//        }
//
//    }
}