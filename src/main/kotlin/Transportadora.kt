class Transportadora {
    constructor(
        nomeTransportadora: String,
        telefoneComercial: String,
    ){
        this.nomeTransportadora = nomeTransportadora
        this.telefoneComercial = telefoneComercial
    }

    var nomeTransportadora:String? = null
        get() = if (nomeTransportadora.isNullOrEmpty()) "Nome da transportadora não informado" else field
        set(value) {
            field = if (value!!.length <= 2) null else value
        }
    var telefoneComercial: String? = null
        get() = if (field.isNullOrEmpty()) "Telefone para contato não foi informado" else field
        set(value) {
            field = if (value!!.length >= 11) value else null
        }

    override fun toString(): String {
        return "A transportadora $nomeTransportadora informou que seu telefone comercial é $telefoneComercial"
    }
}