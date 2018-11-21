package org.joehughes.inventory

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class Item(
    val name: String,
    val price: Float,
    @Id @GeneratedValue
    val id: Long = -1)