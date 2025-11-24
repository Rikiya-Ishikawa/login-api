package io.github.rikiyaishikawa.login_api;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;

@Mapper
public interface UserMapper {

    @Insert("INSERT INTO users (username, password, email, role) VALUES (#{username}, #{password}, #{email), #{role}")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    User insert(User user);

}
