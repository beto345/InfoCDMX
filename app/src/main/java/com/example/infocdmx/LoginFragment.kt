package com.example.infocdmx

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.infocdmx.databinding.FragmentLoginBinding
import androidx.navigation.fragment.findNavController

class LoginFragment : Fragment() {
    private var _binding : FragmentLoginBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentLoginBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding.textViewRegister.setOnClickListener {
            findNavController().navigate(R.id.action_loginFragment_to_registerFragment)
        }
        
        // Aquí puedes agregar la lógica para el botón de login
        binding.buttonLogin.setOnClickListener {
            // Lógica de inicio de sesión
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
