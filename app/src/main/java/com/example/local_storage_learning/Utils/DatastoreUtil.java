package com.example.local_storage_learning.Utils;

import android.content.Context;
import android.preference.Preference;

import androidx.datastore.rxjava2.RxDataStore;
import androidx.datastore.rxjava2.RxSharedPreferencesMigrationBuilder;

public class DatastoreUtil {
    private RxDataStore<Preference> mDataStore;
    private DatastoreUtil(Context context) {

    }
}


