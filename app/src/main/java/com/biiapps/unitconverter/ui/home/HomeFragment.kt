package com.biiapps.unitconverter.ui.home

import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.biiapps.unitconverter.R
import com.biiapps.unitconverter.databinding.FragmentHomeBinding
import github.com.st235.lib_expandablebottombar.MenuItemDescriptor

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textHome
        homeViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val bottomBar = binding.expandableBar
        /*
        val menu= bottomBar.menu

        menu.add(
              MenuItemDescriptor.Builder(
                  view.context,
                  R.id.navigation_home,
                  R.drawable.ic_home_black_24dp,
                  R.string.text,
                  Color.GRAY
              )
                  .build()
          )*/

        bottomBar.onItemSelectedListener = { v, menuItem, b ->
            Log.e("$b *********", menuItem.id.toString())
        }
        bottomBar.onItemReselectedListener = { v, menuItem, b ->
            Log.e("$b ========", menuItem.text.toString())
        }
        val items = arrayOf(
            "Km/h",
            "Meter/s",
            "Miles/h",
            "Miles/m",
            "Miles/s",
            "Feet/h",
            "Feet/m",
            "Feet/s"
        )

        val adapter = ArrayAdapter(
            view.context,
            android.R.layout.simple_spinner_dropdown_item,
            items
        )
        binding.spinner1.adapter = adapter
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}