package com.adso.alejoprimerexamenmovil

import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.adso.alejoprimerexamenmovil.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() ,OnClickListener{
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.buttonKilometros.setOnClickListener(this)
        binding.buttonCentimetros.setOnClickListener(this)
        binding.buttonMilimetros.setOnClickListener(this)
        binding.buttonDecametros.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        var input = binding.editTextMetros.text.toString().toFloatOrNull()
        val default:String = "Equivale a: "
        if (input !==null){
            when(v){
            binding.buttonKilometros->
                binding.resultado.text = default + (input/1000).toString() + " Km"

            binding.buttonCentimetros->
                binding.resultado.text = default + (input*100).toString() + " cm"

            binding.buttonMilimetros->
                binding.resultado.text = default + (input*1000).toString() + "mm"

            binding.buttonDecametros->
                binding.resultado.text = default + (input/10).toString() + "Dm"

            }
        }
    }
}