package cu.simbiosissurl.gpe;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;

public class UpdateRecirver extends BroadcastReceiver {

    Context context;
    @Override
    public void onReceive(Context context, Intent intent) {

        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        @SuppressLint("MissingPermission") NetworkInfo activeNetInfo = connectivityManager.getActiveNetworkInfo();
        boolean isConnected = activeNetInfo != null && activeNetInfo.isConnectedOrConnecting();
        if (isConnected){
           // Toast.makeText(context, "Conectado "+ isConnected,
            //        Toast.LENGTH_LONG).show();
            Log.i("NET", "Not Connected" + isConnected);


        }else{
            //Toast.makeText(context, "Desconectado "+ isConnected,
            //
            Log.i("NET", "Not Connected" + isConnected);

        }


    }
}

