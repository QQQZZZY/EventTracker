package com.ffc.EventTracker.util;

import lombok.Data;

@Data
public class ApiResponse {
    private String status;
    private String message;
    private String eventId;

    public ApiResponse(String status, String message) {
        this.status = status;
        this.message = message;
    }

    public ApiResponse(String status, String message, String eventId) {
        this.status = status;
        this.message = message;
        this.eventId = eventId;
    }

}