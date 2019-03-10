package pl.website.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.website.model.ProductType;
import pl.website.model.SiteData;
import pl.website.repository.SiteDataRepository;

import java.util.List;

@Service
@Transactional
public class SiteDataService {
    @Autowired
    private SiteDataRepository siteDataRepository;

    public List<SiteData> findAllSiteData(){
        return siteDataRepository.findAll();
    }

    public SiteData findOneSiteDataById(Long id){
        return siteDataRepository.findOne(id);
    }

    public void saveSiteData(SiteData siteData){
        siteDataRepository.save(siteData);
    }

    public void deleteOneSiteDataBySiteData( SiteData siteData){
        siteDataRepository.delete(siteData);
    }

    public void deleteOneSiteDataById( Long id){
        siteDataRepository.delete(id);
    }

    public void deleteAllSiteData( ){
        siteDataRepository.deleteAll();
    }

    public long countAllSiteData(){
        return   siteDataRepository.count();
    }
}
