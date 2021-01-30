package com.example.android.dagger.base

import androidx.appcompat.app.AppCompatActivity
import com.example.android.dagger.MyApplication

/**
 * Created by Namget on 2021.01.30.
 */
abstract class BaseActivity : AppCompatActivity() {
    protected val myApplication : MyApplication
    get() = (application as MyApplication)
}