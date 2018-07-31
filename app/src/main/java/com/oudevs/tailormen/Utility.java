package com.oudevs.tailormen;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.widget.EditText;
import android.widget.Toast;

public class Utility extends AppCompatActivity {
    Context context;

    //constructor
    Utility(Context context) {
        this.context = context;
    }

    boolean isEmpty(EditText text) {
        String str = text.getText().toString().trim();
        return TextUtils.isEmpty(str);
    }

    boolean checkEnteredData(EditText inputEmail, EditText inputPassword) {
        if (isEmpty(inputEmail)) {
            Toast.makeText(this.context, "EmailID is required", Toast.LENGTH_SHORT).show();
            return false;
        }

        if (isEmpty(inputPassword)) {
            Toast.makeText(this.context, "Password is required", Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }
}
