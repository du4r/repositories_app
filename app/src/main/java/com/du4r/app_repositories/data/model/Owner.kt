package com.du4r.app_repositories.data.model

import com.google.gson.annotations.SerializedName


data class Owner(
    val login: String,
    @SerializedName("avatar_url")
    val avatarUrl: String
)