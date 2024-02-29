package campalans.m8.m08_uf2_a12_animacions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var text: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Guardar variable del text
        text = findViewById(R.id.text)

        //Guardem l'animació d'opacitat
        val transicioOpacitat = AnimationUtils.loadAnimation(this, R.anim.transicio_opacitat)

        //Assignar l'animació d'opacitat al text
        text.startAnimation(transicioOpacitat)


    }
}