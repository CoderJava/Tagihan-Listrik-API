package com.ysn.tagihanlistrik.controller.index;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class IndexController {

    @RequestMapping("/")
    public ResponseEntity<Map<String, Object>> index() {
        Map<String, Object> mapDataReturn = new HashMap<>();
        mapDataReturn.put("success", true);
        mapDataReturn.put("message", "Spring Boot running well");
        return new ResponseEntity<>(mapDataReturn, HttpStatus.OK);
    }
}
