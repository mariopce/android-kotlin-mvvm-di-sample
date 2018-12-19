package com.tomtom.mobile.sdk.arch.quotes.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class FakeQuoteDao{
    //fake table
    private val quoteDatabase = mutableListOf<Quote>()

    private val quotes = MutableLiveData<List<Quote>>();

    init {
        quotes.value = quoteDatabase
        addQuote(Quote("S", "f"))
    }

    fun addQuote(quote: Quote) {
        quoteDatabase.add(quote)
        // After adding a quote to the "database",
        // update the value of MutableLiveData
        // which will notify its active observers
        quotes.value = quoteDatabase
    }

    fun getQuotes() = quotes as LiveData<List<Quote>>

}