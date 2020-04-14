package com.example.service;



import java.util.List;

import com.example.entity.Trainers;

public interface TrainersService {
	public Trainers findById(int id);
	public Trainers save(Trainers t);
	public List<Trainers> findAll();
	public boolean existsById(int id);
	public void deleteById(int id);
	public void updateData(Trainers t);
}
