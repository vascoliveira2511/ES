package eu.europa.esig.dss.web.dao;

import eu.europa.esig.dss.web.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
}