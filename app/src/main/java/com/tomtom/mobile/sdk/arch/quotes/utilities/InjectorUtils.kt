package com.tomtom.mobile.sdk.arch.quotes.utilities

import com.tomtom.mobile.sdk.arch.quotes.data.FakeDatabase
import com.tomtom.mobile.sdk.arch.quotes.data.QuoteRepository
import com.tomtom.mobile.sdk.arch.quotes.ui.quotes.QuotesViewModelFactory

object InjectorUtils {
    fun provideQuotesViewModelFactory() : QuotesViewModelFactory{
        val quoteRepository = QuoteRepository.getInstance(FakeDatabase.getInstance().quoteDao);
        return QuotesViewModelFactory(quoteRepository)
    }
}