package com.exam.quartz.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.exam.quartz.entity.ScheduleJob;
import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

/**
 * 定时任务
 *
 * @author
 */
@Mapper
public interface ScheduleJobDao extends BaseMapper<ScheduleJob> {
	
	/**
	 * 批量更新状态
	 */
	int updateBatch(Map<String, Object> map);
}
