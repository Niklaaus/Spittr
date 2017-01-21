package com.data;

import com.Spitter;

public interface SpitterRepository {
	public Spitter save(Spitter spitter);
	public Spitter findSpitter(String username);
}
