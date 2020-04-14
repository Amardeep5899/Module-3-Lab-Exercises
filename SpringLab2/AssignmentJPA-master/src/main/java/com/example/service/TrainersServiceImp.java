package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Dao.TrainerDao;
import com.example.entity.Trainers;

@Service
public class TrainersServiceImp implements TrainersService {
	
	@Autowired
	TrainerDao tdo;

	@Override
	public Trainers findById(int id) {
		// TODO Auto-generated method stub
		return tdo.findById(id);
	}

	@Override
	public Trainers save(Trainers t) {
		Trainers t1=null;
		if(tdo.create(t).equals("data inserted"))
		{
			return t;
		}
		return t1;
		
	}

	@Override
	public List<Trainers> findAll() {
		// TODO Auto-generated method stub
		return tdo.reterive();
	}

	@Override
	public boolean existsById(int id) {
		
		return tdo.findID(id);
	}

	@Override
	public void deleteById(int id) {
		tdo.delete(id);
		
	}

	@Override
	public void updateData(Trainers t) {
		tdo.update(t);
		
	}
	

}
