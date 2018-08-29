package rharj.com.internetconnection.activity

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import rharj.com.internetconnection.R
import kotlinx.android.synthetic.main.activity_main.*
import rharj.com.internetconnection.utility.Utils

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        check_connection.setOnClickListener {

            checkInternetConnection(this)
        }
    }

    private fun checkInternetConnection(context : Context){
        if(Utils.haveNetworkConnection(context)){
            Toast.makeText(context,"Internet connection is available",Toast.LENGTH_SHORT).show()
        }else{
            Toast.makeText(context,"Internet connection is not available",Toast.LENGTH_SHORT).show()
        }
    }
}
