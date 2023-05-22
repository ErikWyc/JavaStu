package com.us.example.service;

import com.us.example.BaseTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by yangyibo on 17/2/10.
 */
public class DemoServiceTest extends BaseTest {
    @Autowired
    DemoService userService;

    @Test
    public void getListTest() {
        Map<String, Object> map = new HashMap();
        map.put("id", 1);
    }
}
