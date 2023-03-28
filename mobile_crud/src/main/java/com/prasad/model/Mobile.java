package com.prasad.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Mobile {
	@Id
	private int m_no;
	private String m_name;
	private int rom_size;
	private int ram_size;
	private String os_name;
	private String processor_name;
	private float fcam_size;;
	private String company_name;
	private String imei_num;
	private String comments;
	private int rating;
	public Mobile() {
		super();
	}
	public Mobile(int m_no, String m_name, int rom_size, int ram_size, String os_name, String processor_name,
			float fcam_size, String company_name, String imei_num, String comments, int rating) {
		super();
		this.m_no = m_no;
		this.m_name = m_name;
		this.rom_size = rom_size;
		this.ram_size = ram_size;
		this.os_name = os_name;
		this.processor_name = processor_name;
		this.fcam_size = fcam_size;
		this.company_name = company_name;
		this.imei_num = imei_num;
		this.comments = comments;
		this.rating = rating;
	}
	public int getM_no() {
		return m_no;
	}
	public void setM_no(int m_no) {
		this.m_no = m_no;
	}
	public String getM_name() {
		return m_name;
	}
	public void setM_name(String m_name) {
		this.m_name = m_name;
	}
	public int getRom_size() {
		return rom_size;
	}
	public void setRom_size(int rom_size) {
		this.rom_size = rom_size;
	}
	public int getRam_size() {
		return ram_size;
	}
	public void setRam_size(int ram_size) {
		this.ram_size = ram_size;
	}
	public String getOs_name() {
		return os_name;
	}
	public void setOs_name(String os_name) {
		this.os_name = os_name;
	}
	public String getProcessor_name() {
		return processor_name;
	}
	public void setProcessor_name(String processor_name) {
		this.processor_name = processor_name;
	}
	public float getFcam_size() {
		return fcam_size;
	}
	public void setFcam_size(float fcam_size) {
		this.fcam_size = fcam_size;
	}
	public String getCompany_name() {
		return company_name;
	}
	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}
	public String getImei_num() {
		return imei_num;
	}
	public void setImei_num(String imei_num) {
		this.imei_num = imei_num;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Mobile [m_no=" + m_no + ", m_name=" + m_name + ", rom_size=" + rom_size + ", ram_size=" + ram_size
				+ ", os_name=" + os_name + ", processor_name=" + processor_name + ", fcam_size=" + fcam_size
				+ ", company_name=" + company_name + ", imei_num=" + imei_num + ", comments=" + comments + ", rating="
				+ rating + "]";
	}

	
}
