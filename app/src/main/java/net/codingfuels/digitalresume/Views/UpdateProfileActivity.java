package net.codingfuels.digitalresume.Views;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

import net.codingfuels.digitalresume.Models.UpdateModelmpl;
import net.codingfuels.digitalresume.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class UpdateProfileActivity extends AppCompatActivity implements UpdateProfile
{
    @BindView(R.id.name_view)
    EditText name;
    @BindView(R.id.objective_view)
    EditText objective;
    @BindView(R.id.profile_view)
    EditText profile;
    @BindView(R.id.skills_view)
    EditText skills;
    @BindView(R.id.intrsts_view)
    EditText intrsts;
    @BindView(R.id.snippets_view)
    EditText snippetsView;
    @BindView(R.id.name_of_education)
    EditText nameOfEducation;
    @BindView(R.id.passing_year)
    EditText passingYear;
    @BindView(R.id.major)
    EditText major;
    @BindView(R.id.board_name)
    EditText boardName;
    @BindView(R.id.percentage)
    EditText percentage;
    @BindView(R.id.company_name)
    EditText companyName;
    @BindView(R.id.position)
    EditText position;
    @BindView(R.id.joining_day)
    EditText joiningDay;
    @BindView(R.id.last_day)
    EditText lastDay;
    @BindView(R.id.achivements)
    EditText achivements;



    @BindView(R.id.references)
    EditText references;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_profile);
        ButterKnife.bind(this);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new UpdateProfilePresenterImpl(UpdateProfileActivity.this,new UpdateModelmpl(getApplicationContext())).updateData();
            }
        });
    }

    @Override
    public String getName() {
        return name.getText().toString();
    }

    @Override
    public String getObjective() {
        return objective.getText().toString();
    }

    @Override
    public String getProfile() {
        return profile.getText().toString();
    }

    @Override
    public String getSkills() {
        return skills.getText().toString();
    }

    @Override
    public String getIntrsts() {
        return intrsts.getText().toString();
    }

    @Override
    public String getSnippets() {
        return snippetsView.getText().toString();
    }

    @Override
    public String getReference() {
        return reference.getText().toString();
    }

    @Override
    public String getNameOfEducation() {
        return null;
    }

    @Override
    public String getPassingYear() {
        return null;
    }

    @Override
    public String getMajor() {
        return null;
    }

    @Override
    public String getBoardName() {
        return null;
    }

    @Override
    public String getPercentage() {
        return null;
    }

    @Override
    public String getCompanyName() {
        return null;
    }

    @Override
    public String getPosition() {
        return null;
    }

    @Override
    public String getJoiningDay() {
        return null;
    }

    @Override
    public String getLastDay() {
        return null;
    }

    @Override
    public String getAchivements() {
        return null;
    }

    @Override
    public String getReferences() {
        return null;
    }


}
