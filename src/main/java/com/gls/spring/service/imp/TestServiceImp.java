package com.gls.spring.service.imp;

import com.gls.spring.mapper.TestMapper;
import com.gls.spring.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("Test")
public class TestServiceImp implements TestService {

    @Autowired
    private TestMapper tm;

    @Override
    public void find() {
        tm.find();
    }
}
