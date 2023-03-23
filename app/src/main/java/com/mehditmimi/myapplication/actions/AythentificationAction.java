package com.mehditmimi.myapplication.actions;

import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import com.mehditmimi.myapplication.AccueilActivity;
import com.mehditmimi.myapplication.MainActivity;
import com.mehditmimi.myapplication.models.User;

public class AythentificationAction implements View.OnClickListener {
    private EditText emailInput;
    private EditText pwdInput;
    private MainActivity mainActivity;

    public AythentificationAction(MainActivity mainActivity){
        this.mainActivity = mainActivity;
        emailInput = mainActivity.getEmailInput();
        pwdInput = mainActivity.getPasswordInput();
    }
    @Override
    public void onClick(View view) {
        if(emailInput.getText().toString().equals("") || pwdInput.getText().toString().equals("")){
            Toast.makeText(mainActivity, "all faileds are required",
                    Toast.LENGTH_SHORT).show();
            return;

        }
        //authentification
        User user = mainActivity.getServices().login(emailInput.getText().toString(), pwdInput.getText().toString());
        if(user!=null){
            //Toast.makeText(mainActivity,"hey"+user.getName(),Toast.LENGTH_SHORT).show();
            /*Intent intent = new Intent(mainActivity, AccueilActivity.class);
            mainActivity.startActivity(intent);*/
            Toast.makeText(mainActivity,"Hi"+user.getName(),Toast.LENGTH_SHORT ).show();
            Intent intent = new Intent(mainActivity, AccueilActivity.class);
            intent.putExtra("name",user.getName());
            mainActivity.startActivity(intent);
            mainActivity.finish();
        }
        else
            Toast.makeText(mainActivity,"error",Toast.LENGTH_SHORT).show();
    }

}
//setExtra getExtra
//jsp w les sessions
//rest api et le client c'est ajax
//kolchi kayn ghir mongoose la
//bd memoire
//bd json ou memoire
//mvc f node js
//