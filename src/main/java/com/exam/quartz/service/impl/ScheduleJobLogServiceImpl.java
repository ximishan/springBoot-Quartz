package com.exam.quartz.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.exam.quartz.dao.ScheduleJobLogDao;
import com.exam.quartz.entity.ScheduleJobLog;
import com.exam.quartz.service.ScheduleJobLogService;
import org.springframework.stereotype.Service;


@Service("scheduleJobLogService")
public class ScheduleJobLogServiceImpl extends ServiceImpl<ScheduleJobLogDao, ScheduleJobLog> implements ScheduleJobLogService {



}
