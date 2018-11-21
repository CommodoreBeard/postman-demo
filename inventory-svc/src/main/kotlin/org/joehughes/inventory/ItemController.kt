package org.joehughes.inventory

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
class ItemController(private val repository: ItemRepository) {

	@GetMapping("/items")
	fun findAll(): Iterable<Item> = repository.findAll()

    @PostMapping("/items")
    @ResponseStatus(HttpStatus.CREATED)
    fun createItem(@RequestBody item: Item): Item
            = repository.save(item)

    @DeleteMapping("/items")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun deleteItem(@RequestBody item: Item) {
        repository.delete(item)
    }
}