package pl.website.model;

import javax.persistence.*;

@Entity
@Table(name = "site_data")
public class SiteData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String siteTitle;

    public SiteData() {
    }

    public SiteData(String siteTitle) {
        this.siteTitle = siteTitle;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSiteTitle() {
        return siteTitle;
    }

    public void setSiteTitle(String siteTitle) {
        this.siteTitle = siteTitle;
    }
}
