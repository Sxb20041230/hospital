package com.oracle.pojo;

public class ProfessionalTitles {
    private  Integer professionalTitleId;
    private String professionalTitleName;
    private String professionalTitleDesc;

    public ProfessionalTitles(Integer professionalTitleId, String professionalTitleName, String professionalTitleDesc) {
        this.professionalTitleId = professionalTitleId;
        this.professionalTitleName = professionalTitleName;
        this.professionalTitleDesc = professionalTitleDesc;
    }
    public  ProfessionalTitles() {}

    public Integer getProfessionalTitleId() {
        return professionalTitleId;
    }

    public void setProfessionalTitleId(Integer professionalTitleId) {
        this.professionalTitleId = professionalTitleId;
    }

    public String getProfessionalTitleName() {
        return professionalTitleName;
    }

    public void setProfessionalTitleName(String professionalTitleName) {
        this.professionalTitleName = professionalTitleName;
    }

    public String getProfessionalTitleDesc() {
        return professionalTitleDesc;
    }

    public void setProfessionalTitleDesc(String professionalTitleDesc) {
        this.professionalTitleDesc = professionalTitleDesc;
    }

    @Override
    public String toString() {
        return "ProfessionalTitles{" +
                "professionalTitleId=" + professionalTitleId +
                ", professionalTitleName='" + professionalTitleName + '\'' +
                ", professionalTitleDesc='" + professionalTitleDesc + '\'' +
                '}';
    }
}
