package com.ffc.EventTracker.dto;

import lombok.Data;

@Data
public class HeartbeatRequestDTO {
    private String userId;
    private String sessionId;
    private String timestamp;
}
