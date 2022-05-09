package com.plcoding.cleanarchitecturenoteapp.feature_node.data.data_source

import androidx.room.*
import kotlinx.coroutines.flow.Flow
import com.plcoding.cleanarchitecturenoteapp.feature_node.domain.model.Note as Note

@Dao
interface NoteDao {

    @Query("SELECT * FROM note")
    fun getNotes(): Flow<List<Note>>

    @Query("SELECT * FROM note WHERE id = :id")
    suspend fun getNotesById(id: Int): Note?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertNote(note: Note)

    @Delete
    suspend fun deleteNote(note: Note)


}