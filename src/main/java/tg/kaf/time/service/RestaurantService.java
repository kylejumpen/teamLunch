package tg.kaf.time.service;

import org.slf4j.Logger;
import org.springframework.stereotype.Service;
import tg.kaf.time.model.Restaurant;
import tg.kaf.time.repository.RestaurantRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.slf4j.LoggerFactory.getLogger;

@Service
public class RestaurantService {

	private final RestaurantRepository restaurantRepository;

	private Logger logger = getLogger(RestaurantService.class);

	public RestaurantService(RestaurantRepository restaurantRepository) {
		this.restaurantRepository = restaurantRepository;
	}

	public List<Restaurant> findAllRestaurants() {
		List<Restaurant> restaurants = new ArrayList<>();
		for (Restaurant restaurant : restaurantRepository.findAll()) {
			restaurants.add(restaurant);
		}
		return restaurants;
	}

	public Optional<Restaurant> findRetaurantById(int id) {
		return restaurantRepository.findById(id);
	}

	public void createRestaurant(Restaurant restaurant) {
		Restaurant restaurantSaved = restaurantRepository.save(restaurant);
		logger.info("Restaurant added : {} .",restaurantSaved);
	}

	public void deleteRestaurant(Restaurant restaurant) {
		restaurantRepository.delete(restaurant);
		logger.info("Restaurant deleted : {} .",restaurant);
	}

	public synchronized void updateRestaurant(Restaurant restaurant) {
		restaurantRepository.save(restaurant);
		logger.info("Restaurant updated : {} .",restaurant);
	}
}
