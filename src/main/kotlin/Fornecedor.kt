class Fornecedor {

    constructor(
        nomeFornecedor: String,
        telefoneComercial: String,
    ){
        this.nomeFornecedor = nomeFornecedor
        this.telefoneComercial = telefoneComercial
    }

    var nomeFornecedor:String? = null
        get() = if (nomeFornecedor.isNullOrEmpty()) "Nome do fornecedor não informado" else field
        set(value) {
            field = if (value!!.length <= 2) null else value
        }
    var telefoneComercial: String? = null
        get() = if (field.isNullOrEmpty()) "Telefone para contato não foi informado" else field
        set(value) {
            field = if (value!!.length >= 11) value else null
        }

    override fun toString(): String {
        return "o fornecedor $nomeFornecedor informou que o telefone comercial é $telefoneComercial"
    }
}