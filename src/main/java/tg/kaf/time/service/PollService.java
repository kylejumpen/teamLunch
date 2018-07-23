package tg.kaf.time.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tg.kaf.time.model.Poll;
import tg.kaf.time.repository.PollRepository;
import tg.kaf.time.repository.RestaurantRepository;

import java.util.Optional;

import static tg.kaf.time.model.Status.CANCELLED;
import static tg.kaf.time.model.Status.ONGOING;

@Service
public class PollService {

	@Autowired
	private PollRepository pollRepository;

	@Autowired
	private RestaurantRepository restaurantRepository;

	public void createPoll(Poll poll) {
		poll.getRestaurants().stream()
				.filter(restaurant -> !restaurantRepository.findById(restaurant.getId()).isPresent())
				.forEach(restaurantRepository::save);
		poll.setStatus(ONGOING);
		pollRepository.save(poll);
	}

	public Optional<Poll> viewPoll(int id) {

		return pollRepository.findById(id);
	}

	public void updatePoll(Poll poll) {
		pollRepository.save(poll);
	}

	public void cancelPoll(int id) throws Exception {
		Poll pollById = pollRepository.findById(id).orElseThrow(() -> new Exception("NotFound"));
		pollById.setStatus(CANCELLED);
		pollRepository.save(pollById);
	}
}
