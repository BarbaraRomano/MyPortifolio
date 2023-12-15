package com.example.meuportifolio

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.meuportifolio.databinding.ActivityContatosBinding

class Contatos : AppCompatActivity() {

    private lateinit var binding: ActivityContatosBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityContatosBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val toolBarContato = binding.toolBarContato
        toolBarContato.setNavigationOnClickListener{
                finish()
            }

        binding.wpp.setOnClickListener{
            abrirWpp()
        }
    }
    private fun abrirWpp(){
        val numTelefone = "5531997521374"
        val uri = Uri.parse("https://api.whatsapp.com/send?phone=$numTelefone")
        val intent = Intent(Intent.ACTION_VIEW, uri)
        startActivity(intent)

        if (numTelefone.equals(numTelefone)){
            startActivity(intent)
        }else{
            val playStore = Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.whatsapp"))
            startActivity(playStore)
        }
    }
}