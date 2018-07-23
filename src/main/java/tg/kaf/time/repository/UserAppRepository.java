package tg.kaf.time.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tg.kaf.time.model.UserApp;

@Repository
public interface UserAppRepository extends CrudRepository<UserApp,String> {
}
