package com.example.appsanvalentin

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.example.appsanvalentin.databinding.ActivityMessagesBinding
import kotlin.random.Random

class MessagesActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMessagesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMessagesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Glide.with(this)
            .asGif()
            .load(R.drawable.cute_bunnies)
            .into(binding.HeartGif)

        binding.HomeButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        val frases = listOf(
            "Te amo porque eres estúpidamente linda",
            "Te amo porque eres muy inteligente",
            "Te amo porque eres graciosa y adorable",
            "Te amo porque te sabes vestir",
            "Me encanta que no sabes comer y siempre te manchas",
            "Me fascina lo resiliente que eres",
            "Me encanta lo buena hija que eres",
            "Me encanta lo buena novia que eres",
            "Me encanta lo positiva que eres",
            "Me fascina lo buena amiga que eres",
            "Te amo porque eres fuerte",
            "Te amo porque no te rindes",
            "Te amo porque eres sexy",
            "Te amo porque eres una buena prima y nieta",
            "Te amo porque eres responsable",
            "Te amo porque me apoyas en los momentos difíciles",
            "Me encanta tu sonrisa hermosa",
            "Te amo porque me haces sentir especial",
            "Te amo porque me motivas cada día a ser mejor",
            "Te amo porque te preocupas genuinamente por mí",
            "Me encanta tu mirada y tus ojos redonditos",
            "Te amo porque siempre tratas de mejorar en todo",
            "Te amo porque la conexión que tenemos es única",
            "Te amo por tus abrazos que calman",
            "Te amo por tus manos tan suaves y lindas",
            "Te amo con todo mi corazón porque eres mi equipo y mi dream team",
            "Te amo porque eres mi universo entero",
            "Te amo porque buscas más cosas que tener en común",
            "Te amo porque tus besos son lindos y suaves",
            "Te amo porque intentas hacer cosas diferentes",
            "Te amo porque siempre buscas nuevas formas de demostrarme amor",
            "Te amo porque cuando algo me molesta, intentas cambiarlo",
            "Te amo porque eres honesta conmigo",
            "Te amo porque me enseñas cosas nuevas",
            "Te amo porque me tienes paciencia",
            "Te amo porque sabes cómo mantener la chispa encendida (guiño guiñito guiño)",
            "Te amo porque me conoces muy bien",
            "Te amo porque me enseñaste que no quiero a nadie más",
            "Te amo porque te emocionas con mis logros",
            "Te amo porque tus mensajes me alegran el día",
            "Te amo porque me escoges cada día",
            "Te amo porque siempre encuentras tiempo para mí",
            "Te amo porque te emocionas al verme y me haces sentir amado",
            "Te amo porque me aceptas incluso en mis días insoportables",
            "Te amo porque sabes hacerme sentir mejor sin decir nada",
            "Te amo porque te preocupas por cómo me siento",
            "Te amo porque me das abrazos sin pedírtelo",
            "Te amo porque escuchas mis tonterías sin cansarte",
            "Te amo porque compartes el cuerito del pollo conmigo",
            "Te amo porque tienes un olor único",
            "Te amo porque me animas a seguir mis pasiones",
            "Te amo porque me cuidas cuando estoy enfermo",
            "Te amo porque cada día contigo es emocionante",
            "Te amo porque eres mi mejor amiga",
            "Te amo porque sabes cómo darme paz cuando estoy ansioso",
            "Te amo porque sabes cuándo necesito un descanso",
            "Te amo porque no dejas que me rinda fácilmente",
            "Te amo porque te conozco",
            "Te amo porque eres transparente conmigo",
            "Te amo porque nos divertimos juntos",
            "Te amo porque me ayudas a adaptarme",
            "Te amo porque me das mi 'estate quieto' cuando lo necesito",
            "Te amo porque me cuidas aunque no te lo pida",
            "Te amo porque cuando estoy contigo, todo lo demás desaparece",
            "Te amo porque me das fuerzas cuando siento que no puedo más",
            "Te amo porque me recuerdas que el amor verdadero existe",
            "Te amo porque contigo soy la mejor versión de mí mismo",
            "Te amo porque eres mi razón favorita para sonreír",
            "Te amo porque siempre encuentras nuevas formas de demostrarme amor",
            "Te amo porque haces que cada 'te amo' tenga un significado especial",
            "Te amo porque nunca me canso de decirlo",
            "Te amo porque cada día contigo es una aventura",
            "Te amo porque me das la confianza de ser yo mismo",
            "Te amo porque das sentido a mi vida",
            "Te amo porque me amas de una forma que nunca antes había sentido",
            "Te amo porque simplemente eres tú, y eso es suficiente para hacerme feliz",
            "Te amo porque me haces ver la belleza en las pequeñas cosas",
            "Te amo porque me haces sentir amado de la manera más genuina",
            "Te amo porque cuando estoy contigo, el tiempo se detiene",
            "Te amo porque llenas mi vida de luz y alegría",
            "Te amo porque haces que cada día sea especial solo con tu presencia",
            "Te amo porque cuando me abrazas, todo lo malo desaparece",
            "Te amo porque me haces sentir amado de una forma única",
            "Te amo porque siempre tienes tiempo para mí, sin importar qué",
            "Te amo porque me haces sentir importante sin esfuerzo",
            "Te amo porque eres la persona con la que siempre quiero estar",
            "Te amo porque me demuestras cada día lo hermoso que es amar",
            "Te amo porque nuestra conexión es algo que nunca antes había sentido",
            "Te amo porque haces que el amor sea fácil y natural",
            "Te amo porque cada segundo contigo es un regalo",
            "Te amo porque eres mi inspiración y mi mayor apoyo",
            "Te amo porque en tus ojos encuentro mi hogar",
            "Te amo porque con cada beso me recuerdas cuánto me amas",
            "Te amo porque me haces sentir amado sin necesidad de palabras",
            "Te amo porque incluso en el silencio, nuestra conexión es fuerte",
            "Te amo porque eres mi compañero de vida",
            "Te amo porque sin importar lo que pase, sé que siempre estaremos juntos",
            "Te amo porque me haces sentir que todo es posible",
            "Te amo porque cuando estamos juntos, el mundo parece perfecto",
            "Te amo porque nuestro amor es único y especial",
            "Te amo porque no importa cuánto tiempo pase, mi amor por ti solo crece",
            "Te amo porque eres la mejor novia que he podido tener"
        )


        binding.RefreshButton.setOnClickListener {
            val randomIndex = Random.nextInt(frases.size)
            binding.Message.text = frases[randomIndex]
        }
    }
}
