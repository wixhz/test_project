package com.yph.mapper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository
public class InDao {
    private static final Logger logger = LoggerFactory.getLogger(InDao.class);

    public String insert(){
        logger.info("InDao");
        return "INSERT INTO";
    }

}
