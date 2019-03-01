package e.bazukiss.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class CustomReceiver extends BroadcastReceiver {

    public static final String ACTION_CUSTOM_BROADCAST ="e.bazukiss.broadcastreceiver" ;

    public CustomReceiver(){

    }

    @Override
    public void onReceive(Context context, Intent intent) {
        String intentAction=intent.getAction();
        String message=null;
        switch (intentAction){
            case Intent.ACTION_POWER_CONNECTED:
                message = "Power Connected!";
                break;
            case Intent.ACTION_POWER_DISCONNECTED:
                message = "Power Disconnected!";
                break;
            case ACTION_CUSTOM_BROADCAST:
                message = "Custom Broadcast Received!";
                break;
        }
        Toast.makeText(context,message,Toast.LENGTH_SHORT).show();
    }
}
