package pl.website.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.website.model.SiteData;
import pl.website.model.UserDetails;
import pl.website.repository.UserDetailsRepository;

import java.util.List;

@Service
@Transactional
public class UserDetailsService {
    @Autowired
    private UserDetailsRepository userDetailsRepository;

    public List<UserDetails> findAllUserDetails(){
        return userDetailsRepository.findAll();
    }

    public UserDetails findOneUserDetailsById(Long id){
        return userDetailsRepository.findOne(id);
    }

    public void saveUserDetails(UserDetails userDetails){
        userDetailsRepository.save(userDetails);
    }

    public void deleteOneUserDetailsByUserDetails( UserDetails userDetails){
        userDetailsRepository.delete(userDetails);
    }

    public void deleteOneUserDetailsById( Long id){
        userDetailsRepository.delete(id);
    }

    public void deleteAllUserDetails( ){
        userDetailsRepository.deleteAll();
    }

    public long countAllUserDetails(){
        return   userDetailsRepository.count();
    }
}
