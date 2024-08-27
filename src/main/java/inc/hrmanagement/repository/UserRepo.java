package inc.hrmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import inc.hrmanagement.entity.User;



public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
