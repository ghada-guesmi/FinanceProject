package tn.esprit.spring.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import tn.esprit.spring.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	Optional<User> findByUsername(String username);

	Optional<User> findByEmail(String email);

	Boolean existsByUsername(String username);

	Boolean existsByEmail(String email);
    User findById(long id_AGENT);
	@Query(value = "SELECT u.`user_id` FROM `user` u join user_roles r on u.`user_id`=r.user_id WHERE r.role_id=1 ", nativeQuery = true)
	public List<String> findClient_pt_100(int nbpoint);


}
