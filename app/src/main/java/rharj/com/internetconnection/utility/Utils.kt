package rharj.com.internetconnection.utility

import android.content.Context
import android.net.ConnectivityManager

class Utils{

    companion object {
        fun haveNetworkConnection(context : Context): Boolean {

            val cm = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
            val activeNetwork = cm.activeNetworkInfo
            return null != activeNetwork && activeNetwork.isConnectedOrConnecting
        }
    }


}