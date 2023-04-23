package com.yph.service.impl;

import com.yph.mapper.InDao;
import com.yph.service.InService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("inService")
public class InServiceImpl implements InService {

    private static final Logger logger = LoggerFactory.getLogger(InServiceImpl.class);
    @Autowired
    InDao inDao;

    public String insert() {
        logger.info("InServiceImpl insert");
        return inDao.insert();
    }
}
