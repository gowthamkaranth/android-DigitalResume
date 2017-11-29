package net.codingfuels.digitalresume.Models;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import java.util.List;

/**
 * Created by gowtham on 29/11/17.
 */
@Dao
public interface ProjectDAO {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    public void insertData(ProjectDTO projectDTO);

    @Query("SELECT * FROM ProjectDTO WHERE userName IS :userName")
    public List<ProjectDTO> getEducationDetails(String userName);
}
