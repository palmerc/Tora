package com.cameronpalmer.tora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.nfc.NfcAdapter;
import android.nfc.cardemulation.CardEmulation;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;

public class NFCCommunicationActivity extends AppCompatActivity implements INFCCardEmulationObserver {
    private ScrollView mResponseScrollView;
    private LinearLayout mResponseLinearLayout;
    private Handler mHandler;

    private static final String mAID = String.format("%x", new BigInteger(1, "NEWGT".getBytes(StandardCharsets.ISO_8859_1)));

    CardEmulation mCardEmulation;
    NfcAdapter mNFCAdapter;

    private int mPasscode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nfc);

        this.mHandler = new Handler();

        this.mResponseScrollView = findViewById(R.id.response_scrollView);
        this.mResponseLinearLayout = findViewById(R.id.response_linearLayout);

        this.displayResponse("START");
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();

        GTHostApduService.setObserver(null);

        this.mNFCAdapter = null;
    }

    @Override  // android.support.v4.app.i
    public void onPause() {
        super.onPause();

        GTHostApduService.setObserver(null);
        ComponentName componentName = new ComponentName(this, GTHostApduService.class);
        if(this.mCardEmulation != null) {
            this.mCardEmulation.removeAidsForService(componentName, "other");
            this.mCardEmulation.unsetPreferredService(this);
        }
    }

    @Override
    protected void onResume() {
        super.onResume();

        this.mNFCAdapter = NfcAdapter.getDefaultAdapter(this);

        GTHostApduService.setObserver(this);
        ComponentName componentName = new ComponentName(this, GTHostApduService.class);
        this.mCardEmulation = CardEmulation.getInstance(this.mNFCAdapter);
        this.mCardEmulation.registerAidsForService(componentName, "other", Arrays.asList(mAID));
        this.mCardEmulation.setPreferredService(this, componentName);
    }

    @Override
    public void displayResponse(String message) {
        TextView textView = new TextView(this);
        textView.setText(message);
        mResponseLinearLayout.addView(textView);

        mHandler.post(new Runnable() {

            @Override
            public void run() {
                mResponseScrollView.fullScroll(View.FOCUS_DOWN);
            }
        });
    }
}
