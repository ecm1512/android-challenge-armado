package com.educode.challengemegabitefood.presentation

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.educode.challengemegabitefood.data.remote.service.response.Data
import com.educode.challengemegabitefood.domain.usecases.GetPokeHeader
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.lang.Exception

class MainViewModel(private val getPokeHeader: GetPokeHeader): ViewModel() {

    val data = MutableLiveData<Data>()
    fun getPokeHeader() {
        viewModelScope.launch {
           try{
                val responseApi = withContext(Dispatchers.IO){
                    getPokeHeader.invoke()
                }
                data.value = responseApi
            }catch (e: Exception){
                Log.e("Holi", "$e")
                data.value = Data(null,null,null,null,null,null,null,null,null,null)
            }
        }
    }
}