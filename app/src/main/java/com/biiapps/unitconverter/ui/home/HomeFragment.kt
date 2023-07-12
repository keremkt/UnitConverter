package com.biiapps.unitconverter.ui.home

import android.graphics.Color
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.TextView
import androidx.core.view.get
import androidx.fragment.app.Fragment
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModelProvider
import com.biiapps.unitconverter.R
import com.biiapps.unitconverter.databinding.FragmentHomeBinding
import github.com.st235.lib_expandablebottombar.MenuItem
import github.com.st235.lib_expandablebottombar.MenuItemDescriptor
import github.com.st235.lib_expandablebottombar.OnItemClickListener
import java.util.Locale

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!
    var currMenu: MutableLiveData<String> = MutableLiveData("speed")
    var input: MutableLiveData<String> = MutableLiveData("")
    var homeViewModel: HomeViewModel? = null
     var i1: String =""
     var i2: String=""
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        homeViewModel =
            ViewModelProvider(this)[HomeViewModel::class.java]

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textHome
        homeViewModel?.text?.observe(viewLifecycleOwner) {
            textView.text = it
        }

        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val bottomBar = binding.expandableBar
        bottomBar.onItemSelectedListener = { v, m, b ->
            homeViewModel?.currMenu = m.text.toString()
            currMenu.value = m.text.toString()
            Log.e("homeviewmodel", homeViewModel!!.currMenu)
            homeViewModel!!.showResult(
                i1,
                currMenu.value.toString(),
                binding.spinner1.selectedItem.toString(),
                binding.spinner2.selectedItem.toString()
            )

        }
        bottomBar.onItemReselectedListener = { v, menuItem, b ->
            Log.e("$b ========", menuItem.text.toString())
        }
        currMenu.observe(viewLifecycleOwner) {
            Log.e("00001", currMenu.value.toString())
            var adapter: ArrayAdapter<CharSequence>? = null
            if (currMenu.value.toString().lowercase(Locale.ROOT) == "speed") {
                adapter = ArrayAdapter.createFromResource(
                    view.context,
                    R.array.speed_menu,
                    android.R.layout.simple_spinner_dropdown_item
                )
            }
            if (currMenu.value.toString().lowercase(Locale.ROOT) == "weight") {
                adapter = ArrayAdapter.createFromResource(
                    view.context,
                    R.array.weight_menu,
                    android.R.layout.simple_spinner_dropdown_item
                )
            }
            if (currMenu.value.toString().lowercase(Locale.ROOT) == "length") {
                adapter = ArrayAdapter.createFromResource(
                    view.context,
                    R.array.length_menu,
                    android.R.layout.simple_spinner_dropdown_item
                )
            }
            if (currMenu.value.toString().lowercase(Locale.ROOT) == "temperature") {
                adapter = ArrayAdapter.createFromResource(
                    view.context,
                    R.array.temperature_menu,
                    android.R.layout.simple_spinner_dropdown_item
                )
            }

            // Specify the layout to use when the list of choices appears
            adapter!!.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Apply the adapter to the spinner
            binding.spinner1.adapter = adapter

        }
        binding.ti1.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                Log.e("*******", "result: $p0")
                i1 = p0.toString()
                i2 = homeViewModel!!.showResult(
                    i1,
                    currMenu.value.toString(),
                    binding.spinner1.selectedItem.toString(),
                    binding.spinner2.selectedItem.toString()
                )
            }

            override fun afterTextChanged(p0: Editable?) {
            }
        }
        )
        binding.spinner1.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(parent: AdapterView<*>?) {
                Log.e("spinner1", "nothing selected")

            }

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                Log.e("spinner1", " selected")
                i2 = homeViewModel!!.showResult(
                    i1,
                    currMenu.value.toString(),
                    binding.spinner1.selectedItem.toString(),
                    binding.spinner2.selectedItem.toString()
                )
            }
        }
        binding.spinner2.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(parent: AdapterView<*>?) {
                Log.e("spinner2", "nothing selected")
            }

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                Log.e("spinner2", "item selected")
                i2 = homeViewModel!!.showResult(
                    i1,
                    currMenu.value.toString(),
                    binding.spinner1.selectedItem.toString(),
                    binding.spinner2.selectedItem.toString()
                )
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}

