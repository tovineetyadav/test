package com.infy.defecttracker.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.defecttracker.constant.GlobalConstant;
import com.infy.defecttracker.dto.DefectDetailDTO;
import com.infy.defecttracker.entity.Defect;
import com.infy.defecttracker.repository.DefectDetailRepository;

@Service
public class DefectDetailService {
	
	@Autowired
	DefectDetailRepository defectDetailRepository;
	
	public List<DefectDetailDTO> getDefectDetails(){
		List<Defect> defects = defectDetailRepository.findAll();
		List<DefectDetailDTO> defectDTOs = new ArrayList<>();
		for(Defect defect : defects){
			defectDTOs.add(DefectDetailDTO.valueOf(defect));
		}
		return defectDTOs;
	}
	
	public boolean closeDefect(Long defectId){
		boolean status = false;
		Defect defect = defectDetailRepository.findById(defectId);
		defect.setStatus(GlobalConstant.CLOSEDSTATUS);
		defect.setChgstatus(GlobalConstant.CLOSEDSTATUS);
		defectDetailRepository.save(defect);
		status = true;
		return status;
	}
	
	public boolean addDefect(DefectDetailDTO defectDetailDTO){
		boolean status = false;
		Defect defect = new Defect();
		defect.setCategory(defectDetailDTO.getDefectCategory());
		defect.setDescription(defectDetailDTO.getDesc());
		defect.setPriority(defectDetailDTO.getPriority());
		defect.setStatus(GlobalConstant.OPENSTATUS);
		defect.setChgstatus(GlobalConstant.CHGSTATUS);
		defectDetailRepository.save(defect);
		return status;
	}
	

}
