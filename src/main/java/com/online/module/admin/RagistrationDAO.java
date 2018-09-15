package com.online.module.admin;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.online.module.bean.CityAreaVO;
import com.online.module.bean.CityVO;
import com.online.module.bean.RagistrationVO;
import com.online.module.utils.SQLUtils;

@Repository
public class RagistrationDAO {
	private final Logger log = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private JdbcTemplate jt;

	public int register(RagistrationVO vo) {
		return jt.update(SQLUtils.REGISTER_USER, vo.getCurrentTime(), vo.getDob(), vo.getEmail(), vo.getfName(),
				vo.getGender(), vo.getlName(), vo.getMobileNumber(), vo.getPass(), vo.getRoll(), vo.getCityId());
	}

	public Integer getGeneted(String email) {
		List<Integer> integers = null;
		try {
			integers = jt.query("select id from user_info where email=?", (ResultSet rs) -> {
				List<Integer> wList = new ArrayList<>();
				while (rs.next()) {
					wList.add(rs.getInt("id"));
				}
				return wList;
			}, email);
		} catch (Exception e) {
			log.error("An Error Occured Get Key ", e);
			throw e;
		}
		if (integers.size() == 1) {
			return integers.get(0);
		} else
			return null;

	}

	public int createWallet(int id) {
		try {
			return jt.update(SQLUtils.CREATE_USER_WOLET, 10000, id);
		} catch (Exception e) {
			log.error("An Error In wallet ");
			throw e;
		}
	}

	public List<CityVO> getAllCity() {
		List<CityVO> cityVOs = null;
		try {
			cityVOs = jt.query(SQLUtils.SELECT_USER_CITY, (ResultSet rs) -> {
				List<CityVO> list = new ArrayList<>();
				while (rs.next()) {
					CityVO vo = new CityVO();
					vo.setCityId(rs.getInt("city_id"));
					vo.setCityName(rs.getString("city_name"));
					list.add(vo);
					System.out.println(list);
				}
				return list;
			});
		} catch (Exception e) {
			System.out.println("exception i" + e);
		}
		System.out.println(cityVOs);
		return cityVOs;
	}

	public List<CityAreaVO> getAllArea(int cityId) {
		try {
			List<CityAreaVO> listArea = jt.query(SQLUtils.SLECT_CITY_AREA, (ResultSet rs) -> {
				List<CityAreaVO> list = new ArrayList<CityAreaVO>();
				while (rs.next()) {
					CityAreaVO areaVo = new CityAreaVO();
					areaVo.setAreaId(rs.getInt("area_id"));
					areaVo.setAreaName(rs.getString("area_name"));
					list.add(areaVo);
				}
				return list;
			}, cityId);

			return listArea;

		} catch (Exception e) {
			throw e;
			// TODO: handle exception
		}
	}

}
