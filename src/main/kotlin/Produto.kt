class Produto {
    constructor(
        nomeProduto: String,
        fornecedor: String,
    ){
        this.nomeProduto = nomeProduto
        this.fornecedor = fornecedor
    }

    var nomeProduto:String? = null
        get() = if (nomeProduto.isNullOrEmpty()) "Nome do produto não informado" else field
        set(value) {
            field = if (value!!.length <= 2) null else value
        }
    var valorProduto: String? = null
        get() = if (field.isNullOrEmpty()) "Valor do produto não informado" else field
        set(value) {
            if (field.isNullOrEmpty()) null else value
        }

    override fun toString(): String {
        return "O $nomeProduto custa R$$valorProduto"
    }
}

