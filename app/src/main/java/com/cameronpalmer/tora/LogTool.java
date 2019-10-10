package com.cameronpalmer.tora;

import android.os.Environment;
import android.util.Log;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import static android.os.Environment.DIRECTORY_DOCUMENTS;

public class LogTool {
    public static void logString(String tag, String text) {
        File sdCard = Environment.getExternalStoragePublicDirectory(DIRECTORY_DOCUMENTS);
        File logFile = new File(sdCard.getAbsolutePath() + "/GTData/aiphone.log");
        if (!logFile.exists()) {
            Log.d(tag, "Log file path: " + logFile.getAbsolutePath());

            try {
                logFile.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        Log.d(tag, text);

        try {
            //BufferedWriter for performance, true to set append to file flag
            BufferedWriter buf = new BufferedWriter(new FileWriter(logFile, true));
            buf.append(tag);
            buf.append(',');
            buf.append(text);
            buf.newLine();
            buf.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void logBytes(String tag, byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bytes) {
            sb.append(String.format("%02x", b));
        }
        sb.append("<=>");
        String decodedBytes = new String(bytes, 0, bytes.length, StandardCharsets.ISO_8859_1);
        sb.append(decodedBytes);

        logString(tag, sb.toString());
    }
}
