package com.example.onemany.repos;


import com.example.onemany.entity2.Site;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class SiteRepo {

    @Autowired
    EntityManager em;


    public Site findSite(int id){
        return em.find(Site.class ,id);
    }

    public void addSite(Site site){
        em.persist(site);

    }

    public void update(Site site){
        em.merge(site);
    }

    public List<Site> getAll(){
        final TypedQuery<Site> all_sites = em.createNamedQuery("all_sites", Site.class);
        return all_sites.getResultList();

    }



}
