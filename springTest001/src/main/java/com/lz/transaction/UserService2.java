package com.lz.transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class UserService2 {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Transactional
    public void test() throws Exception {
        jdbcTemplate.execute("INSERT actor VALUES ('6','f',NOW())");
//        int i = 1/0;
    }

}
