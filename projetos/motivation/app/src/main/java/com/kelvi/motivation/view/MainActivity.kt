package com.kelvi.motivation.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.kelvi.motivation.R
import com.kelvi.motivation.mock.Mock
import com.kelvi.motivation.util.MotivationConstants
import com.kelvi.motivation.util.SecurityPreferences
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private var mFilter: Int = MotivationConstants.PHRASE_FILTER.ALL
    private lateinit var mSecurityPreferences: SecurityPreferences
    private val mMock = Mock()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mSecurityPreferences = SecurityPreferences(this)
        setListeners()
        handleFilter(R.id.imageAll)
        refreshPhrase()
        verifyUsername()
    }

    override fun onClick(view: View) {
        val id = view.id
        val listId = listOf(R.id.imageAll, R.id.imageSun, R.id.imageHappy)
        if (id in listId) {
            handleFilter(id)
        } else if(id === R.id.buttonNewPhrase) {
            refreshPhrase()
        }
    }

    private fun setListeners() {
        imageAll.setOnClickListener(this)
        imageSun.setOnClickListener(this)
        imageHappy.setOnClickListener(this)
        buttonNewPhrase.setOnClickListener(this)
    }

    private fun verifyUsername() {
        textUsername.text = mSecurityPreferences.getStoreString(MotivationConstants.KEY.PERSON_NAME)
    }

    private fun handleFilter(id: Int) {

        imageAll.setImageResource(R.drawable.ic_all_unselected)
        imageSun.setImageResource(R.drawable.ic_sun_unselected)
        imageHappy.setImageResource(R.drawable.ic_happy_unselected)

        if (id == R.id.imageAll) {
            mFilter = MotivationConstants.PHRASE_FILTER.ALL
            imageAll.setImageResource(R.drawable.ic_all_selected)
        } else if (id == R.id.imageSun) {
            mFilter = MotivationConstants.PHRASE_FILTER.SUN
            imageSun.setImageResource(R.drawable.ic_sun_selected)
        } else {
            mFilter = MotivationConstants.PHRASE_FILTER.HAPPY
            imageHappy.setImageResource(R.drawable.ic_happy_selected)
        }
    }

    private fun refreshPhrase() {
        textPhrase.text = mMock.getPhrase(mFilter)
    }
}
