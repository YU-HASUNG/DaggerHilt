package leopardcat.studio.daggerhiltstudy

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import leopardcat.studio.daggerhiltstudy.houses.House
import javax.inject.Inject

class HouseActivity: AppCompatActivity() {

    @Inject
    lateinit var house: House

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        house.alert()
    }
}