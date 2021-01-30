package com.example.android.dagger.login

import com.example.android.dagger.di.ActivityScope
import dagger.Subcomponent

/**
 * Created by Namget on 2021.01.30.
 */
@ActivityScope
@Subcomponent
interface LoginComponent{

    @Subcomponent.Factory
    interface Factory{
        fun create() : LoginComponent
    }

    fun inject(activity : LoginActivity)
}