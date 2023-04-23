package com.yph.Controller;

import com.yph.service.InService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InController {

    @Autowired
    private InService inService;

    @RequestMapping("/")
    String home() {
        return inService.insert();
    }
}
