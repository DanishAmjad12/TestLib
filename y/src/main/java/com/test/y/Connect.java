package com.test.y;

import android.content.Context;
import android.widget.Toast;

public class Connect
{
    public static void showConnectedMessage(Context c, String message){

        Toast.makeText(c,message,Toast.LENGTH_SHORT).show();
    }
}
