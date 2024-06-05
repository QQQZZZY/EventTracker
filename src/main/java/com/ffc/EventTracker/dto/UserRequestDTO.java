package com.ffc.EventTracker.dto;

import lombok.Data;

import java.util.Map;

@Data
public class UserRequestDTO {
    private String userId;
    private Map<String, String> attributes;
}
