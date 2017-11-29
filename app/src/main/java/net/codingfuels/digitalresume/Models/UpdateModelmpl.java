package net.codingfuels.digitalresume.Models;

import android.arch.persistence.room.Room;
import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;

import java.util.List;

/**
 * Created by gowtham on 29/11/17.
 */

public class UpdateModelmpl implements UpdateModel {
    private UserDetailsDTO userDetailsDTO;
    private UserDetailsDAO userDetailsDAO;

    private EducationDAO educationDAO;
    private EducationDTO educationDTO;

    private  ProfessionDAO professionDAO;
    private  ProfessionDTO professionDTO;

    private ProjectDAO projectDAO;
    private ProjectDTO projectDTO;
    private AppDatabase appDb;
    private Context context;

    public UpdateModelmpl(Context context) {
        this.context = context;
    }

    @Override
    public void saveData(UserDetailsDTO userDetailsDTO,EducationDTO educationDTO,ProjectDTO projectDTO,ProfessionDTO professionDTO) {
        this.userDetailsDTO = userDetailsDTO;
        this.educationDTO=educationDTO;
        this.projectDTO=projectDTO;
        this.professionDTO=professionDTO;
        new AsyncTask<Void, Void, Integer>() {

            @Override
            protected void onPostExecute(Integer integer) {
                super.onPostExecute(integer);

            }

            @Override
            protected Integer doInBackground(Void... voids) {
                createDB();
                writeData();
                closeDB();
                return null;
            }
        }.execute();
    }

    private void createDB() {
        appDb = Room.inMemoryDatabaseBuilder(context, AppDatabase.class).build();
        userDetailsDAO = appDb.userDetailsDAO();
        educationDAO=appDb.educationDAO();
        professionDAO=appDb.professionDAO();
        projectDAO=appDb.projectDAO();
    }

    private void closeDB() {
        appDb.close();
    }

    private void writeData() {
        userDetailsDAO.insertData(userDetailsDTO);
        educationDAO.insertData(educationDTO);
        professionDAO.insertData(professionDTO);
        projectDAO.insertData(projectDTO);

//        List<UserDetailsDTO> testValue= userDetailsDAO.fetchAllUserDetails();
//        Log.d("UserData",testValue.get(0).getName());
    }

}
