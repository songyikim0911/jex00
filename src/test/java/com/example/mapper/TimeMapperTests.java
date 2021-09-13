package com.example.mapper;

import com.example.jex00.config.RootConfig;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@Log4j2
@ExtendWith(SpringExtension.class)
@ContextConfiguration( classes = {RootConfig.class})
public class TimeMapperTests {

    @Autowired
    TimeMapper timeMapper;//테스트코드는 자동주입이안되므로 항상 autowired필요함.

    @Test
    public void testGetTime1(){

        log.info(timeMapper);
        log.info(timeMapper.getTime());

    }

}
