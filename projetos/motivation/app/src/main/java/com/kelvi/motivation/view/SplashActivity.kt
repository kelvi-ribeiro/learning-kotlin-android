package com.kelvi.motivation.view

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.kelvi.motivation.R
import com.kelvi.motivation.util.MotivationConstants
import com.kelvi.motivation.util.SecurityPreferences
import kotlinx.android.synthetic.main.activity_splash.*

class SplashActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var mSecurity: SecurityPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        mSecurity = SecurityPreferences(this)
        buttonSave.setOnClickListener(this)
        verifyUsername()
    }

    override fun onClick(view: View) {
        val id = view.id
        if (id == R.id.buttonSave) {
            handleSave()
        }
    }

    private fun verifyUsername() {
        val username = mSecurity.getStoreString(MotivationConstants.KEY.PERSON_NAME)
        if (username.isNullOrEmpty()) {
            editName.setText(username)
            return
        }
        startActivity(Intent(this, MainActivity::class.java))
    }

    private fun handleSave() {
        val name = editName.text.toString()

        if (name.isEmpty()) {
            Toast.makeText(this, getString(R.string.informe_nome), Toast.LENGTH_LONG).show()
        } else {
            mSecurity.storeString(MotivationConstants.KEY.PERSON_NAME, name)

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            // Remove a activity(tela) atual da pilha, impedindo que seja possível voltar a esta activity
            // finish()
        }
    }
}
