package com.data;

import org.springframework.stereotype.Component;

import com.Spitter;

@Component
public class StaticSpitterRepository implements SpitterRepository {

	@Override
	public Spitter save(Spitter spitter) {
		return spitter;
	}

	@Override
	public Spitter findSpitter(String username) {
		Spitter spitter = new Spitter(username, "aATy89p", "Kumar", "Yashwant", "k.y@mail.com");
		return spitter;
	}

}
