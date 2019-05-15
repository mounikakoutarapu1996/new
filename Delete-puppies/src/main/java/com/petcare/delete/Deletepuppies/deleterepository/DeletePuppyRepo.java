package com.petcare.delete.Deletepuppies.deleterepository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.petcare.delete.Deletepuppies.model.DeletePuppiesPojo;


public interface DeletePuppyRepo extends MongoRepository<DeletePuppiesPojo, String>{

}
