package net.codingfuels.digitalresume.Models;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

/**
 * Created by gowtham on 27/11/17.
 */
@Entity(foreignKeys = @ForeignKey(entity = UserDetailsDTO.class,parentColumns = "name",childColumns = "userName"))
public class ProjectDTO {
    @PrimaryKey
    @NonNull
    private String userName;
    private String projectName;
    private String client;
    private String position;
    private String tecnologiesUsed;
    private String desc;
    private String role;
    private String appLink;
    private String duration;
    private String teamSize;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getTecnologiesUsed() {
        return tecnologiesUsed;
    }

    public void setTecnologiesUsed(String tecnologiesUsed) {
        this.tecnologiesUsed = tecnologiesUsed;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getAppLink() {
        return appLink;
    }

    public void setAppLink(String appLink) {
        this.appLink = appLink;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(String teamSize) {
        this.teamSize = teamSize;
    }
}
