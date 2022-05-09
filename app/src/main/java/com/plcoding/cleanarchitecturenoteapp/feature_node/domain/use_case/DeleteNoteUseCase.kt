package com.plcoding.cleanarchitecturenoteapp.feature_node.domain.use_case

import com.plcoding.cleanarchitecturenoteapp.feature_node.domain.model.Note
import com.plcoding.cleanarchitecturenoteapp.feature_node.domain.repository.NoteRepository

class DeleteNoteUseCase(
    private val repository: NoteRepository
) {

    suspend fun  invoke(note: Note){
        repository.deleteNote(note)
    }
}