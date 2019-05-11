package com.example.motionlayoutex.utils;

import android.support.annotation.IdRes;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

public class UtilsFragment {
    /**
     * Replace an existing fragment that was added to a container.
     * Used for apps that run on platforms prior to Android 3.0.
     */
    public static void replaceFragment(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @IdRes int fragmentContainer, boolean addToBackStack) {
        FragmentTransaction ft = fragmentManager.beginTransaction();
        if (addToBackStack) {
            ft = ft.addToBackStack(fragment.getClass().getSimpleName());
        }

        ft.replace(fragmentContainer, fragment, fragment.getClass().getSimpleName()).commit();
    }

}
