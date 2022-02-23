fun main() {

    val Transportadora = Transportadora(
            nomeTransportadora = "Transporte",
            telefoneTransportadora = "51954678323"
    )

    val Cliente = Cliente(
            nome = "João",
            email = "joaozinho@gmail.com",
            telefone = "51232344444",
            cpf = "522-345-768.98"
    )

    val Venda = Venda(
            tempoEntrega = LocalTime.of(00,30),
            horario = LocalTime.of(18,00),
    )

    val Produto = Produto(
            nomeProduto = "M&M's",
            valorProduto = "3,00",
    )

    val Fornecedor = Fornecedor(
            nomeFornecedor = "Josué",
            telefoneFornecedor = "5178645658",
    )

    val Vendedor = Vendedor(
            nomeVendedor = "Bernardo",
            telefone = "5198987676",
            email = "bernardo.b1@gmail.com",
            cpf = "678.342.889-50",
    )

}

