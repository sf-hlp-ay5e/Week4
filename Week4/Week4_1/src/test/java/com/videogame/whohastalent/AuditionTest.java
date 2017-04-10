package com.videogame.whohastalent;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;


public class AuditionTest {
	
	Audition audition;

	@Before
	public void setUp() {
		audition = new Audition();
	}
	
	@Test
	public void test() {
		assertEquals(7,audition.performerList.size());
	}

}
