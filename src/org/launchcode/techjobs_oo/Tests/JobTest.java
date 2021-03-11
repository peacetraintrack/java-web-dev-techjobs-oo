package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class JobTest {
	Job test_job;
	Job myJob, job1, job2;


	@Before
	public void CreateJobObject(){
		test_job = new Job();
		myJob = new Job();
		job1 =  new Job("Product tester", new Employer("Acme"), new Location("Desert"),
				new PositionType("Quality control"), new CoreCompetency("Persistence"));

		job2 =  new Job("Product tester", new Employer("Acme"), new Location("Desert"),
				new PositionType("Quality control"), new CoreCompetency("Persistence"));
	}

	@Test
	public void emptyTest() {
		assertEquals(10,10,.001);
	}


	@Test
	public void testSettingJobId() {

		assertEquals(1 , myJob.getId() - test_job.getId());

	}

	@Test
	public void testJobConstructorSetsAllFields() {
		 assertTrue(job1 instanceof Job);
		 assertEquals("Product tester", job1.getName());
		 assertEquals("Acme", job1.getEmployer().toString());
		 assertEquals("Desert", job1.getLocation().toString());
		 assertEquals("Quality control", job1.getPositionType().toString());
		 assertEquals("Persistence", job1.getCoreCompetency().toString());
	}

	@Test
	public void testJobsForEquality(){
		assertEquals(job1.getId(), job2.getId());

	}






//	public Job(String name, Employer employer, Location location, PositionType positionType,
//	           CoreCompetency coreCompetency) {
//		this();


}
