package com.shivani.colorpractice

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import com.shivani.colorpractice.databinding.FragmentfirstBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [fragmentfirst.newInstance] factory method to
 * create an instance of this fragment.
 */
class fragmentfirst : Fragment(), Color {

    private var param1: String? = null
    private var param2: String? = null
    lateinit var binding: FragmentfirstBinding
    lateinit var mainActivity: MainActivity
    var i: Int = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainActivity = activity as MainActivity
        mainActivity.colorchange = this
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentfirstBinding.inflate(layoutInflater)
        binding.btnClear.setOnClickListener {
            binding.Frame.setBackgroundColor(ContextCompat.getColor(mainActivity, R.color.white))
        }
        binding.btnIncrement.setOnClickListener {
            mainActivity.increment(i++)
        }
        binding.btnDecrement.setOnClickListener {
            println("i $i")
            if (i >= 1) {
                i--
            }
            mainActivity.increment(i)
        }
        return binding.root
    }
    override fun colorSwitch(red: Int) {
        binding.Frame.setBackgroundColor(ContextCompat.getColor(mainActivity,red))
    }
}










