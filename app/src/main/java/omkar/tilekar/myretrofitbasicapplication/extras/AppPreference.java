package omkar.tilekar.myretrofitbasicapplication.extras;

import android.content.Context;
import android.content.SharedPreferences;
import android.widget.Toast;

import omkar.tilekar.myretrofitbasicapplication.R;

public class AppPreference {
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    Context context;

    public AppPreference(Context context)
    {
        this.context=context;
        sharedPreferences = context.getSharedPreferences(String.valueOf(R.string.s_pref_file),Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
    }

    //Login Status
    public void setLoginStatus(boolean status)
    {
        editor.putBoolean(String.valueOf(R.string.s_pref_login_status),status);
        editor.commit();

    }
    public boolean getLoginStatus()
    {
        return sharedPreferences.getBoolean(String.valueOf(R.string.s_pref_login_status),false);
    }


    //Name
    public void setDisplayName(String name)
    {
        editor.putString(String.valueOf(R.string.s_pref_login_name),"Name");
        editor.commit();
    }

    public String getDisplayName(String name)
    {
        return sharedPreferences.getString(String.valueOf(R.string.s_pref_login_name),"Name");
    }

    //Email
    public void setDisplayEmail(String email)
    {
        editor.putString(String.valueOf(R.string.s_pref_login_email),"Email");
        editor.commit();
    }

    public String getDisplayEmail(String email)
    {
        return sharedPreferences.getString(String.valueOf(R.string.s_pref_login_email),"Email");
    }

    // Date
    public void setDisplayDate(String date)
    {
        editor.putString(String.valueOf(R.string.s_pref_login_date),"Date");
        editor.commit();
    }

    public String getDisplayDate(String date)
    {
        return sharedPreferences.getString(String.valueOf(R.string.s_pref_login_date),"Date");
    }

    public  void showToast(String message)
    {
        Toast.makeText(context,message,Toast.LENGTH_LONG).show();
    }

}
