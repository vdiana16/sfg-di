package com.springframework.pets;

public class PetServiceFactory {
    public PetService getPetService(String petType) {
        switch (petType.toLowerCase()) {
            case "dog":
                return new DogPetService();
            case "cat":
                return new CatPetService();
            default:
                return new DogPetService(); // Default to DogPetService
        }
    }
}
