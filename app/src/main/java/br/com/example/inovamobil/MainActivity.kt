package br.com.example.inovamobil

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var login: EditText
    private lateinit var password: EditText
    private lateinit var loginButton: Button
    private var inputLogin: String = ""
    private var inputPassword: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("LoginActivity", "Inicializando...")

        login = findViewById(R.id.login)
        password = findViewById(R.id.password)
        loginButton = findViewById(R.id.buttonEntry)

        loginButton.setOnClickListener {
            inputLogin = login.text.toString()
            inputPassword = password.text.toString()
            authentication(inputLogin, inputPassword)
        }
    }

    fun ButtonRegister(view: android.view.View) {
        authentication(inputLogin, inputPassword)
    }

    private fun authentication(inputLogin: String, inputPassword: String) {
        if (inputLogin == "bruno" && inputPassword == "123") {
            Log.d("LoginActivity", "Login successful")
        } else {
            Log.d("LoginActivity", "Invalid login or password")
        }
    }
}
