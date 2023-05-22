package com.us.example;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by yangyibo on 17/2/10.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {BaseTest.ComponentScanConfig.class})
public class BaseTest extends AbstractTransactionalJUnit4SpringContextTests {
    @Configuration
    @ComponentScan(basePackages = {"com.us.example"}, excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, value = Configuration.class))
    static class ComponentScanConfig {

    }

    public void assertNotNull(Object obj) {
        System.out.println(obj);
        Assert.assertNotNull(obj);
    }
}
