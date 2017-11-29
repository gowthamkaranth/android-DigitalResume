package net.codingfuels.digitalresume.Models;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

/**
 * Created by gowtham on 27/11/17.
 */

@Database(entities = {UserDetailsDTO.class,EducationDTO.class,ProfessionDTO.class,ProjectDTO.class},version = 1)
public abstract class AppDatabase extends RoomDatabase{
    public abstract UserDetailsDAO userDetailsDAO();
    public abstract EducationDAO educationDAO();
    public abstract ProfessionDAO professionDAO();
    public abstract ProjectDAO projectDAO();
}
