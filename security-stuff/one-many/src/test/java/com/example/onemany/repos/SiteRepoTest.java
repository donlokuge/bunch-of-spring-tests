package com.example.onemany.repos;

import com.example.onemany.OneManyApplication;
import com.example.onemany.entity2.Site;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = OneManyApplication.class)
public class SiteRepoTest {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    SiteRepo siteRepo;


    @Before
    public void before(){
        Site s1 = new Site("S1","s900");
        siteRepo.addSite(s1);
    }


    @Test
    public void findSite() {
    }


    @Test
    public void getAll() {

        List<Site> sites  = siteRepo.getAll();
        logger.info("sites->{}",sites);

    }
}