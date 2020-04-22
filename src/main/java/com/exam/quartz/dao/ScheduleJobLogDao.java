package com.exam.quartz.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.exam.quartz.entity.ScheduleJobLog;
import org.apache.ibatis.annotations.Mapper;

/**
 * 定时任务日志
 *
 * @author
 */
@Mapper
public interface ScheduleJobLogDao extends BaseMapper<ScheduleJobLog> {
	
}
