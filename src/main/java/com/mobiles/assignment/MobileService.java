package com.mobiles.assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MobileService {
	@Autowired
	private MobileDAORepository MobileDAORepository;
	
	public List<Mobile> getMobiles(){
		List<Mobile> mobileList = new ArrayList<Mobile>();
		MobileDAORepository.findAll().forEach(mobileList::add);
		return mobileList;

	}
	
	public Optional<Mobile> getMobile(String id) {
		return MobileDAORepository.findById(id);
	}
	
	public void updateMobile(String name, Mobile Mobile) {
		MobileDAORepository.save(Mobile);
	}

	public void deleteMobile(String id) {
		MobileDAORepository.deleteById(id);
	}

	
	public void addMobile(Mobile Mobile) {
		MobileDAORepository.save(Mobile);
	}

}
