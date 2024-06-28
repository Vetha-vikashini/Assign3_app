package com.example.assign3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.FragmentTransaction
import com.example.assign3.databinding.FragmentFragcatBinding


class Fragcat : Fragment() {

    private lateinit var fragcatBinding: FragmentFragcatBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =inflater.inflate(R.layout.fragment_fragcat, container, false)


        val child1 = view.findViewById<ImageView>(R.id.shirt)
        val child2 = view.findViewById<ImageView>(R.id.croptop)
        val child3 = view.findViewById<ImageView>(R.id.fulldress)

        replaceFragment(shirt())
        child1.setOnClickListener { replaceFragment(shirt()) }
        child2.setOnClickListener { replaceFragment(croptop()) }
        child3.setOnClickListener { replaceFragment(gown()) }

        return view
    }

    private fun replaceFragment(fragment: Fragment) {
        val transaction: FragmentTransaction = childFragmentManager.beginTransaction()
        transaction.replace(R.id.child,fragment).commit()
    }

    companion object {

        @JvmStatic
        fun newInstance()=Fragcat()

    }
}