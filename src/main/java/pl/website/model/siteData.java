package pl.website.model;

import javax.persistence.*;

@Entity
@Table(name = "site_data")
public class siteData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String siteTitle;


}
