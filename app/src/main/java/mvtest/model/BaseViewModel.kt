package mvtest.model

import android.arch.lifecycle.ViewModel
import mvtest.module.NetworkModule
import mvtest.module.component.ViewModelInjector
import mvtest.model.PostListViewModel
import mvtest.module.component.DaggerViewModelInjector

abstract class BaseViewModel:ViewModel(){
    private val injector: ViewModelInjector = DaggerViewModelInjector
        .builder()
        .networkModule(NetworkModule)
        .build()

    init {
        inject()
    }

    /**
     * Injects the required dependencies
     */
    private fun inject() {
        when (this) {
            is PostListViewModel -> injector.inject(this)
        }
    }
}