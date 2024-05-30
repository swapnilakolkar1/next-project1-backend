package com.app.webapp.controllers.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/api/v1")
public class AppController {

    @Autowired
    private AppService appService;

    @GetMapping(path = "/list", produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<AppEntityDto> getList() {
        return appService.getAppData();
    }

    @PutMapping(path = "/add", produces = {MediaType.APPLICATION_JSON_VALUE}, consumes = {MediaType.APPLICATION_JSON_VALUE})
    public List<AppEntityDto> addToList(@RequestBody AppEntityDto request) {
        if (Objects.nonNull(request) && Objects.nonNull(request.getName())) {
            appService.addToData(request);
        }
        return appService.getAppData();
    }
}
