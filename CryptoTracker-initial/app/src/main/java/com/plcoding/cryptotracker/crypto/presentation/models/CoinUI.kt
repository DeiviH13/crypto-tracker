package com.plcoding.cryptotracker.crypto.presentation.models

data class CoinUI(
    val id: String,
    val rank: Int,
    val name: String,
    val symbol: String,
    val marketCapUsd: DisplayableNumber,
    val priceUsd: DisplayableNumber,
    val changePercent24Hr: DisplayableNumber
)

data class DisplayableNumber(
    val value: Double,
    val formatted: String
)
