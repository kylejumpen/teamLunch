package tg.kaf.time.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tg.kaf.time.model.Restaurant;
import tg.kaf.time.service.RestaurantService;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.DELETE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;
import static org.springframework.web.bind.annotation.RequestMethod.PUT;

@RestController
@RequestMapping(value = "/restaurants")
public class RestaurantController {

	@Autowired
	private RestaurantService restaurantService;

	@RequestMapping(method = GET)
	public List<Restaurant> findAllRestaurants(){
		return restaurantService.findAllRestaurants();
	}

	@RequestMapping(method = GET, value = "/{id}")
	public Restaurant findRestaurantById(@PathVariable(value = "id") int id) {
		return restaurantService.findRetaurantById(id).orElse(null);
	}

	@RequestMapping(method = POST)
	public void createRestaurant(@RequestBody Restaurant restaurant){
		restaurantService.createRestaurant(restaurant);
	}

	@RequestMapping(method = DELETE)
	public void deleteRestaurant(@RequestBody Restaurant restaurant){
		restaurantService.deleteRestaurant(restaurant);
	}

	@RequestMapping(method = PUT)
	public void updateRestaurant(@RequestBody Restaurant restaurant){
		restaurantService.updateRestaurant(restaurant);
	}
}
