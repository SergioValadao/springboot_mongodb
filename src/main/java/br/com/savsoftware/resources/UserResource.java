package br.com.savsoftware.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.savsoftware.domain.User;
import br.com.savsoftware.service.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@Autowired
	private UserService service;
	
	@RequestMapping(method=RequestMethod.GET)	//Pode usar só - @GetMapping
	/* Para ficar mais sofisticado no lugar de retornar só uma lista, vamos retornar um 
	 * objeto responseEntity
	 
	public List<User> findAll(){
		List<User> list = new ArrayList<>();
		return list;
	*/
	public ResponseEntity<List<User>> findAll(){
		List<User> list = service.findAll();		
		return ResponseEntity.ok().body(list);
	}

}
