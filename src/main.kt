fun main() {

    println("Olá Mundo!")
    val fThiago = Funcionario(nome = "Thiago", cpf = "111.111.111-11", salario = 1000.00)

    println("Funcionario ${fThiago.nome}")
    println("cpf ${fThiago.cpf}")
    println("salario ${fThiago.salario}")
    println("bonificacão ${fThiago.bonificacao()}")
    println("")

    val gLeticia = Gerente(
        nome = "Leticia",
        cpf = "222.222.222-22",
        salario = 2000.0,
        senha = 1234
    )

    println("Gerente ${gLeticia.nome}")
    println("cpf ${gLeticia.cpf}")
    println("salario ${gLeticia.salario}")
    println("bonificação ${gLeticia.bonificacao()}")
    if(gLeticia.autentica(1235)){
        println("Autenticado!")
    } else {
        println("Senha Errada Maluco!")
    }
    println("")

    val dJoao = Diretor(
        nome = "Joao",
        cpf = "333.333.333-33",
        salario = 3000.0,
        senha = 3000,
        plr = 300.0
    )

    println("Diretor ${dJoao.nome}")
    println("cpf ${dJoao.cpf}")
    println("salario ${dJoao.salario}")
    println("bonificação ${dJoao.bonificacao()}")
    println("Plr ${dJoao.plr}")
    if(dJoao.autentica(3000)){
        println("Autenticado!")
    } else {
        println("Senha Errada Maluco!")
    }
    println("")
}





