package com.in28minutes.rest.webservices.restfulwebservices.user;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class UserDaoService {
    private static List<User> users = new ArrayList<>();
    private static int usersCount = 3;

    static {
        users.add(new User(1,"Piyush", LocalDate.now()));
        users.add(new User(2,"Kumar", LocalDate.now()));
        users.add(new User(3,"Mandal", LocalDate.now()));
    }

    public List<User> findAll(){
        return users;
    }

    public User save(User user){
        if(user.getId()==null)
            user.setId(++usersCount);
        users.add(user);
        return user;
    }

    public User findOne(int id){
        for(User user:users){
            if(user.getId() == id)
                return user;
        }
        return null;
    }

    public String deleteUser(int id){
        for(User user:users){
            if(user.getId() == id){
                User found = findOne(id);
                users.remove(found);
                return "User deleted";
            }

        }

        return "User with this id not found";
    }


}
