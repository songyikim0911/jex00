package com.example.controller;


import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board/*")//board로 들어오는 모든 request는 얘가 잡는다는 의미
@Log4j2

public class BoardController {


    @GetMapping("/list")//스프링에 있는 GetMapping을 사용, 얘 경로는 board/list 임
    public void list(){
        log.info("list....");//경로 확인을 위한 로그 체크
        log.info("list....");
        log.info("list....");
        log.info("list....");

        }

    }

