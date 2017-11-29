package net.codingfuels.digitalresume.Models;

import android.arch.persistence.room.Embedded;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

import java.util.List;

/**
 * Created by gowtham on 27/11/17.
 */
@Entity
public class UserDetailsDTO {
    public UserDetailsDTO(){

    }
    @PrimaryKey
    @NonNull
    private String name;
    private String objective;
    private String profile;
    private String skills;
 //   private List<String> languages;
    private String interests;
    private String personalSnippets;
    private String referenceString;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getObjective() {
        return objective;
    }

    public void setObjective(String objective) {
        this.objective = objective;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

//    public List<String> getLanguages() {
//        return languages;
//    }
//
//    public void setLanguages(List<String> languages) {
//        this.languages = languages;
//    }

    public String getInterests() {
        return interests;
    }

    public void setInterests(String interests) {
        this.interests = interests;
    }

    public String getPersonalSnippets() {
        return personalSnippets;
    }

    public void setPersonalSnippets(String personalSnippets) {
        this.personalSnippets = personalSnippets;
    }

    public String getReferenceString() {
        return referenceString;
    }

    public void setReferenceString(String referenceString) {
        this.referenceString = referenceString;
    }

//    public List<EducationDTO> getEducation() {
//        return education;
//    }
//
//    public void setEducation(List<EducationDTO> education) {
//        this.education = education;
//    }
//
//    public List<ProfessionDTO> getProfessionalExps() {
//        return professionalExps;
//    }
//
//    public void setProfessionalExps(List<ProfessionDTO> professionalExps) {
//        this.professionalExps = professionalExps;
//    }
//
//    public List<ProjectDTO> getProjectDetails() {
//        return projectDetails;
//    }
//
//    public void setProjectDetails(List<ProjectDTO> projectDetails) {
//        this.projectDetails = projectDetails;
//    }
}
