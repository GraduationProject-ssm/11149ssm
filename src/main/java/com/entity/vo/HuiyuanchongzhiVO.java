package com.entity.vo;

import com.entity.HuiyuanchongzhiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 会员充值
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-22 10:01:21
 */
public class HuiyuanchongzhiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 充值金额
	 */
	
	private Integer chongzhijine;
		
	/**
	 * 充值时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date chongzhishijian;
		
	/**
	 * 账户余额
	 */
	
	private Integer zhanghuyue;
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：充值金额
	 */
	 
	public void setChongzhijine(Integer chongzhijine) {
		this.chongzhijine = chongzhijine;
	}
	
	/**
	 * 获取：充值金额
	 */
	public Integer getChongzhijine() {
		return chongzhijine;
	}
				
	
	/**
	 * 设置：充值时间
	 */
	 
	public void setChongzhishijian(Date chongzhishijian) {
		this.chongzhishijian = chongzhishijian;
	}
	
	/**
	 * 获取：充值时间
	 */
	public Date getChongzhishijian() {
		return chongzhishijian;
	}
				
	
	/**
	 * 设置：账户余额
	 */
	 
	public void setZhanghuyue(Integer zhanghuyue) {
		this.zhanghuyue = zhanghuyue;
	}
	
	/**
	 * 获取：账户余额
	 */
	public Integer getZhanghuyue() {
		return zhanghuyue;
	}
			
}
