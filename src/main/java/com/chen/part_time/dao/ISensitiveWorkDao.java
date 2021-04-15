package com.chen.part_time.dao;

import com.chen.part_time.entity.SensitiveWork;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @ClassName ISensitiveWorkDao
 * @Author ChenYicheng
 * @Description 敏感词-dao
 * @Date 2021/4/15 15:31
 */
@Mapper
public interface ISensitiveWorkDao {

    /**
     * @Author ChenYicheng
     * @Description 添加敏感词
     * @Date 2021/4/15 15:26
     */
    boolean addSensitiveWork(SensitiveWork sensitiveWork);

    /**
     * @Author ChenYicheng
     * @Description 查找敏感词
     * @Date 2021/4/15 15:29
     */
    List<SensitiveWork> getList(SensitiveWork sensitiveWork);
}
