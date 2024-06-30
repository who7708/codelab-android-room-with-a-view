package com.example.android.roomwordssample.compose.word

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

/**
 * @author Chris
 * @version 1.0
 * @since 2024/06/30
 */
class WordViewModel : ViewModel() {

    companion object {
        private const val TAG: String = "WordViewModel"
    }

    // UDP UI state
    private val _uiState = MutableStateFlow(WordUiState())
    val uiState: StateFlow<WordUiState> = _uiState.asStateFlow()


}