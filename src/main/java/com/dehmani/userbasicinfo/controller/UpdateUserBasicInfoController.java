package com.dehmani.userbasicinfo.controller;

import com.dehmani.userbasicinfo.exception.ResourceNotFoundException;
import com.dehmani.userbasicinfo.model.UserBasicInfo;
import com.dehmani.userbasicinfo.repository.UserBasicInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * Created by Amine Dehmani on 2/7/2020.
 */
@RestController
@RequestMapping("/api")
public class UpdateUserBasicInfoController {

    @Autowired
    UserBasicInfoRepository userBasicInfoRepository;

    @PutMapping("/update/userbasicinfo/{id}")
    public UserBasicInfo updateUserBasicInfo(@PathVariable(value = "id") Long userBasicInfoId, @Valid @RequestBody UserBasicInfo userBasicInfoDetails) {

        UserBasicInfo userBasicInfo = userBasicInfoRepository.findById(userBasicInfoId)
                .orElseThrow(() -> new ResourceNotFoundException("UserBasicInfo", "id", userBasicInfoId));

        userBasicInfo.setUsername(userBasicInfoDetails.getUsername());
        userBasicInfo.setFirstName(userBasicInfoDetails.getFirstName());
        userBasicInfo.setLastName(userBasicInfoDetails.getLastName());
        userBasicInfo.setAge(userBasicInfoDetails.getAge());
        userBasicInfo.setEmail(userBasicInfoDetails.getEmail());
        userBasicInfo.setPhoneNumber(userBasicInfoDetails.getPhoneNumber());

        UserBasicInfo updateUserBasicInfo = userBasicInfoRepository.save(userBasicInfo);
        return updateUserBasicInfo;
    }
}
