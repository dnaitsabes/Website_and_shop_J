package pl.website.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.website.model.Newsletter;
import pl.website.repository.NewsletterRepository;

import java.util.List;

@Service
@Transactional
public class NewsletterService {
    @Autowired
    private NewsletterRepository newsletterRepository;

    public List<Newsletter> findAllNewsletter(){
        return newsletterRepository.findAll();
    }

    public Newsletter findOneNewsletterById(Long id){
        return newsletterRepository.findOne(id);
    }

    public void saveNewsletter(Newsletter newsletter){
        newsletterRepository.save(newsletter);
    }

    public void deleteOneNewsletterByNewsletter( Newsletter newsletter){
        newsletterRepository.delete(newsletter);
    }

    public void deleteOneNewsletterById( Long id){
        newsletterRepository.delete(id);
    }

    public void deleteAllNewslette( ){
        newsletterRepository.deleteAll();
    }

    public long countAllNewsletter(){
      return   newsletterRepository.count();
    }
}
