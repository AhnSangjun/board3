package com.its.board.dto;

import lombok.Data;

@Data
public class BoardDTO {
    private Long id;
    private String boardTitle;
    private String boardWrite;
    private String boardPassword;
    private String boardContents;
    private int boardHits;
}
