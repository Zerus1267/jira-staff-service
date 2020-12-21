package nure.staffservice.services.interfaces;

import nure.staffservice.domain.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends CrudRepository<User, Integer> {

	@Query(value = "select us from User us where us.loginName=:loginName")
	User getByLogin(@Param("loginName") String login);

}
