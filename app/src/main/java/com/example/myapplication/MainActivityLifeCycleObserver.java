package com.example.myapplication;

import android.util.Log;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;

public class MainActivityLifeCycleObserver implements LifecycleObserver {
    private String NAME = this.getClass().getSimpleName();

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void onCreateEvent(){
        Log.i(NAME, "On_Create State");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onStartEvent(){
        Log.i(NAME, "On_Start State");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResumeEvent(){
        Log.i(NAME, "On_Resume State");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPauseEvent(){
        Log.i(NAME, "On_Pause State");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStopEvent(){
        Log.i(NAME, "On_Stop State");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroyEvent(){
        Log.i(NAME, "On_Destroy State");
    }

}
