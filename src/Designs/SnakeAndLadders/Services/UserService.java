package Designs.SnakeAndLadders.Services;

import Designs.SnakeAndLadders.Models.User;
import Designs.SnakeAndLadders.Repositories.UserRepository;

public class UserService {

    UserRepository userRepository = new UserRepository();

    public User createUser(Integer id, String name, String email){

//        Step 1. Create the Object
        User user = User.builder()
                    .id(id)
                    .email(email)
                    .username(name)
                    .build();
//        Step 2 : Store it in Database
        userRepository.save(user);
        return user;
    }
}
