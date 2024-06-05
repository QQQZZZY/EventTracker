package com.ffc.EventTracker.dto;

import lombok.Data;

import java.util.Map;

@Data
public class EventRequestDTO {
    private String eventName;
    private String userId;
    private String timestamp;
    private String platform;
    private String appVersion;
    private String osVersion;
    private String deviceModel;
    private LocationDTO location;
    private String sessionId;
    private Map<String, String> extraParams;
}