package com.example.assign3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class Fraghome : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var DressList:ArrayList<Dress>
    private lateinit var dressadapter:DressAdapter


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val rootView = inflater.inflate(R.layout.fragment_fraghome, container, false)

        recyclerView = rootView.findViewById(R.id.recycleview)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager= LinearLayoutManager(requireContext(),RecyclerView.HORIZONTAL,false)
        DressList =ArrayList()

        addDataToList()
        dressadapter =DressAdapter((DressList))

        recyclerView.adapter=dressadapter

        return rootView
    }

    companion object {

        @JvmStatic
        fun newInstance()=Fraghome()
    }

    private fun addDataToList(){
        DressList.add(Dress(R.drawable.one))
        DressList.add(Dress(R.drawable.two))
        DressList.add(Dress(R.drawable.three))

    }

}



