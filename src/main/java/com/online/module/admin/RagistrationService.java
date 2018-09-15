package com.online.module.admin;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.online.module.bean.CityAreaVO;
import com.online.module.bean.CityVO;
import com.online.module.bean.RagistrationVO;

@Service
public class RagistrationService {
	private final Logger log = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private RagistrationDAO dao;

	public Boolean registerCustomer(RagistrationVO vo) {
		int result = dao.register(vo);
		Boolean flag = false;
		if (result == 1) {
			int id = dao.getGeneted(vo.getEmail());
			if (id > 1) {
				int waletStatus = dao.createWallet(id);
				if (waletStatus == 1)
					flag = true;
			}
		} else
			flag = false;
		return flag;
	}
	public List<CityVO> getAllCityRecord(){
      return dao.getAllCity();		
	}
	public List<CityAreaVO> getAllArea(int id){
		return dao.getAllArea(id);
		
	}
	
}
