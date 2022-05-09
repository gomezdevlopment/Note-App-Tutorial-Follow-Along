package com.plcoding.cleanarchitecturenoteapp.feature_node.domain.use_case

data class NoteUseCases(
    val getNotes: GetNotesUseCase,
    val deleteNoteUseCase: DeleteNoteUseCase
)
