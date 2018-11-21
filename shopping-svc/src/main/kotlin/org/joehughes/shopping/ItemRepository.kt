package org.joehughes.shopping

import org.springframework.data.repository.CrudRepository

interface ItemRepository : CrudRepository<Item, Long> {
	fun findByName(lastName: String): Iterable<Item>
}
