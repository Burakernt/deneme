package com.burakernt.chatnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.burakernt.chatnavigation.databinding.FragmentLoginBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase


class LoginFragment : Fragment() {
    private var _binding: FragmentLoginBinding? = null
    private val binding get() = _binding!!
    private lateinit var auth: FirebaseAuth


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        auth = Firebase.auth
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentLoginBinding.inflate(inflater, container, false)
        val view = binding.root
        return view

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.signupButton.setOnClickListener {
            //signup butonuna tıklandığında ne olacak. kayıt işlemi gerçekleşecek
            auth.createUserWithEmailAndPassword(binding.emailText.text.toString(),binding.passwordText.text.toString()).addOnSuccessListener {
                //kullanıcı oluşturuldu
                //BURAYA BAKKKKKKKKKKKKKKKKK       AAAAAAAAAAAAAA     val action = LoginFragment.

            }.addOnFailureListener { exception ->
                //hata aldık


                Toast.makeText(requireContext(),exception.localizedMessage,Toast.LENGTH_LONG).show()
            }

        }
        binding.loginButton.setOnClickListener {
            //login butonuna tıklandığında ne olacak: login işlemi gerçekleşecek


        }
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}