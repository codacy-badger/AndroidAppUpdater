package ir.heydarii.appupdater.utils

import android.graphics.Typeface

/**
 * A class to store constants of the project
 */
class Constants {
    companion object {
        const val TAG = "AndroidAppUpdater"
        var REQUEST_ID = -10L
        const val UPDATE_DIALOG_TAG = "UpdateDialog"
        const val APK_NAME = "NewAPK.apk"
        const val DATA_LIST = "DATA_LIST"

        // to use typeface while using the dialog
        var typeface: Typeface? = null
    }
}