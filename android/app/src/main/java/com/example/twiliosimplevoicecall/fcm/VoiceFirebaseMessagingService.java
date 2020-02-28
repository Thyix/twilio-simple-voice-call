package com.example.twiliosimplevoicecall.fcm;

import android.annotation.TargetApi;

import android.app.ActivityManager;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;

import com.facebook.react.*;
import com.facebook.react.ReactInstanceManager;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.example.twiliosimplevoicecall.BuildConfig;
import com.example.twiliosimplevoicecall.CallNotificationManager;
import com.twilio.voice.Call;
import com.twilio.voice.CallInvite;
import com.twilio.voice.CallException;
import com.twilio.voice.CancelledCallInvite;
import com.twilio.voice.MessageListener;
import com.twilio.voice.Voice;

import java.util.Map;
import java.util.Random;

import static com.example.twiliosimplevoicecall.TwilioVoiceModule.TAG;
import static com.example.twiliosimplevoicecall.TwilioVoiceModule.ACTION_INCOMING_CALL;
import static com.example.twiliosimplevoicecall.TwilioVoiceModule.INCOMING_CALL_INVITE;
import static com.example.twiliosimplevoicecall.TwilioVoiceModule.INCOMING_CALL_NOTIFICATION_ID;
import com.example.twiliosimplevoicecall.SoundPoolManager;

public class VoiceFirebaseMessagingService extends FirebaseMessagingService {

    private CallNotificationManager callNotificationManager;

    @Override
    public void onCreate() {
        super.onCreate();
        callNotificationManager = new CallNotificationManager();
    }

}
