package org.joehughes.shopping

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class Item(
    val name: String,
    val price: Float,
    val inventoryId: Long,
    @Id @GeneratedValue
    val id: Long = -1)