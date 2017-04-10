package com.videogame.whohastalent;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PerformerTest {

	Performer performer;
	
	@Before
	public void setup() {
		performer = new Performer();
	}

	@Test
	public void TestGoodPerform() {
		assertEquals("",performer.perform());
	}

}
