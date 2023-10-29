package com.example.tugaspertemuan9

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView
import com.example.tugaspertemuan9.databinding.FragmentOrderBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [OrderFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class OrderFragment : Fragment() {
    private lateinit var binding: FragmentOrderBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentOrderBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(binding){
            val spinner = view.findViewById<Spinner>(R.id.spinner_ticket)
            val ticket = arrayOf("Pilih", "Nilai 1", "Nilai 2", "Nilai 3", "Nilai 4")
            val adapterOrder = ArrayAdapter(requireContext(), android.R.layout.simple_spinner_item, ticket)
            adapterOrder.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinner.adapter = adapterOrder

            spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
                override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                    if (spinner.selectedItem == "Pilih") {
                        (view as TextView).text = ""
                    } else {
                        val selectedValue = ticket[position]
                        // Lakukan tindakan lain berdasarkan item yang dipilih
                    }
                }

                override fun onNothingSelected(parent: AdapterView<*>?) {
                    // Jika tidak ada yang dipilih, biarkan kosong
                }
            }

        }
    }
}