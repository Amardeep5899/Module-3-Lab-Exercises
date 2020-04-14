package com.example.Dao;

import java.util.List;


import com.example.entity.Trainers;

public interface TrainerDao {
	public String create(Trainers t);

	public List<Trainers> reterive();

	public Trainers findById(int id);

	public void delete(int id);

	public void update(Trainers t);
	public boolean findID(int id);
}
