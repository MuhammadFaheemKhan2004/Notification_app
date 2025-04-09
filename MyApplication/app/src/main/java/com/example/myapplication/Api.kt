package com.example.myapplication


import com.example.ailawyer.QueryData.QueryRequest
import com.example.ailawyer.QueryData.QueryResponse
import retrofit2.http.Body
import retrofit2.http.POST
import retrofit2.Call

interface Api {
    @POST("query")
    fun api(@Body queyrrequest :QueryRequest) : Call <QueryResponse>
}