package com.data;

import java.util.List;

import org.springframework.stereotype.Component;

import com.Spittle;

@Component
public interface SpittleRepository {
	List<Spittle> findSpittles(long max, int count);
	Spittle findOne(int spittleId);
}
