package tg.kaf.time.repository;

import org.springframework.data.repository.CrudRepository;
import tg.kaf.time.model.Poll;

public interface PollRepository extends CrudRepository<Poll,Integer> {
}
