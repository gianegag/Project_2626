package com.example.project_2626

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import javax.net.ssl.SSLSessionBindingEvent

class BookKidActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_kid)

        //isntenace
        val btnFairy:Button=findViewById(R.id.buttonfairy)
        val btnfFable:Button=findViewById(R.id.buttonfabel)
        val btnSciene:Button=findViewById(R.id.buttonScience)


        btnFairy.setOnClickListener{
            replaceFragment(FairyFragment())
        }

        btnfFable.setOnClickListener{
            replaceFragment(FableFragment())
        }

        btnSciene.setOnClickListener{
            replaceFragment(SienceFragment())
        }
    }
    private fun replaceFragment (frg: Fragment) {
        val fragmentManager= supportFragmentManager
        val fragmentTrx = fragmentManager.beginTransaction()
        fragmentTrx.replace(R.id.fragmentKidBook,frg)
        fragmentTrx.commit()
    }
}