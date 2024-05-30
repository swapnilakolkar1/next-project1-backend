package com.app.webapp.controllers.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppService {
    @Autowired
    AppRepo repo;


    public List<AppEntityDto> getAppData() {
        return repo.findAll(Sort.by(Sort.Order.asc("id"))).stream().map((data) -> {
            AppEntityDto dto = new AppEntityDto();
            dto.setId(data.getId());
            dto.setName(data.getName());
            return dto;
        }).toList();
    }

    public void addToData(AppEntityDto re) {
        AppEntity entity = new AppEntity();
        entity.setName(re.getName());
        repo.save(entity);
    }
}
