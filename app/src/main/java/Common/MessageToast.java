package Common;

import android.content.Context;
import android.widget.Toast;

public class MessageToast {
    public static void message(Context context ,String msg){
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }
}
