package campalans.m8.m08_uf2_a12_animacions

import android.animation.AnimatorInflater
import android.animation.AnimatorSet
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.ImageView

class splashscreen : AppCompatActivity() {

    lateinit var pilotaImatge: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashscreen)

        //Guardem la imatge de la pilota en una variable
        pilotaImatge = findViewById(R.id.pilota)

        //Guardem l'animació d'opacitat
        val transicioOpacitat = AnimationUtils.loadAnimation(this, R.anim.transicio_opacitat)

        //Variables de les animacions
        val animaciodreta = AnimatorInflater.loadAnimator(this, R.animator.animaciodreta)
        val animacioamunt = AnimatorInflater.loadAnimator(this, R.animator.animacioamunt)
        val animacioesquerra = AnimatorInflater.loadAnimator(this, R.animator.animacioesquerra)
        val animacioavall = AnimatorInflater.loadAnimator(this, R.animator.animacioavall)
        val animaciodreta2 = AnimatorInflater.loadAnimator(this, R.animator.animaciodreta2)
        val animacioamunt2 = AnimatorInflater.loadAnimator(this, R.animator.animacioamunt2)

        //Assignar animacions a la pilota
        animaciodreta.setTarget(pilotaImatge)
        animacioamunt.setTarget(pilotaImatge)
        animacioesquerra.setTarget(pilotaImatge)
        animacioavall.setTarget(pilotaImatge)
        animaciodreta2.setTarget(pilotaImatge)
        animacioamunt2.setTarget(pilotaImatge)


        //Iniciar seqüencialment les animacions
        val animatorSet = AnimatorSet()
        animatorSet.playSequentially(animaciodreta, animacioamunt, animacioesquerra, animacioavall, animaciodreta2, animacioamunt2)
        animatorSet.start()


        //Iniciar el MainActivity al fer clic a la pilota
        pilotaImatge.setOnClickListener{
            val intent = Intent(this@splashscreen, MainActivity::class.java)
            //Assignar l'animació d'opacitat a la imatge de la pilota
            pilotaImatge.startAnimation(transicioOpacitat)
            startActivity(intent)
            finish()
        }
    }
}