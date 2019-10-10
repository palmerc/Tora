package jp.co.aiphone.ngt_android_setting_tool.nfc;

import android.util.Log;
import android.os.Environment;
import java.io.IOException;
import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.lang.StringBuilder;
import java.nio.charset.StandardCharsets;

import static android.os.Environment.DIRECTORY_DOCUMENTS;

public class LogTool {
    private static String TAG = "LogTool";

    public static void logString(String text) {
        File sdCard = Environment.getExternalStoragePublicDirectory(DIRECTORY_DOCUMENTS);
        File logFile = new File(sdCard.getAbsolutePath() + "/GTData/aiphone.log");
        if (!logFile.exists()) {
            Log.d(TAG, "Log file path: " + logFile.getAbsolutePath());

            try {
                logFile.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        Log.d(TAG, text);

        try {
            //BufferedWriter for performance, true to set append to file flag
            BufferedWriter buf = new BufferedWriter(new FileWriter(logFile, true));
            buf.append(text);
            buf.newLine();
            buf.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void logBytes(byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bytes) {
            sb.append(String.format("%02x", b));
        }
        sb.append("<=>");
        String decodedBytes = new String(bytes, 0, bytes.length, StandardCharsets.ISO_8859_1);
        sb.append(decodedBytes);

        logString(sb.toString());
    }
}
