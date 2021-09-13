package com.example.controller;

import com.example.dto.BoardDTO;
import com.example.service.Hello;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Arrays;

@Controller
@Log4j2
public class SampleController {
//컨트롤러인데 request, response가 없다?

    @Autowired
    private Hello hello;//이대로하면 에러 -> 빈을 인식 못함.

    @GetMapping("/doA")
    public void doA(String name, int age){//웹에서 파라미터를 간단하게 수집 가능
        log.info("doA....");
        log.info(name);
        log.info(age);
        //겟매핑은 편하다. 브라우저로 바로 테스트가 가능하다.
    }

    @GetMapping("/doB")
    public void doB(String name, int[]arr){
        log.info("doB....");
        log.info(name);//name은 string
        log.info(Arrays.toString(arr));;//arr은 배열로 수집가능
    }


    @GetMapping("/doC")
    public void doC(BoardDTO boardDTO, Model model){//JSP 파라미터로 잡을때, Model model
        log.info("doC......");
        log.info(boardDTO);
         model.addAttribute("board",32L);//request.setAttribute와 동일해짐
        //정보전달을 위해 model
    }

    @GetMapping("/doD")
    public String doD(RedirectAttributes redirectAttributes){
        log.info("--------doD-----------------");
        log.info("--------doD-----------------");
        log.info("--------doD-----------------");
        redirectAttributes.addFlashAttribute("bno",321);//addFlashAttribute 1회용, 한번만 값을 사용 할 수 있게 할 때 쓰는 것.
        return "redirect:/hello";//doD를 실행하면 리다이렉트되어서 HELLO가 실행이된다!
        //bno - 321이라고 값을 한번만 넣어준것
    }


    @GetMapping("/hello")
    public void hello(){

        log.info("hello..............");
        log.info("hello..............");
        log.info(hello);
        log.info("hello..............");
        log.info("hello..............");
    }

}
