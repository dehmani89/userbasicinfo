package com.dehmani.userbasicinfo.controller;

import com.dehmani.userbasicinfo.exception.ResourceNotFoundException;
import com.dehmani.userbasicinfo.model.UserBasicInfo;
import com.dehmani.userbasicinfo.repository.UserBasicInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Amine Dehmani on 2/7/2020.
 */
@RestController
@RequestMapping("/api")
public class DeleteUserBasicInfoController {

    @Autowired
    UserBasicInfoRepository userBasicInfoRepository;

    @DeleteMapping("/delete/userbasicinfo/{id}")
    public ResponseEntity<?> deleteUserBasicInfo(@PathVariable(value = "id") Long userBasicInfoId) {
        UserBasicInfo userBasicInfo = userBasicInfoRepository.findById(userBasicInfoId)
                .orElseThrow(() -> new ResourceNotFoundException("UserBasicInfo", "id", userBasicInfoId));

        userBasicInfoRepository.delete(userBasicInfo);
        return ResponseEntity.ok().build();
    }
}
