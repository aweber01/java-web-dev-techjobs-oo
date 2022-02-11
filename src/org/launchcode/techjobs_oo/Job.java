package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public String toString() {
        String nameString, employerString, locationString, positionString, competencyString;

        if(!name.isEmpty()) {
            nameString = name;
        } else {
            nameString = "Data Not Available";
        }

        if(!employer.toString().equals("")) {
            employerString = employer.toString();
        } else {
            employerString = "Data Not Available";
        }

        if(!location.toString().equals("")) {
            locationString = location.toString();
        } else {
            locationString = "Data Not Available";
        }

        if(!positionType.toString().equals("")) {
            positionString = positionType.toString();
        } else {
            positionString = "Data Not Available";
        }

        if(!coreCompetency.toString().equals("")) {
            competencyString = coreCompetency.toString();
        } else {
            competencyString = "Data Not Available";
        }

        return " ID: " + id + "\n Name: " + nameString + "\n Employer: " + employerString + "\n Location: " + locationString + "\n Position Type: " + positionString + "\n Core Competency: " + competencyString + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
