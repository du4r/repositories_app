package com.du4r.app_repositories.domain

import com.du4r.app_repositories.core.UseCase
import com.du4r.app_repositories.data.model.Repo
import com.du4r.app_repositories.data.repositories.RepoRepository
import kotlinx.coroutines.flow.Flow

class ListUserRepositoriesUseCase(
    private val repository: RepoRepository
) : UseCase<String,List<Repo>>(){
    override suspend fun execute(param: String): Flow<List<Repo>> {
        return repository.listRepositories(param)
    }
}