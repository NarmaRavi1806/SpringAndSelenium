package com.cg.equipment.equipmentTrackingService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.equipment.bean.EquipmentRecord;
import com.cg.equipment.equipmentTrackingException.TrackingException;
import com.cg.equipment.equipmentTrackingRepo.EquipmentRecordRepo;

@Service
public class EquipementTrackingServiceImpl implements IEquipmentTrackingService {

	@Autowired
	private EquipmentRecordRepo repo;
	
	@Override
	public EquipmentRecord addEquipmentRecord(EquipmentRecord record) throws TrackingException {
		repo.save(record);
		return record;
	}

	@Override
	public EquipmentRecord findByEquipmentTag(String equipmentTag) throws TrackingException {
		
		return repo.findByEquipmentTag(equipmentTag);
	}
	
	

}
