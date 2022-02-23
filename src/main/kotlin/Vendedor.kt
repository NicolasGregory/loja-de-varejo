class Vendedor {
    constructor(
        nomeVendedor: String,
        email: String,
        cpf: String,
        telefone: String,
    ){
        this.nomeVendedor = nomeVendedor
        this.email = email
        this.cpf = cpf
        this.telefone = telefone
    }

    var nomeVendedor:String? = null
        get() = if (nomeVendedor.isNullOrEmpty()) "Nome do vendedor não informado" else field
        set(value) {
            field = if (value!!.length <= 2) null else value
        }
    var email:String? = null
        get() = if (field.isNullOrEmpty()) "Endereço de email não foi informado" else field
        set(value) {
            field = if (value.isNullOrEmpty()) null else value
        }
    var cpf: String? = null
        get() = if (field.isNullOrEmpty()) "CPF do vendedor não informado" else field
        set(value) {
            field = if (value?.length == 11) value else null
        }
    var telefone: String? = null
        get() = if (field.isNullOrEmpty()) "Telefone para contato não foi informado" else field
        set(value) {
            field = if (value!!.length >= 11) value else null
        }

    override fun toString(): String {
        return "o vendedor $nomeVendedor informou que seu email é $email, seu cpf é $cpf e que seu número de telefone é $telefone"
    }
}