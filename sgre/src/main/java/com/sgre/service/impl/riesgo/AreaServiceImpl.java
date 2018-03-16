package com.sgre.service.impl.riesgo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.sgre.dao.riesgo.AreaRepository;
import com.sgre.model.riesgo.Area;
import com.sgre.service.riesgo.AreaService;

public class AreaServiceImpl implements AreaService {

	@Autowired
	private AreaRepository repository;
	
	@Override
	@Transactional
	public List<Area> listarAreas() {
		Iterable<Area> areas = repository.findAll();
		return (List<Area>) areas;
	}

}
