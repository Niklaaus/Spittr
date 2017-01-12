package com.data;

import java.util.List;

import com.Spittle;

public interface SpittleRepository {
	List<Spittle> findSpittles(long max, int count);
}
