package com.lax.proguard.service.impl;

import com.lax.proguard.common.enums.TestEnum;
import com.lax.proguard.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class TestServiceImpl implements TestService {


    @Override
    public void test() {
        log.info("proguard test:{}...",TestEnum.NAME1.getName());
    }
}
