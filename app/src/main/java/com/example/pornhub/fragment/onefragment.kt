package com.example.pornhub.fragment

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.Toast
import androidx.cardview.widget.CardView
import com.example.pornhub.R
import com.example.pornhub.SplahsActivity
import com.example.pornhub.StateActivity
import com.example.pornhub.databinding.FragmentOnefragmentBinding

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


class onefragment : Fragment() {
    private var _binding: FragmentOnefragmentBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding= FragmentOnefragmentBinding.inflate(inflater,container,false)
        return binding.root
    }
}