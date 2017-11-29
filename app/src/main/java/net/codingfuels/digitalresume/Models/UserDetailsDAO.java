package net.codingfuels.digitalresume.Models;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import java.util.List;

/**
 * Created by gowtham on 27/11/17.
 */
@Dao
public interface UserDetailsDAO {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    public void insertData(UserDetailsDTO detailsDTO);

    @Query("SELECT * FROM UserDetailsDTO")
    public List<UserDetailsDTO> fetchAllUserDetails();
}
