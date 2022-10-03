package br.com.savsoftware.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.savsoftware.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
	
}
