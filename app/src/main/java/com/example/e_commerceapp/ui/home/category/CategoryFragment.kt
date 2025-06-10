package com.example.e_commerceapp.ui.home.category

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.e_commerceapp.databinding.FragmentCategoryBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class CategoryFragment : Fragment() {

    private val viewModel: CategoryViewModel by viewModels()
    private var _binding: FragmentCategoryBinding? = null
    private val binding get() = _binding!!

    private lateinit var categoryAdapter: CategoriesAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentCategoryBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews()
        observeState()
        observeEvents()
        viewModel.onAction(CategoryContract.Action.LoadCategories)
    }

    private fun initViews() {
        categoryAdapter = CategoriesAdapter()
        binding.categoriesRecycler.adapter = categoryAdapter
        binding.tryAgainButton.setOnClickListener {
            viewModel.onAction(CategoryContract.Action.LoadCategories)
        }
    }

    private fun observeState() {
        viewModel.state.observe(viewLifecycleOwner) { state ->
            when (state) {
                is CategoryContract.State.Loading -> showLoading()
                is CategoryContract.State.Success -> showCategories(state)
                is CategoryContract.State.Error -> showError(state.message)
            }
        }
    }

    private fun observeEvents() {
        viewModel.event.observe(viewLifecycleOwner) { event ->
            when (event) {
                is CategoryContract.Event.NavigateToSubCategory -> {

                }
            }
        }
    }

    private fun showLoading() = binding.apply {
        loadingView.isVisible = true
        errorView.isVisible = false
    }

    private fun showCategories(state: CategoryContract.State.Success) = binding.apply {
        loadingView.isVisible = false
        errorView.isVisible = false
        categoryAdapter.submitList(state.categories)
    }

    private fun showError(message: String) = binding.apply {
        loadingView.isVisible = false
        errorView.isVisible = true
        errorMessage.text = message
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
