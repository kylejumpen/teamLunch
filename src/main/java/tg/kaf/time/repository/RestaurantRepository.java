package tg.kaf.time.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tg.kaf.time.model.Restaurant;

@Repository
public interface RestaurantRepository extends CrudRepository<Restaurant, Integer> {

}
