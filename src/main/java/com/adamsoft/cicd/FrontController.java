package com.adamsoft.cicd;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FrontController {
    @RequestMapping("/")
    public Map<String, Object> index() {
        Map<String, Object> model = new HashMap<>();
        model.put("result", "success");
        return model;
    }
}
