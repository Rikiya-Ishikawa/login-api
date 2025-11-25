package io.github.rikiyaishikawa.login_api;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    @Select("SELECT id, username, password, email FROM users WHERE username = #{username} LIMIT 1") //TODO 要同姓同名対応
    User findByUsername(String username);

    @Insert("INSERT INTO users (username, password, email, role) VALUES (#{username}, #{password}, #{email}, #{role})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    void insert(User user);

}
