package com.infy.defecttracker.dto;

import com.infy.defecttracker.entity.Defect;

public class DefectDetailDTO {

private long id;
	
	private long defectId;
	private String defectCategory;
	private String chgStatus;
	private String desc;
	private long priority;
	private String status;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getDefectId() {
		return defectId;
	}
	public void setDefectId(long defectId) {
		this.defectId = defectId;
	}
	
	public String getDefectCategory() {
		return defectCategory;
	}
	public void setDefectCategory(String defectCategory) {
		this.defectCategory = defectCategory;
	}
	public String getChgStatus() {
		return chgStatus;
	}
	public void setChgStatus(String chgStatus) {
		this.chgStatus = chgStatus;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public long getPriority() {
		return priority;
	}
	public void setPriority(long priority) {
		this.priority = priority;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public static DefectDetailDTO valueOf(Defect defect){
		DefectDetailDTO defectDetailDTO = new DefectDetailDTO();
		defectDetailDTO.setDefectId(defect.getId());
		defectDetailDTO.setDefectCategory(defect.getCategory());
		defectDetailDTO.setChgStatus(defect.getChgstatus());
		defectDetailDTO.setDesc(defect.getDescription());
		defectDetailDTO.setPriority(defect.getPriority());
		defectDetailDTO.setStatus(defect.getStatus());
		return defectDetailDTO;
	} 
	
	
	
}
