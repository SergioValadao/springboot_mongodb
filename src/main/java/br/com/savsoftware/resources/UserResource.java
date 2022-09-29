package br.com.savsoftware.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.savsoftware.domain.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@RequestMapping(method=RequestMethod.GET)	//Pode usar só - @GetMapping
	/* Para ficar mais sofisticado no lugar de retornar só uma lista, vou retornar um 
	 * objeto responseEntity
	 
	public List<User> findAll(){
	*/
	public ResponseEntity<List<User>> findAll(){
		User maria = new User("1", "Maria Brown", "maria@gmail.com");
		User alex = new User("2", "Alex Greenb", "alex@gmail.com");
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(maria, alex));
		//return list;
		return ResponseEntity.ok().body(list);
	}

}
