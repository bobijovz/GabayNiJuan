package com.grantech.gabaynijuan.di

import android.app.Application
import android.content.Context
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase
import com.grantech.gabaynijuan.data.MainDataSource
import com.grantech.gabaynijuan.data.RepositoryImpl
import com.grantech.gabaynijuan.domain.GetCandidatesUseCase
import com.grantech.gabaynijuan.domain.GetPositionsUseCase
import com.grantech.gabaynijuan.domain.abstraction.Repository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {


    @Provides
    @Singleton
    fun provideContext(application: Application): Context {
        return application.applicationContext
    }

    @Provides
    @Singleton
    fun provideDatabaseReference(): DatabaseReference {
        return Firebase.database.reference
    }

    @Provides
    @Singleton
    fun provideDatasource(databaseReference: DatabaseReference): MainDataSource {
        return MainDataSource(databaseReference)
    }

    @Provides
    @Singleton
    fun provideRepository(dataSource: MainDataSource): Repository {
        return RepositoryImpl(dataSource.databaseReference, dataSource)
    }

    @Provides
    @Singleton
    fun provideGetCandidatesUseCase(repository: Repository): GetCandidatesUseCase {
        return GetCandidatesUseCase(repository)
    }

    @Provides
    @Singleton
    fun provideGetPositionsUseCase(repository: Repository): GetPositionsUseCase {
        return GetPositionsUseCase(repository)
    }

}