package org.joehughes.shopping

import org.springframework.data.repository.CrudRepository

interface ItemRepository : CrudRepository<Item, Long>
