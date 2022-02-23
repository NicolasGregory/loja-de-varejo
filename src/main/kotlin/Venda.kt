import java.time.LocalDateTime


class Venda {
    constructor(
        horario: LocalDateTime,
        produto: String,
    ){
        this.horario = horario
        this.produto = produto
    }

    var horario: LocalDateTime? = null
        set(value) {
            if (value == null){
                field = LocalDateTime.now()
            } else {
                field = value
            }
        }
    var tempoEntrega: LocalTime? = null
        set(value) {
            if (value == null) {
                field = LocalTime.now()
            } else {
                field = value
            }
        }

    override fun toString(): String {
        return "a venda foi realizada às $horario e a entrega irá demorar $tempoEntrega"
    }
}