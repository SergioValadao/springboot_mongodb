package br.com.savsoftware.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.savsoftware.domain.User;
import br.com.savsoftware.repository.UserRepository;

@Service
public class UserService  {

	@Autowired
	private UserRepository reposity;
	
	public List<User> findAll() {
		/*List<User> list = new ArrayList<>();
		  list = reposity.findAll();
		  podemos retornar direto sem criar a lista acima
		 */
		return reposity.findAll();
	}

	public Optional<User> findById(String id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	public boolean existsById(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void deleteById(String id) {
		// TODO Auto-generated method stub
		
	}

	public void delete(User entity) {
		// TODO Auto-generated method stub
		
	}

	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

}
