package net.codingfuels.digitalresume.Views;

import net.codingfuels.digitalresume.Models.UpdateModel;
import net.codingfuels.digitalresume.Models.UserDetailsDTO;

/**
 * Created by gowtham on 29/11/17.
 */

public class UpdateProfilePresenterImpl implements UpdateProfilePresenter {
    UpdateProfile updateProfileView;
    UpdateModel updateModel;
    public UpdateProfilePresenterImpl(UpdateProfile updateProfile,UpdateModel updateModel){
        this.updateProfileView=updateProfile;
        this.updateModel=updateModel;

    }

    @Override
    public void updateData() {
        UserDetailsDTO userDetailsDTO=new UserDetailsDTO();
        userDetailsDTO.setName(updateProfileView.getName());
        userDetailsDTO.setObjective(updateProfileView.getObjective());
        userDetailsDTO.setSkills(updateProfileView.getProfile());
        userDetailsDTO.setProfile(updateProfileView.getProfile());
        updateModel.saveData(userDetailsDTO);
    }
}
