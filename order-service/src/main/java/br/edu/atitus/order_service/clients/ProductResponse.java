package br.edu.atitus.order_service.clients;

public record ProductResponse(
	    Long id,
	    String description,
	    String brand,
	    String model,
	    Double price,
	    String currency,
	    Integer stock,
	    String imageURL,
	    String environment,
	    Double convertedPrice
	) {}
