package com.petcare.delete.Deletepuppies.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.petcare.delete.Deletepuppies.deleterepository.DeletePuppyRepo;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class DeletePuppyController {

	@Autowired
	DeletePuppyRepo repository;
	
	@DeleteMapping("/customers/{id}")
	public ResponseEntity<String> deleteCustomer(@PathVariable("id") String id) {
		System.out.println("Delete Puppy with ID = " + id + "...");

		repository.deleteById(id);

		return new ResponseEntity<>("Puppy has been deleted!", HttpStatus.OK);
	}
}
