package com.dehmani.userbasicinfo.controller;

import com.dehmani.userbasicinfo.model.UserBasicInfo;
import com.dehmani.userbasicinfo.repository.UserBasicInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * Created by Amine Dehmani on 2/7/2020.
 */
@RestController
@RequestMapping("/api")
public class AddUserBasicInfoController {

    @Autowired
    UserBasicInfoRepository userBasicInfoRepository;

    @PostMapping("/insert/userbasicinfo")
    public UserBasicInfo createUserBasicInfo(@Valid @RequestBody UserBasicInfo userBasicInfo) {
        return userBasicInfoRepository.save(userBasicInfo);
    }

}
