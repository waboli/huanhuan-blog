package com.huan.mapper;

import com.huan.model.Post;

import java.util.List;

public interface PostMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table post
     *
     * @mbggenerated Fri May 27 01:50:31 CST 2016
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table post
     *
     * @mbggenerated Fri May 27 01:50:31 CST 2016
     */
    int insert(Post record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table post
     *
     * @mbggenerated Fri May 27 01:50:31 CST 2016
     */
    Post selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table post
     *
     * @mbggenerated Fri May 27 01:50:31 CST 2016
     */
    List<Post> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table post
     *
     * @mbggenerated Fri May 27 01:50:31 CST 2016
     */
    int updateByPrimaryKey(Post record);
}