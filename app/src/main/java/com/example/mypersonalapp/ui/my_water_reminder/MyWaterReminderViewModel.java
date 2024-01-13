package com.example.mypersonalapp.ui.my_water_reminder;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MyWaterReminderViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public MyWaterReminderViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is My Water Reminder fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}