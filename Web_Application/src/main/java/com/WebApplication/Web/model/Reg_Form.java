package com.WebApplication.Web.model;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;





@Data
@Entity
@Table(name="Admission_Form")
public class Reg_Form {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	@Column(name="Student_Roll_Number")
	private Integer sid;
	
	@Column(name="Student_Name")	
	private String sname;

	@Column(name="Student_Email_Id")
	private String semailId;
	
	@Column(name="Student_Father_Name")
	private String fname;
	
	@Column(name="Student_Mother_Name")
	private String mname;
	
	@Column(name="Student_Address")
	private String saddress;
	
	@Column(name="Student_Moile Number")
	private String smob_number;
	
	
	
	

}
