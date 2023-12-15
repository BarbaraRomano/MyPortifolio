package com.example.meuportifolio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.meuportifolio.databinding.ActivityProjetosBinding

class Projetos : AppCompatActivity() {

    private lateinit var binding: ActivityProjetosBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProjetosBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val toolBarProjetos = binding.toolBarProjetos
        toolBarProjetos.setNavigationOnClickListener{
            finish()
        }
    }
}