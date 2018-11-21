package org.joehughes.shopping

import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class Item(
    val name: String,
    val price: Float,
    @Id
    val id: Long)