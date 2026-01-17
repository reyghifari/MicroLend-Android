package com.raihan.data.service


import com.raihan.data.utils.Endpoint
import retrofit2.http.GET

interface UserService {

    @GET(Endpoint.USERS)
    suspend fun getUsers(): String


}
