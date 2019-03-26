package com.capgemini.inheritance.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.capgemini.inheritance.model.CorporateTraining;
import com.capgemini.inheritance.model.PublicTraining;
import com.capgemini.inheritance.model.Training;

public class TrainingTest {

	@Test
	public void getOrderValueForPublicTraining() {
		Training t = new PublicTraining(101, "Java", 2000, 5);
		assertEquals(10000, t.getOrderValue(), 0.01);
	}

	@Test
	public void getOrderValueForCorporateTraining() {
		Training s = new CorporateTraining(102, "Python", 4000, 6);
		assertEquals(24000, s.getOrderValue(), 0.01);
		assertNotNull(s);

	}

	@Test
	public void checkPublicTrainingObjectNullOrNot() {
		Training t = new PublicTraining(101, "Java", 2000, 5);
		assertNotNull(t);

	}

	@Test
	public void checkCorporateTrainingObjectNullOrNot() {
		Training s = new CorporateTraining(102, "Python", 4000, 6);
		assertNotNull(s);

	}

}
