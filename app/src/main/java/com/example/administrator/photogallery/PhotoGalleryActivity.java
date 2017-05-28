package com.example.administrator.photogallery;

import android.support.v4.app.Fragment;

public class PhotoGalleryActivity extends SinglefragmentActivity {


    @Override
    protected Fragment createFragment() {
        return new PhotoGalleryFragment().newInstance();
    }
}
