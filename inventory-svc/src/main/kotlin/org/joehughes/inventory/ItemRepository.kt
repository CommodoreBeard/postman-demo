package org.joehughes.inventory

import org.springframework.data.repository.CrudRepository

interface ItemRepository : CrudRepository<Item, Long>
