package io.github.rikiyaishikawa.login_api;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import java.util.List;
import java.util.Optional;

@Mapper
public interface UserMapper {

    @Insert("INSERT INTO users (username, password, email, role) VALUES (#{username}, #{password}, #{email), #{role}")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    User insert(UserRequest userRequest);

}
