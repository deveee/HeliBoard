package org.dslul.openboard.inputmethod.compat;

import android.annotation.TargetApi;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Build;

public class ClipboardManagerCompat {

    @TargetApi(Build.VERSION_CODES.P)
    public static void clearPrimaryClip(ClipboardManager cm) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
            cm.clearPrimaryClip();
        } else {
            cm.setPrimaryClip(ClipData.newPlainText("", ""));
        }
    }

}
