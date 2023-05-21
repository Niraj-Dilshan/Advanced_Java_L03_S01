package com.ictec.businessdirectory.repo;

import com.ictec.businessdirectory.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserInfoRepo extends JpaRepository<UserInfo, Long> {
    @Query("SELECT u FROM UserInfo u WHERE u.name LIKE %:name")
    List<UserInfo> findByNameEndingWith(@Param("name") String name);

}
