package com.example.Controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Trainers;
import com.example.service.TrainersService;

@RestController
@RequestMapping("/traniees")
public class TrainersController {

	@Autowired
	private TrainersService ts;
	
	@PostMapping("/traniee") //insert the data to database
	public ResponseEntity<Trainers> saveBook(@RequestBody Trainers t) {
		Trainers tk=ts.save(t);
		
		return new ResponseEntity<Trainers>(tk,HttpStatus.NO_CONTENT);
	}
	
	
	@PutMapping("/updateTraniee/{TarnieeId}")
	public ResponseEntity<Trainers> updateBook(@PathVariable("TranieeId") int id,@RequestBody Trainers t)
	{
		

	    if (ts.existsById(id)==false)
		{
	    	 return new ResponseEntity<Trainers>(HttpStatus.NOT_FOUND);

		}
	   ts.updateData(t);
	   
	    return new ResponseEntity<Trainers>(t,HttpStatus.OK);	
	}
	
	@GetMapping("/getTraniee/{TranieeId}")
    public ResponseEntity<Trainers> getTranieeId
              (@PathVariable("TranieeId") int id) {
		
		if(ts.existsById(id)) {
			Trainers bk = ts.findById(id);
			return new ResponseEntity<Trainers>(bk,HttpStatus.OK);
		}
		return new ResponseEntity<Trainers>(HttpStatus.NOT_FOUND);
	}
	@DeleteMapping("/deleteTraniee/{tranieeId}")
    public ResponseEntity<Trainers> deleteTranieeId
              (@PathVariable("bookId") int id) {
		if(ts.existsById(id))
		{
			ts.deleteById(id);
		return new ResponseEntity<Trainers>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<Trainers>(HttpStatus.NOT_FOUND);
	}
	@GetMapping("/gettranieeDetails")
    public ResponseEntity<List<Trainers>> getAllTranieeDetails() {
			List<Trainers> tranieeList = ts.findAll();
			return new ResponseEntity<List<Trainers>>(tranieeList,
					HttpStatus.OK);
	}
	
}
