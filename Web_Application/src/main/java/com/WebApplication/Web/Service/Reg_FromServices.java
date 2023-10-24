package com.WebApplication.Web.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.WebApplication.Web.Repo.Reg_Repositery;
import com.WebApplication.Web.model.Reg_Form;

@Service
public class Reg_FromServices implements IReg_FoemService {

	@Autowired
	private Reg_Repositery repo;

	@Override
	public Integer saveReg_Form(Reg_Form savereg) {

		return repo.save(savereg).getSid();
	}

	@Override
	public void updateReg_From(Reg_Form upreg) {

		repo.save(upreg);
	}

	@Transactional
	@Override
	public void deleteReg_Form(Integer id) {

		repo.deleteById(id);
	}

	@Override
	public Reg_Form getOneFromReg_Form(Integer id) {

		Optional<Reg_Form> op = repo.findById(id);
		
		if (op.isPresent()) {

			return op.get();
		}
		return null;
	}

	@Override
	public List<Reg_Form> getAllFromReg_Form() {

		List<Reg_Form> list =repo.findAll();
				return list;
	}

}
