package com.ewolff.microservice.catalog;

import java.math.BigDecimal;
import java.util.UUID;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CatalogApp {

	private final ItemRepository itemRepository;

	@Autowired
	public CatalogApp(ItemRepository itemRepository) {
		this.itemRepository = itemRepository;
	}

	@PostConstruct
	public void generateTestData() {
		itemRepository.save(new Item(UUID.randomUUID().toString(), "iPod", new BigDecimal(42.0)));
		itemRepository.save(new Item(UUID.randomUUID().toString(), "iPod touch", new BigDecimal(21.0)));
		itemRepository.save(new Item(UUID.randomUUID().toString(), "iPod nano", new BigDecimal(1.0)));
		itemRepository.save(new Item(UUID.randomUUID().toString(), "Apple TV", new BigDecimal(100.0)));
		itemRepository.save(new Item(UUID.randomUUID().toString(), "iPad Pro", new BigDecimal(500.0)));
		itemRepository.save(new Item(UUID.randomUUID().toString(), "iPad Air", new BigDecimal(400.0)));
		itemRepository.save(new Item(UUID.randomUUID().toString(), "iPad Mini", new BigDecimal(300.0)));
		itemRepository.save(new Item(UUID.randomUUID().toString(), "iPhone X", new BigDecimal(1000.0)));
		itemRepository.save(new Item(UUID.randomUUID().toString(), "iPhone 8", new BigDecimal(800.0)));
		itemRepository.save(new Item(UUID.randomUUID().toString(), "Mac Pro", new BigDecimal(2000.0)));
		itemRepository.save(new Item(UUID.randomUUID().toString(), "Mac Air", new BigDecimal(1200.0)));
		itemRepository.save(new Item(UUID.randomUUID().toString(), "Mac Mini", new BigDecimal(1000.0)));
		itemRepository.save(new Item(UUID.randomUUID().toString(), "Apple Watch", new BigDecimal(500.0)));
		itemRepository.save(new Item(UUID.randomUUID().toString(), "iMac", new BigDecimal(2000.0)));
	}

	public static void main(String[] args) {
		SpringApplication.run(CatalogApp.class, args);
	}

}
