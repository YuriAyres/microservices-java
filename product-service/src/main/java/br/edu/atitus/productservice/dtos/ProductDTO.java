package br.edu.atitus.productservice.dtos;

public record ProductDTO(
        Long id,
        String description,
        String brand,
        String model,
        String price,
        Double currency,
        Integer stock,
        String imageURL,
        Double environment,
        String convertedPrice,
        String requestedCurrency
) {
}
