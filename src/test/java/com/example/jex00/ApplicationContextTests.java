package com.example.jex00;

import com.example.jex00.config.RootConfig;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.sql.DataSource;
import java.sql.Connection;
import java.util.ArrayList;

@Log4j2
@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {RootConfig.class})//설정파일을 무엇으로 할것인지 지정하는것, java 파일도 설정파일로 사용가능!
public class ApplicationContextTests {


    @Autowired
    ApplicationContext applicationContext;

    @Autowired
    ArrayList<String> names;

    @Autowired
    DataSource dataSource;

    @Test
    public void testConnection() throws Exception{//외부 리소스 사용, 예외 처리 필요

        Connection con = dataSource.getConnection();
        log.info(con);
        con.close();

    }

    @Test//주입받기
    public void test1(){
        log.info("--------------");
        log.info("--------------");
        log.info(applicationContext);
        log.info(names);
        log.info("--------------");
        log.info("--------------");
    }

}
