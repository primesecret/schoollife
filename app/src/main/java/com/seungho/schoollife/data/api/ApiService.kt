package com.seungho.schoollife.data.api

import com.seungho.schoollife.data.common.utils.Constants
import com.seungho.schoollife.data.dto.ResponseApi
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query


interface ApiService {
    @GET(Constants.END_POINT)
    suspend fun getAllCharacters(
        // @Query("count") size:Int,
        @Query("page") page: Int

    ): Response<ResponseApi>
}