package com.WebApplication.Web.Service;

import java.util.List;

import com.WebApplication.Web.model.Reg_Form;

public interface IReg_FoemService {

	Integer saveReg_Form(Reg_Form savereg);
	
	void updateReg_From(Reg_Form upreg);
	
	void deleteReg_Form(Integer id);
	
	Reg_Form getOneFromReg_Form(Integer  id);
	
	List<Reg_Form> getAllFromReg_Form();
	
	

}
