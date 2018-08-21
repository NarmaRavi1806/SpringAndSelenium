package com.cg.equipment.equipmentTrackingRepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cg.equipment.bean.EquipmentRecord;
import com.cg.equipment.equipmentTrackingException.TrackingException;
@Repository
public interface EquipmentRecordRepo extends JpaRepository<EquipmentRecord, String>{
	
	@Query("SELECT E FROM EquipmentRecord E WHERE E.equipmentTag=: equipmentTag")
	public EquipmentRecord findByEquipmentTag(@Param(value="equipmentTag") String equipmentTag) throws TrackingException;

}
