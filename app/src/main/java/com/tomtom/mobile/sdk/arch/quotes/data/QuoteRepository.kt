package com.tomtom.mobile.sdk.arch.quotes.data

class QuoteRepository private constructor(private val quoteDao: FakeQuoteDao){

    // This may seem redundant.
    // Imagine a code which also updates and checks the backend.
    fun addQuote(quote: Quote) {
        quoteDao.addQuote(quote)
    }
    fun getQuotes() = quoteDao.getQuotes()
    companion object {
        @Volatile private var instance : QuoteRepository? = null;

        fun getInstance(quoteDao: FakeQuoteDao) = instance ?: synchronized(this) {
            instance ?: QuoteRepository(quoteDao).also { instance = it }
        }
    }
}