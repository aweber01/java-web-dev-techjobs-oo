package org.launchcode.techjobs_oo.Tests;

import org.junit.Test;
import static org.junit.Assert.*;

import org.launchcode.techjobs_oo.*;

public class JobTest {

    @Test
    public void testSettingJobId(){
        Job testJob1 = new Job();
        Job testJob2 = new Job();
        assertTrue((testJob2.getId() - testJob1.getId()) == 1);
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job testJob3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertEquals("Product tester", testJob3.getName());
        assertEquals("ACME", testJob3.getEmployer().getValue());
        assertEquals("Desert", testJob3.getLocation().getValue());
        assertEquals("Quality control", testJob3.getPositionType().getValue());
        assertEquals("Persistence", testJob3.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality(){
        Job testJob4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job testJob5 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertFalse(testJob4.equals(testJob5));
    }

    @Test
    public void testToString(){
        Job testJob6 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertEquals("ID: " + testJob6.getId() + "\n Name: " + testJob6.getName() + "\n Employer: " + testJob6.getEmployer() + "\n Location: " + testJob6.getLocation() + "\n Position Type: " + testJob6.getPositionType() + "\n Core Competency: " + testJob6.getCoreCompetency(), testJob6.toString());

        Job testJob7 = new Job("Product tester", new Employer(""), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertEquals("ID: " + testJob7.getId() + "\n Name: " + testJob7.getName() + "\n Employer: Data Not Available" + testJob7.getEmployer() + "\n Location: " + testJob7.getLocation() + "\n Position Type: " + testJob7.getPositionType() + "\n Core Competency: " + testJob7.getCoreCompetency(), testJob7.toString());
    }


}
