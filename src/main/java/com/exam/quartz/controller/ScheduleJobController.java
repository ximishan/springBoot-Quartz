package com.exam.quartz.controller;

import com.exam.quartz.entity.ScheduleJob;
import com.exam.quartz.service.ScheduleJobService;
import com.exam.quartz.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * 定时任务
 *
 * @author
 */
@RestController
@RequestMapping("/sys/schedule")
public class ScheduleJobController {
	@Autowired
	private ScheduleJobService scheduleJobService;
	
	/**
	 * 定时任务列表
	 */
//
	
	/**
	 * 定时任务信息
	 */
	@RequestMapping("/info/{jobId}")
	public R info(@PathVariable("jobId") Long jobId){
		ScheduleJob schedule = scheduleJobService.getById(jobId);
		
		return R.ok().put("schedule", schedule);
	}
	
	/**
	 * 保存定时任务
	 */
	@RequestMapping("/save")
	public R save(@RequestBody ScheduleJob scheduleJob){

		scheduleJobService.saveJob(scheduleJob);
		
		return R.ok();
	}
	
	/**
	 * 修改定时任务
	 */
	@RequestMapping("/update")
	public R update(@RequestBody ScheduleJob scheduleJob){

		scheduleJobService.update(scheduleJob);
		
		return R.ok();
	}
	
	/**
	 * 删除定时任务
	 */
	@RequestMapping("/delete")
	public R delete(@RequestBody Long[] jobIds){
		scheduleJobService.deleteBatch(jobIds);
		
		return R.ok();
	}
	
	/**
	 * 立即执行任务
	 */
	@RequestMapping("/run")
	public R run(@RequestBody Long[] jobIds){
		scheduleJobService.run(jobIds);
		
		return R.ok();
	}
	
	/**
	 * 暂停定时任务
	 */
	@RequestMapping("/pause")
	public R pause(@RequestBody Long[] jobIds){
		scheduleJobService.pause(jobIds);
		
		return R.ok();
	}
	
	/**
	 * 恢复定时任务
	 */
	@RequestMapping("/resume")
	public R resume(@RequestBody Long[] jobIds){
		scheduleJobService.resume(jobIds);
		
		return R.ok();
	}

}
