package by.shylau.servicescheduler.dto;

import lombok.Data;

@Data
public class Mail {
    private String address;
    private String subject;
    private String text;
}
