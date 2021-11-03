class SistemaInterno {

    fun entra(admin: FuncionarioAdmin, senha: Int) {
        if(admin.senha == senha){
            println("Bem Vindo ao ByteBank!")
        } else {
            println("Falha na autenticação!")
        }
    }

}