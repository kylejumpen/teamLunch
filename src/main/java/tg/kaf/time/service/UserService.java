package tg.kaf.time.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import tg.kaf.time.model.UserApp;
import tg.kaf.time.repository.UserAppRepository;

import java.util.Optional;

@Service
public class UserService {

	@Autowired
	private static UserAppRepository userAppRepository;

	public Optional<UserApp> loadUserByUsername(String s) throws UsernameNotFoundException {
		return userAppRepository.findById(s);
	}

	public void createUserApp(UserApp userApp){
		userAppRepository.save(userApp);
	}

	public void updateUserApp(UserApp userApp){
		userAppRepository.save(userApp);
	}

	public void deleteUser(UserApp userApp){
		userAppRepository.delete(userApp);
	}
}
