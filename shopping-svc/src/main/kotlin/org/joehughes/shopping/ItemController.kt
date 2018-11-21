package org.joehughes.shopping

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
class ItemController(private val repository: ItemRepository) {

    var inventoryService: String = System.getenv("INVENTORY_SVC_BASEURL") ?: "http://localhost:8080"

	@GetMapping("/items")
	fun findAll(): Iterable<Item> = repository.findAll()

    @PostMapping("/items")
    @ResponseStatus(HttpStatus.CREATED)
    fun createItem(@RequestBody item: Item): Item {
        val test = khttp.delete(
                url = "$inventoryService/items",
                json = mapOf(
                        "name" to item.name,
                        "id" to item.inventoryId
                )
        )
        print("HERE $test")
        return repository.save(item)
    }

    @DeleteMapping("/items")
    fun deleteItem(@RequestBody item: Item)
            = repository.delete(item)
}