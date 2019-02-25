package pl.website.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.website.model.User;
import pl.website.model.UserDetails;
import pl.website.repository.UserRepository;

import java.util.List;

@Service
@Transactional
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> findAllUser(){
        return userRepository.findAll();
    }

    public User findOneUserById(Long id){
        return userRepository.findOne(id);
    }

    public void saveUser(User user){
        userRepository.save(user);
    }

    public void deleteOneUserByUser( User user){
        userRepository.delete(user);
    }

    public void deleteOneUserById( Long id){
        userRepository.delete(id);
    }

    public void deleteAllUser( ){
        userRepository.deleteAll();
    }

    public long countAllUser(){
        return   userRepository.count();
    }
}
