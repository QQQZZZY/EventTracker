package com.ffc.EventTracker.controller;

import com.ffc.EventTracker.dto.EventRequestDTO;
import com.ffc.EventTracker.dto.HeartbeatRequestDTO;
import com.ffc.EventTracker.dto.UserRequestDTO;
import com.ffc.EventTracker.util.ApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/track")
public class TrackingController {

    @PostMapping("/event")
    public ResponseEntity<?> trackEvent(@RequestBody EventRequestDTO eventRequest) {
        // 处理事件上报逻辑
        return ResponseEntity.ok(new ApiResponse("success", "Event tracked successfully", "evt_67890"));
    }

    @PostMapping("/heartbeat")
    public ResponseEntity<?> trackHeartbeat(@RequestBody HeartbeatRequestDTO heartbeatRequest) {
        // 处理心跳上报逻辑
        return ResponseEntity.ok(new ApiResponse("success", "Heartbeat tracked successfully"));
    }

    @PostMapping("/user")
    public ResponseEntity<?> trackUser(@RequestBody UserRequestDTO userRequest) {
        // 处理用户属性上报逻辑
        return ResponseEntity.ok(new ApiResponse("success", "User attributes tracked successfully"));
    }
}
