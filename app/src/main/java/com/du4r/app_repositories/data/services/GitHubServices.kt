package com.du4r.app_repositories.data.services

import com.du4r.app_repositories.data.model.Repo
import retrofit2.http.GET
import retrofit2.http.Path

interface GitHubServices {
    @GET("users/{user}/repos")
    suspend fun listRepositories(@Path("user") user: String): List<Repo>

}