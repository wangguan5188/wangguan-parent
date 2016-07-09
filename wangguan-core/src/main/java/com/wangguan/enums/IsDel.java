package com.wangguan.enums;

/**
 * 是否逻辑删除枚举类型
 * 
 * @author zhangtb
 * @date 2016-7-9 16:21:57
 * @since 1.0.0
 */
public enum IsDel {
	
	NO("否", 0),
	
	YES("是", 1);
	
	private String desc;
	private Integer index;
	
	private IsDel(String desc, Integer index) {
		this.desc = desc;
		this.index = index;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Integer getIndex() {
		return index;
	}

	public void setIndex(Integer index) {
		this.index = index;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
