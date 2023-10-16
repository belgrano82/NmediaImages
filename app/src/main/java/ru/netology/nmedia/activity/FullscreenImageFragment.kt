package ru.netology.nmedia.activity

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import ru.netology.nmedia.BuildConfig
import ru.netology.nmedia.databinding.FragmentFullscreenImageBinding
import ru.netology.nmedia.util.StringArg
import ru.netology.nmedia.view.load


class FullscreenImageFragment : Fragment() {

    companion object {
        var Bundle.textArg: String? by StringArg
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        val binding = FragmentFullscreenImageBinding.inflate(
            inflater, container, false
        )

        val postImage = arguments?.getString("image")



        binding.apply {

            fullscreenImage.load("${BuildConfig.BASE_URL}/media/$postImage")

        }


        return binding.root
    }

}


