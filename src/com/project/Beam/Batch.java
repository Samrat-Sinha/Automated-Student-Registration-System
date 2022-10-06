package com.project.Beam;

public class Batch {

    private String batchId;
    private String batchName;
    private String batchCourse;
    private int batchCapacity;

    public Batch() {
    }

    public Batch(String batchId, int batchCapacity, String batchName, String batchCourse) {
        this.batchId = batchId;
        this.batchName = batchName;
        this.batchCourse = batchCourse;
        this.batchCapacity = batchCapacity;
    }

    public String getBatchId() {
        return batchId;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    public int getBatchCapacity() {
        return batchCapacity;
    }

    public void setBatchCapacity(int batchCapacity) {
        this.batchCapacity = batchCapacity;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public String getBatchCourse() {
        return batchCourse;
    }

    public void setBatchCourse(String batchCourse) {
        this.batchCourse = batchCourse;
    }
}
