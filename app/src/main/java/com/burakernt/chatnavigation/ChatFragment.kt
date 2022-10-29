package com.burakernt.chatnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.burakernt.chatnavigation.databinding.FragmentChatBinding
import com.burakernt.chatnavigation.databinding.FragmentLoginBinding

class ChatFragment : Fragment() {
    private var _binding: FragmentChatBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentChatBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.sendButton.setOnClickListener {
            //gönder butonuna tıklandığında yapılacaklar


        }
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}