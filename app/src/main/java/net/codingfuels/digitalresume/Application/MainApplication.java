package net.codingfuels.digitalresume.Application;

import android.app.Application;
import android.arch.persistence.room.Room;

import net.codingfuels.digitalresume.Models.AppDatabase;

/**
 * Created by gowtham on 27/11/17.
 */

public class MainApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        AppDatabase db = Room.databaseBuilder(this,
                AppDatabase.class,"appDB").build();

    }
}
