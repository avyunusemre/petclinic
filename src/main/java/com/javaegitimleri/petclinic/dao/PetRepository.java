package com.javaegitimleri.petclinic.dao;

import java.util.List;

import com.javaegitimleri.petclinic.model.Pet;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

@Repository
public interface PetRepository{
	Pet findById(Long id);
	List<Pet> findByOwnerId(Long ownerId);
	void create(Pet pet);
	Pet update(Pet pet);
	void delete(Long id);
	void deleteByOwnerId(Long ownerId);
}
