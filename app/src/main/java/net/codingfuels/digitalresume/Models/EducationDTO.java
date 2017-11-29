package net.codingfuels.digitalresume.Models;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

/**
 * Created by gowtham on 27/11/17.
 */
@Entity(foreignKeys = @ForeignKey(entity = UserDetailsDTO.class, parentColumns = "name", childColumns = "userName"))
public class EducationDTO {
    @PrimaryKey
    @NonNull
    private String userName;
    private String nameOfEducation;
    private String passingYear;
    private String major;
    private String boardName;
    private String percentage;

    public EducationDTO() {

    }

    public String getNameOfEducation() {
        return nameOfEducation;
    }

    public void setNameOfEducation(String nameOfEducation) {
        this.nameOfEducation = nameOfEducation;
    }

    public String getPassingYear() {
        return passingYear;
    }

    public void setPassingYear(String passingYear) {
        this.passingYear = passingYear;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getBoardName() {
        return boardName;
    }

    public void setBoardName(String boardName) {
        this.boardName = boardName;
    }

    public String getPercentage() {
        return percentage;
    }

    public void setPercentage(String percentage) {
        this.percentage = percentage;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
