package com.educode.challengemegabitefood.module

import android.app.Application
import com.educode.challengemegabitefood.data.remote.repository.PokeRepository
import com.educode.challengemegabitefood.data.remote.service.PokeServiceDataSource
import com.educode.challengemegabitefood.data.remote.source.RemoteDataSource
import com.educode.challengemegabitefood.domain.usecases.GetPokeHeader
import com.educode.challengemegabitefood.presentation.MainActivity
import com.educode.challengemegabitefood.presentation.MainViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.context.startKoin
import org.koin.core.qualifier.named
import org.koin.dsl.module

fun Application.initDI(){
    startKoin {
        androidLogger()
        androidContext(this@initDI)
        modules(listOf(appModule, dataModule, scopesModule))
    }
}

private val appModule = module {
    factory<RemoteDataSource> { PokeServiceDataSource() }
}

private val dataModule = module{
    factory { PokeRepository(get()) }
}

private val scopesModule = module{
    scope(named<MainActivity>()){
        viewModel { MainViewModel(get()) }
        scoped { GetPokeHeader(get()) }
    }
}