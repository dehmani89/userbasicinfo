package com.dehmani.userbasicinfo.repository;

import com.dehmani.userbasicinfo.model.UserBasicInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Amine Dehmani on 2/7/2020.
 */

@Repository
public interface UserBasicInfoRepository extends JpaRepository<UserBasicInfo, Long> {

}



