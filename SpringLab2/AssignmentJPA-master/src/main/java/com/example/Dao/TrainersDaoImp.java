package com.example.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;
import com.example.entity.Trainers;

@Transactional
@Repository
public class TrainersDaoImp implements TrainerDao {
	
	@PersistenceContext
	EntityManager em;

	@Override
	public String create(Trainers t) {
		// TODO Auto-generated method stub
		em.persist(t);//this object will make a reference in database table
		              //(add the data of traniee in database using the object )
		return "data inserted";
	}

	@Override
	public List<Trainers> reterive() {
		// TODO Auto-generated method stub
		String Qstr="SELECT traniee FROM Traniee traniee";
		TypedQuery<Trainers> query=em.createQuery(Qstr,Trainers.class);
		return query.getResultList();
		
	}

	@Override
	public Trainers findById(int id) {
		// TODO Auto-generated method stub
		return em.find(Trainers.class, id);
	}
	public boolean findID(int id)
	{
		if(em.contains(em.find(Trainers.class, id)))
		{
			return true;
		}
		return false;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
		Trainers t=em.find(Trainers.class, id);//this method will which id to remove
		
		System.out.println(t.getId() +" "+t.getName()+ " "+t.getCity()+" is removed");
		
		em.remove(t);//this is object from the database
		
		
	}

	@Override
	public void update(Trainers t) {
		// TODO Auto-generated method stub
		  Trainers tranieeUpdate= em.find(Trainers.class, t.getId());		
	      tranieeUpdate.setCity(t.getCity());
	      tranieeUpdate.setName(t.getName());
	      
	      System.out.println("update ");
		
	}

	

}
