package com.prasad.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.prasad.model.Mobile;
import com.prasad.repository.MobileRepo;

@RestController
public class MobileController {

	@Autowired
	public MobileRepo mrepo;
	
	@PostMapping("/savemobile")
	public Mobile saveMobile(@RequestBody Mobile mobile) {
		Mobile b =mrepo.save(mobile);
		return b;
	}
	
	@GetMapping("/get/{m_no}")
	public Mobile getMobile(@PathVariable int m_no) {
		Mobile m = mrepo.findById(m_no).get();
		return m;
	}
	@GetMapping("/getall")
	public List<Mobile> getAll() {
		List<Mobile> list = mrepo.findAll();
		return list;
	}
	@DeleteMapping("/delete/{m_no}")
	public void deleteMobile(@PathVariable Integer m_no) {
		
		mrepo.deleteById(m_no);
	}
	@PutMapping("/update/{m_no}")
	public Mobile updateMobile(@RequestBody Mobile mobile, @PathVariable int m_no) {
		Mobile mob = mrepo.findById(m_no).get();
		mob.setM_no(m_no);
		mob.setM_name(mobile.getM_name());
		mob.setRom_size(mobile.getRom_size());
		mob.setRam_size(mobile.getRam_size());
		mob.setOs_name(mobile.getOs_name());
		mob.setProcessor_name(mobile.getProcessor_name());
		mob.setFcam_size(mobile.getFcam_size());
		mob.setCompany_name(mobile.getCompany_name());
		mob.setImei_num(mobile.getImei_num());
		mob.setComments(mobile.getComments());
		mob.setRating(mobile.getRating());
		
		Mobile bob =mrepo.save(mob);
	
		return bob;
		
		
		
	}
}
