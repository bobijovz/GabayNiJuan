package com.grantech.gabaynijuan.di

import android.app.Application
import android.content.Context
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase
import com.grantech.gabaynijuan.data.RepositoryImpl
import com.grantech.gabaynijuan.domain.GetCandidatesUseCase
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
    fun provideRepository(databaseReference: DatabaseReference): Repository {
        return RepositoryImpl(databaseReference)
    }

    @Provides
    @Singleton
    fun provideUseCases(repository: Repository): GetCandidatesUseCase {
        return GetCandidatesUseCase(repository)
    }

}