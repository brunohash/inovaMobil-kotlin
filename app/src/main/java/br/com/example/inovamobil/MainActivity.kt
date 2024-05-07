package br.com.example.inovamobil

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var login: EditText
    private lateinit var password: EditText
    private var inputLogin: String = ""
    private var inputPassword: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("InovaMobilLogs", "Inicializando...")

        login = findViewById(R.id.login)
        password = findViewById(R.id.password)
    }

    fun authentication(view: android.view.View) {
        inputLogin = login.text.toString()
        inputPassword = password.text.toString()

        if (inputLogin == "admin" && inputPassword == "admin") {
            Log.d("InovaMobilLogs", "Login successful")

            // Exemplo de iniciar a tela Home usando Intent
            val homeScreenIntent = Intent(this, Home::class.java)
            startActivity(homeScreenIntent)
        } else {
            Log.d("InovaMobilLogs", "Invalid login or password")
        }
    }
}