package com.dehmani.userbasicinfo.controller;

import com.dehmani.userbasicinfo.exception.ResourceNotFoundException;
import com.dehmani.userbasicinfo.model.UserBasicInfo;
import com.dehmani.userbasicinfo.repository.UserBasicInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Amine Dehmani on 2/7/2020.
 */
@RestController
@RequestMapping("/api")
public class SelectUserBasicInfoController {

    @Autowired
    UserBasicInfoRepository userBasicInfoRepository;

    @GetMapping("/select/userbasicinfo")
    public List<UserBasicInfo> getAllNotes() {
        return userBasicInfoRepository.findAll();
    }

    @GetMapping("/select/userbasicinfo/{id}")
    public UserBasicInfo getUserBasicInfoById(@PathVariable(value = "id") Long basicuserinfoId) {
        return userBasicInfoRepository.findById(basicuserinfoId)
                .orElseThrow(() -> new ResourceNotFoundException("UserBasicInfo", "id", basicuserinfoId));
    }
}
