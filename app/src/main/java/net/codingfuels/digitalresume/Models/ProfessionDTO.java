package net.codingfuels.digitalresume.Models;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

/**
 * Created by gowtham on 27/11/17.
 */
@Entity(foreignKeys = @ForeignKey(entity = UserDetailsDTO.class,parentColumns = "name",childColumns = "userName"))
public class ProfessionDTO {
    @PrimaryKey
    @NonNull
    private String userName;
    private String companyName;
    private String position;
    private String joiningDay;
    private String lastDay;
    private String achivements;
    private String references;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getJoiningDay() {
        return joiningDay;
    }

    public void setJoiningDay(String joiningDay) {
        this.joiningDay = joiningDay;
    }

    public String getLastDay() {
        return lastDay;
    }

    public void setLastDay(String lastDay) {
        this.lastDay = lastDay;
    }

    public String getAchivements() {
        return achivements;
    }

    public void setAchivements(String achivements) {
        this.achivements = achivements;
    }

    public String getReferences() {
        return references;
    }

    public void setReferences(String references) {
        this.references = references;
    }
}
