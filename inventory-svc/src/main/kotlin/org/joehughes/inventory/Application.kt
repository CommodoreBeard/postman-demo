package org.joehughes.inventory

import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.SpringApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class Application {

	@Bean
	fun init(repository: ItemRepository) = CommandLineRunner {
        // save a couple of items
	    repository.save(Item("Tooth Brush", 2.99.toFloat()))
	    repository.save(Item("Tooth Paste", 0.99.toFloat()))
	    repository.save(Item("Shampoo", 3.50.toFloat()))
	    repository.save(Item("Deoderant", 2.75.toFloat()))
	}
}

fun main(args: Array<String>) {
    SpringApplication.run(Application:: class.java, *args)
}