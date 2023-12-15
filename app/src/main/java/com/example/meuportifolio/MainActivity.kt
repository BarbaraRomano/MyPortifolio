package com.example.meuportifolio

import android.content.Intent
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.graphics.createBitmap
import androidx.core.graphics.drawable.RoundedBitmapDrawable
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory
import com.example.meuportifolio.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fotoPerfil = BitmapFactory.decodeResource(resources, R.drawable.foto_perfil)
        val circulo = RoundedBitmapDrawableFactory.create(resources, fotoPerfil)
        circulo.isCircular = true
        binding.imgFotoPerfil.setImageDrawable(circulo)

        binding.btnProjetos.setOnClickListener {
            val intent = Intent(this, Projetos::class.java)
            startActivity(intent)
        }
        binding.btnContato.setOnClickListener {
            val intent = Intent(this, Contatos::class.java)
            startActivity(intent)
        }
    }
}