package io.github.miaoxinguo.sbs.dao;

import io.github.miaoxinguo.sbs.entity.User;
import java.util.List;

public interface UserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated 2016-09-16 22:10:19
     */
    int insert(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated 2016-09-16 22:10:19
     */
    User selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated 2016-09-16 22:10:19
     */
    List<User> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated 2016-09-16 22:10:19
     */
    int updateByPrimaryKey(User record);
}