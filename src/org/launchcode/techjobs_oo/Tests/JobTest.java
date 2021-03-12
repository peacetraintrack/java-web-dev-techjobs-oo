package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {
	private Job test_job;
	private Job myJob, job1, job2, job3;

	private int id;
	private String name;
	private Employer employer;
	private Location location;
	private PositionType positionType;
	private CoreCompetency coreCompetency;



	@Before
	public void CreateJobObject(){
		test_job = new Job();
		myJob = new Job();
		job1 =  new Job("Product tester", new Employer("Acme"), new Location("Desert"),
				new PositionType("Quality control"), new CoreCompetency("Persistence"));

		job2 =  new Job("Product tester", new Employer("Acme"), new Location("Desert"),
				new PositionType("Quality control"), new CoreCompetency("Persistence"));

		job3 =  new Job("", new Employer(""), new Location(""),
				new PositionType(""), new CoreCompetency(""));
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
	public void testJobsForEquality() {
		assertFalse(job1.equals(job2));
	}
/*When passed a Job object, it should return a string that contains a blank line before and after the job information.

The string should contain a label for each field, followed by the data stored in that field.
Each field should be on its own line.
 */
	@Test
	public void toStringTest(){
		assertTrue(job1.toString().startsWith("\n"));
		assertTrue(job1.toString().endsWith("\n"));

	}

	@Test
	public void stringHasLabelForEachField() {
		assertEquals(job1.toString(), '\n' +
		 "ID:" + job1.getId() + '\n' +
		"Name: " + job1.getName() + '\n' +
		"Employer: " + job1.getEmployer() + '\n' +
		"Location: " + job1.getLocation() + '\n' +
		"Position Type: " + job1.getPositionType() + '\n' +
		"Core Competency: " + job1.getCoreCompetency() + '\n');

	}

	//If a field is empty, the method should add, “Data not available” after the label.


	@Test
	public void isFieldEmpty() {
		String display = "\n" + "ID: " + job3.getId() + "\n"+
				                 "Name: " + "Data not available" + "\n" +
				                 "Employer: " + "Data not available" + "\n" +
				                 "Location: " + "Data not available" + "\n" +
				                 "Position Type: " + "Data not available" + "\n" +
				                 "Core Competency: " + "Data not available" + "\n"
				;
		assertEquals(display, job3.toString());
	}

}
