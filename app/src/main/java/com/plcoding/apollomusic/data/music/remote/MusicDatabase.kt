package com.plcoding.apollomusic.data.music.remote

import com.google.firebase.firestore.FirebaseFirestore
import com.plcoding.apollomusic.data.music.entites.Song
import com.plcoding.apollomusic.data.music.other.Constant.SONG_COLLECTION
import kotlinx.coroutines.tasks.await
import java.lang.Exception

class MusicDatabase {
    private val firestore = FirebaseFirestore.getInstance()
    private val songCollection = firestore.collection(SONG_COLLECTION)

    suspend fun getALLSongs(): List<Song>{
        return try{
            songCollection.get().await().toObjects(Song::class.java)
        } catch (e: Exception){
            emptyList()
        }

    }

}