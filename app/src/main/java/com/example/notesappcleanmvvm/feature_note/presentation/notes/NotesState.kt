package com.example.notesappcleanmvvm.feature_note.presentation.notes

import com.example.notesappcleanmvvm.feature_note.domain.model.Note
import com.example.notesappcleanmvvm.feature_note.domain.util.NoteOrder
import com.example.notesappcleanmvvm.feature_note.domain.util.OrderedType

data class NotesState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderedType.Descending),
    val isOrderSectionVisible: Boolean = false
)
