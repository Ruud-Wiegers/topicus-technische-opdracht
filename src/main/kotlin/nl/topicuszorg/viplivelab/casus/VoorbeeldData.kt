package nl.topicuszorg.viplivelab.casus

import java.time.LocalDate
import java.time.LocalDateTime

data class VoorbeeldData(
    val naam: String,
    val datum: LocalDate,
    val somsEenTijdstip: LocalDateTime?,
    val lijstje: List<Dingetjes>
)

data class Dingetjes(
    val naam: String,
    val nummer: Int
)