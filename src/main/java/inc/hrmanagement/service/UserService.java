package inc.hrmanagement.service;

import org.springframework.stereotype.Service;

import inc.hrmanagement.entity.User;
import inc.hrmanagement.repository.UserRepo;

@Service
public class UserService {

    private UserRepo userRepo;

    public UserService(UserRepo userRepo){
        this.userRepo=userRepo;
    }

    public User findByUsername(String username) {
        return userRepo.findByUsername(username);
    }

    public boolean validateUser(String username, String password) {
        User user = userRepo.findByUsername(username);
        System.out.println("Validating user: " + username); 
        if (user != null) {
            System.out.println("User found, comparing passwords"); 
            return user.getPassword().equals(password);
        }
        System.out.println("User not found"); 
        return false;
    }

    public void saveUser(User user) {
        userRepo.save(user);
    }
}

