package com.online.module.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.online.module.bean.CityAreaVO;
import com.online.module.bean.CityVO;
import com.online.module.bean.RagistrationVO;

@RestController
public class RagistrationController {
	@Autowired
	private RagistrationService service;

	@RequestMapping(value = "mvc/onlineRegister", method = org.springframework.web.bind.annotation.RequestMethod.POST)
	public Boolean insert(@RequestBody RagistrationVO bean) {
		return service.registerCustomer(bean);
	}
	@RequestMapping(value="mvc/getAllCity",method=RequestMethod.GET)
	public  @ResponseBody List<CityVO> getAllCity(){
		 return  service.getAllCityRecord();
	}
	
	@RequestMapping(value="mvc/getAllArea" , method=RequestMethod.GET)
	public @ResponseBody List<CityAreaVO> getAllAreaRecord(@RequestParam("areaId") int id){
		return service.getAllArea(id);
	}
}
