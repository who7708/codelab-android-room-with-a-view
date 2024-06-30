package com.example.android.roomwordssample.compose.word

/**
 * @author Chris
 * @version 1.0
 * @since 2024/06/30
 */
data class WordUiState(
    val localAddress: String = "正在获取中...",
    val hostAddress: String = "正在获取中...",
    var isRunning: Boolean = false,
    var word: String = "",
)
