package com.data;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.Spittle;

@Component
public class StaticSpittleRepository implements SpittleRepository{

	@Override
	public List<Spittle> findSpittles(long max, int count) {
		List<Spittle> spittleList = new ArrayList<>();
		for(int i=0; i<count && i<max; i++) {
			Spittle spittle = new Spittle(i+1 +"th time Very cold weather here 3:) ", new java.util.Date(), 26.8467, 80.9462);
			spittleList.add(spittle);
		}
		return spittleList;
	}
}
