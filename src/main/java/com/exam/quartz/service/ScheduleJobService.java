package com.exam.quartz.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.exam.quartz.entity.ScheduleJob;


/**
 * 定时任务
 *
 * @author
 */
public interface ScheduleJobService extends IService<ScheduleJob> {

//	PageUtils queryPage(Map<String, Object> params);

	/**
	 * 保存定时任务
	 */
	void saveJob(ScheduleJob scheduleJob);
	
	/**
	 * 更新定时任务
	 */
	void update(ScheduleJob scheduleJob);
	
	/**
	 * 批量删除定时任务
	 */
	void deleteBatch(Long[] jobIds);
	
	/**
	 * 批量更新定时任务状态
	 */
	int updateBatch(Long[] jobIds, int status);
	
	/**
	 * 立即执行
	 */
	void run(Long[] jobIds);
	
	/**
	 * 暂停运行
	 */
	void pause(Long[] jobIds);
	
	/**
	 * 恢复运行
	 */
	void resume(Long[] jobIds);
}
