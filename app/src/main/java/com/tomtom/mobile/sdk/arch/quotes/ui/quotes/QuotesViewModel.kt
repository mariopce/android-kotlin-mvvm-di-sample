package com.tomtom.mobile.sdk.arch.quotes.ui.quotes

import androidx.lifecycle.ViewModel
import com.tomtom.mobile.sdk.arch.quotes.data.Quote
import com.tomtom.mobile.sdk.arch.quotes.data.QuoteRepository

class QuotesViewModel(private val quoteRepository: QuoteRepository) : ViewModel(){

    fun getQuotes() = quoteRepository.getQuotes()

    fun addQuote(quote:Quote) = quoteRepository.addQuote(quote)
}