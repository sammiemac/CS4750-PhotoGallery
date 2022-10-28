package com.sammiemac.android.photogallery

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.sammiemac.android.photogallery.api.FlickrFetchr

class PhotoGalleryViewModel : ViewModel() {

    val galleryItemLiveData: LiveData<List<GalleryItem>>
    init {
        galleryItemLiveData = FlickrFetchr().fetchPhotos()
    }

}