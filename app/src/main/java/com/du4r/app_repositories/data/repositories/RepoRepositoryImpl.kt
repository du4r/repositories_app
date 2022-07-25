package com.du4r.app_repositories.data.repositories


import com.du4r.app_repositories.core.RemoteException
import com.du4r.app_repositories.data.services.GitHubServices
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException

class RepoRepositoryImpl(private val services: GitHubServices): RepoRepository {

    override suspend fun listRepositories(user: String) =  flow {
        try {
            val repoList = services.listRepositories(user)
            emit(repoList)
        }catch (ex: HttpException){
            throw RemoteException(ex.message ?: "Nao foi possivel fazer a busca ")
        }
    }
}