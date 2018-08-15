package com.infy.defecttracker.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.infy.defecttracker.dto.DefectDetailDTO;
import com.infy.defecttracker.service.DefectDetailService;

@RestController
public class DefectTrackerController {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	DefectDetailService defctDetailService;
	
	@GetMapping("/defects/getAllDefects")
	List<DefectDetailDTO> getDefectDetails(){
		logger.info("getAllDefects service called.");
		return defctDetailService.getDefectDetails();
	}
	@PutMapping("/defects/updateDefect/{defectId}")
	public String closeDefect(@PathVariable long defectId){
		defctDetailService.closeDefect(defectId);
		return "sucess";
	}
	
	@PostMapping("/defects/addDefect")
	public String addDefect(@RequestBody DefectDetailDTO defectDetailDTO){
		defctDetailService.addDefect(defectDetailDTO);
		return "sucess";
	}

}
