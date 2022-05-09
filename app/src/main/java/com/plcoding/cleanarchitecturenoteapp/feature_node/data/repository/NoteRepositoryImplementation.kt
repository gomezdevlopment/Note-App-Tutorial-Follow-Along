package com.plcoding.cleanarchitecturenoteapp.feature_node.data.repository

import com.plcoding.cleanarchitecturenoteapp.feature_node.data.data_source.NoteDao
import com.plcoding.cleanarchitecturenoteapp.feature_node.domain.model.Note
import com.plcoding.cleanarchitecturenoteapp.feature_node.domain.repository.NoteRepository
import kotlinx.coroutines.flow.Flow

class NoteRepositoryImplementation(
    private val dao: NoteDao
): NoteRepository{
    override fun getNotes(): Flow<List<Note>> {
        return dao.getNotes()
    }

    override suspend fun getNotesById(id: Int): Note? {
        return dao.getNotesById(id)
    }

    override suspend fun insertNote(note: Note) {
        dao.insertNote(note)
    }

    override suspend fun deleteNote(note: Note) {
        dao.deleteNote(note)
    }
}