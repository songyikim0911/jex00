package org.zerock.tp4.common.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import lombok.extern.log4j.Log4j2;
import org.apache.ibatis.session.*;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.sql.Connection;
import java.util.ArrayList;

@Log4j2
@Configuration
@ComponentScan(basePackages = {"com.example.service"})
@MapperScan(basePackages = {"com.example.mapper"})
public class RootConfig {

    @Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception{
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource());
        return sqlSessionFactoryBean.getObject();
    }

    @Bean
    public DataSource dataSource(){
        HikariConfig config = new HikariConfig();
        config.setDriverClassName("com.mysql.cj.jdbc.Driver");
        config.setJdbcUrl("jdbc:mysql://localhost:3306/springdb");
        config.setUsername("springuser");
        config.setPassword("springuser");

        HikariDataSource dataSource = new HikariDataSource(config);

        return dataSource;
    }


    @Bean(name="names")//빈 이라는 어노테이션을 걸어주면 빈이라는 객체를 생성해줌!!!,name으로 빈의 이름도 지정 가능하고 보통은 메서드의 이름과 맞춤
    public ArrayList<String> names(){//메서드 이름도 명사로 지어줌.
        ArrayList<String> list = new ArrayList<>();
        list.add("AAA");
        list.add("BBB");
        list.add("CCC");
        return list;
    }


}
