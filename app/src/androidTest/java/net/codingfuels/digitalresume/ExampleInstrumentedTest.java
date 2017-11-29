package net.codingfuels.digitalresume;

import android.arch.persistence.room.Room;
import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import net.codingfuels.digitalresume.Models.AppDatabase;
import net.codingfuels.digitalresume.Models.EducationDAO;
import net.codingfuels.digitalresume.Models.EducationDTO;
import net.codingfuels.digitalresume.Models.ProfessionDAO;
import net.codingfuels.digitalresume.Models.ProfessionDTO;
import net.codingfuels.digitalresume.Models.ProjectDAO;
import net.codingfuels.digitalresume.Models.UserDetailsDAO;
import net.codingfuels.digitalresume.Models.UserDetailsDTO;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    private UserDetailsDAO userDetailsDAO;
    private EducationDAO educationDAO;
    private ProfessionDAO professionDAO;
    private ProjectDAO projectDAO;
    private AppDatabase appDb;


    @Before
  public void createDB(){
      Context context=InstrumentationRegistry.getTargetContext();
      appDb= Room.inMemoryDatabaseBuilder(context,AppDatabase.class).build();
      userDetailsDAO=appDb.userDetailsDAO();
      educationDAO=appDb.educationDAO();
      professionDAO=appDb.professionDAO();
  }
  @After
    public void closeDB(){
      appDb.close();
  }
  @Test
    public void writeDataAndRead(){
            UserDetailsDTO testUserDetails=new UserDetailsDTO();
        testUserDetails.setName("Gowtham");
        testUserDetails.setInterests("Gaming");
     userDetailsDAO.insertData(testUserDetails);
//      EducationDTO educationDTO=new EducationDTO();
//      educationDTO.setUserName("Gowtham");
//      educationDTO.setMajor("CS");
     // educationDAO.insertData(educationDTO);
      ProfessionDTO professionDTO=new ProfessionDTO();
      professionDTO.setUserName("Gowtham");
      professionDTO.setPosition("SA");
      professionDAO.insertData(professionDTO);
      List<ProfessionDTO> byName= professionDAO.getEducationDetails("Gowtham");



//      List<UserDetailsDTO> byName = userDetailsDAO.fetchAllUserDetails();
      assertThat(byName.get(0).getPosition(),equalTo("SA"));
  }
}
