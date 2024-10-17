package com.grantech.gabaynijuan.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.grantech.gabaynijuan.domain.GetCandidatesUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class MainViewModel @Inject constructor(private val getCandidatesUseCase: GetCandidatesUseCase) : ViewModel() {

    private val mainViewMutableState = MutableStateFlow(MainViewState())
    val mainViewState : StateFlow<MainViewState>
        get() = mainViewMutableState


    fun getCandidateList() {
        viewModelScope.launch {
            mainViewMutableState.emit(mainViewMutableState.value.copy(isLoading = true))
            getCandidatesUseCase.execute()
            delay(100)
            mainViewMutableState.emit(MainViewState(isLoading = false))

        }
    }


}

data class MainViewState(val isLoading: Boolean = false)