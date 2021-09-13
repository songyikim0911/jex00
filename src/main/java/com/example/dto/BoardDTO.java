package com.example.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data//GETTER SETTER TOSTRING EQUALS

public class BoardDTO {

    private Long bno;
    private String title;
    private String content;
    private String writer;


    private LocalDateTime regDate;
    private LocalDateTime modDate;
}
