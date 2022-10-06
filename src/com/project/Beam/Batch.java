package com.project.Beam;

public class Batch {

    private int batchId;
    private int batchCurrStud;
    private int batchCapacity;
    private String batchName;
    private String batchCourse;

    public Batch() {
    }

    public Batch(int batchId, int batchCurrStud, int batchCapacity, String batchName, String batchCourse) {
        this.batchId = batchId;
        this.batchCurrStud = batchCurrStud;
        this.batchCapacity = batchCapacity;
        this.batchName = batchName;
        this.batchCourse = batchCourse;
    }

    public int getBatchId() {
        return batchId;
    }

    public void setBatchId(int batchId) {
        this.batchId = batchId;
    }

    public int getBatchCurrStud() {
        return batchCurrStud;
    }

    public void setBatchCurrStud(int batchCurrStud) {
        this.batchCurrStud = batchCurrStud;
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
