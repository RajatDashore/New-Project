@file:Suppress("DEPRECATION")

package com.uoons.india.data.local

import android.content.Context
import android.content.pm.PackageManager
import android.os.Build
import androidx.annotation.RequiresApi
import java.security.MessageDigest
import java.security.NoSuchAlgorithmException


class MyUtils {


    @RequiresApi(Build.VERSION_CODES.P)
    fun validSignature(applicationContext: Context,
                       DDSIGNATURE:String, RELSIGNATURE:String):Boolean{
        try{
            val packageInfo=applicationContext.packageManager.
            getPackageInfo(applicationContext.packageName, PackageManager.GET_SIGNING_CERTIFICATES)

            val var5 = with(applicationContext.packageManager)
            {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P)
                {
                    getPackageInfo(applicationContext.packageName,
                        PackageManager.GET_SIGNING_CERTIFICATES).signingInfo.apkContentsSigners
                }else{
                    getPackageInfo(applicationContext.packageName,
                        PackageManager.GET_SIGNATURES).signatures
                }
            }
            val var6=var5.size
            for (var7 in 0 until var6)
            {
                val signature = var5[var7]
                val currentSignature: String =
                    getSHA256(signature.toByteArray())
                if (DDSIGNATURE == currentSignature || RELSIGNATURE
                    == currentSignature) {
                    return true
                }
            }
        } catch (var10: Exception) {
            var10.printStackTrace()
        }
        return false
    }
    fun getSHA256(sig: ByteArray): String {
        var digest: MessageDigest? = null
        try {
            digest = MessageDigest.getInstance("SHA256")
        } catch (e: NoSuchAlgorithmException) {
            e.printStackTrace()

        }
        digest!!.update(sig)
        val hashtext = digest.digest()
        return bytesToHex(hashtext)
    }


    private fun bytesToHex(bytes: ByteArray): String {
        val hexArray = charArrayOf(
            '0',
            '1',
            '2',
            '3',
            '4',
            '5',
            '6',
            '7',
            '8',
            '9',
            'A',
            'B',
            'C',
            'D',
            'E',
            'F'
        )
        val hexChars = CharArray(bytes.size * 2)
        var v: Int
        for ((i, j:Byte) in bytes.withIndex()) {
            v = j.toInt() and 0xFF
            hexChars[i*2] = hexArray[v ushr 4]
            hexChars[i * 2 + 1] = hexArray[v and 15]
        }
        return String(hexChars)
    }

}