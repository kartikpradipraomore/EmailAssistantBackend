package com.emailwriter.Dto;

import lombok.Data;

@Data
public class EmailRequest {

    private String emailContent;
    private String tone;

}
