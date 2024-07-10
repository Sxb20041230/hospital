package com.oracle.pojo;

public class Doctor {
    private int doctorId;
    private String doctorName;
    private String doctorPassword;
    private int job_number;
    private int doctorPhone;
    private String doctorEmail;
    private String doctorIntroduction;
    private int departmentId;
    private int professionId;

    public Doctor(int doctorId, String doctorName, String doctorPassword, int job_number, int doctorPhone, String doctorEmail, String doctorIntroduction, int departmentId, int professionId) {
        this.doctorId = doctorId;
        this.doctorName = doctorName;
        this.doctorPassword = doctorPassword;
        this.job_number = job_number;
        this.doctorPhone = doctorPhone;
        this.doctorEmail = doctorEmail;
        this.doctorIntroduction = doctorIntroduction;
        this.departmentId = departmentId;
        this.professionId = professionId;
    }

    public Doctor(){}

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getDoctorPassword() {
        return doctorPassword;
    }

    public void setDoctorPassword(String doctorPassword) {
        this.doctorPassword = doctorPassword;
    }

    public int getJob_number() {
        return job_number;
    }

    public void setJob_number(int job_number) {
        this.job_number = job_number;
    }

    public int getDoctorPhone() {
        return doctorPhone;
    }

    public void setDoctorPhone(int doctorPhone) {
        this.doctorPhone = doctorPhone;
    }

    public String getDoctorEmail() {
        return doctorEmail;
    }

    public void setDoctorEmail(String doctorEmail) {
        this.doctorEmail = doctorEmail;
    }

    public String getDoctorIntroduction() {
        return doctorIntroduction;
    }

    public void setDoctorIntroduction(String doctorIntroduction) {
        this.doctorIntroduction = doctorIntroduction;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public int getProfessionId() {
        return professionId;
    }

    public void setProfessionId(int professionId) {
        this.professionId = professionId;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "job_number=" + job_number +
                ", doctorId=" + doctorId +
                ", doctorName='" + doctorName + '\'' +
                ", doctorPassword='" + doctorPassword + '\'' +
                ", doctorPhone=" + doctorPhone +
                ", doctorEmail='" + doctorEmail + '\'' +
                ", doctorIntroduction='" + doctorIntroduction + '\'' +
                ", departmentId=" + departmentId +
                ", professionId=" + professionId +
                '}';
    }
}
