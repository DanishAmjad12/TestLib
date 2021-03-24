package com.test.y;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class SavyourPlugin
{
    public static  String TAG = "SAVYOUR PLUGIN";

    public static boolean isComingFromSavyour=false;

    public static void showConnectedMessage(Context c, String message){

        Toast.makeText(c,message,Toast.LENGTH_SHORT).show();
    }

    public static void initData(Intent intent)
    {
        if(intent!=null)
        {
            Log.e(TAG,"Intent is not null");

            if(intent.getAction()=="savyour")
            {
                isComingFromSavyour=true;
                Log.e(TAG,"Is Coming from savyour application");
                Log.e(TAG,"user Id is: " + intent.getStringExtra("userid"));
            }
            else
            {
                isComingFromSavyour=false;
                Log.e(TAG,"Is not Coming from savyour application");
            }
        }
        else
        {
            Log.e(TAG,"Intent is null");
        }
    }

    public static void orderPlaced()
    {
        if(isComingFromSavyour)
        {
            isComingFromSavyour=false;
            Log.e(TAG,"order Placed");
        }
    }
}
