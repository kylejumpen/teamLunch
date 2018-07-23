package tg.kaf.time.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tg.kaf.time.model.UserApp;
import tg.kaf.time.service.UserService;

import static org.springframework.web.bind.annotation.RequestMethod.POST;
import static org.springframework.web.bind.annotation.RequestMethod.PUT;

@RestController
@RequestMapping(value = "/users")
public class UserController {

	public final UserService userService;

	public UserController(UserService userService) {
		this.userService = userService;
	}

	@RequestMapping(method = POST)
	public void createUser(@RequestBody UserApp user){
		userService.createUserApp(user);
	}

	@RequestMapping(method = PUT)
	public void updateUser(@RequestBody UserApp user) {
		userService.updateUserApp(user);
	}
}
