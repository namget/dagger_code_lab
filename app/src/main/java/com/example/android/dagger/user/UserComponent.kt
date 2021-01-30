package com.example.android.dagger.user

import com.example.android.dagger.di.LoggedUserScope
import com.example.android.dagger.main.MainActivity
import com.example.android.dagger.settings.SettingsActivity
import dagger.Subcomponent

/**
 * Created by Namget on 2021.01.30.
 */
@LoggedUserScope
@Subcomponent
interface UserComponent {
    @Subcomponent.Factory
    interface Factory {
        fun create(): UserComponent
    }

    fun inject(activity: MainActivity)
    fun inject(activity: SettingsActivity)
}