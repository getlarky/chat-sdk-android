package co.chatsdk.firebase.push;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import android.util.Log;
import com.larky.nudge.Nudge;

import timber.log.Timber;

public class DefaultFirebaseMessagingService extends FirebaseMessagingService {

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        Timber.v("Test");
        Nudge.handlePush(remoteMessage);
        Log.d("Chat-sdk-firebase-push", "Message received");
    }

}
