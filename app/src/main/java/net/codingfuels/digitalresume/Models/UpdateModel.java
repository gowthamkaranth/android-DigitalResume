package net.codingfuels.digitalresume.Models;

import android.content.Context;

/**
 * Created by gowtham on 29/11/17.
 */

public interface UpdateModel {
    void saveData(UserDetailsDTO userDetailsDTO,EducationDTO educationDTO,ProjectDTO projectDTO,ProfessionDTO professionDTO);
}
