package Designs.SnakeAndLadders.Controllers;

import Designs.SnakeAndLadders.Models.User;
import Designs.SnakeAndLadders.Repositories.UserRepository;
import Designs.SnakeAndLadders.Services.UserService;

public class UserController {

    UserService userService = new UserService();
    public User createUser(Integer id, String userName, String email){
        return userService.createUser(id, userName, email);
    }

}
