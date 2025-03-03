package org.jdc.template.ux.individual

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import org.jdc.template.ui.navigation.ViewModelNav
import org.jdc.template.ui.navigation.ViewModelNavImpl
import org.jdc.template.util.ext.requireIndividualId
import javax.inject.Inject

@HiltViewModel
class IndividualViewModel
@Inject constructor(
    getIndividualUiStateUseCase: GetIndividualUiStateUseCase,
    savedStateHandle: SavedStateHandle
) : ViewModel(), ViewModelNav by ViewModelNavImpl() {
    private val individualId = savedStateHandle.requireIndividualId(IndividualRoute.Arg.INDIVIDUAL_ID)

    val uiState: IndividualUiState = getIndividualUiStateUseCase.invoke(individualId, viewModelScope) { navigate(it) }
}
