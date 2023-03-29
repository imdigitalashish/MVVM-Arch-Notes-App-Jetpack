package com.example.notesappcleanmvvm.feature_note.domain.util

sealed class NoteOrder(val orderedType: OrderedType) {
    class Title(orderedType: OrderedType) : NoteOrder(orderedType)
    class Date(orderedType: OrderedType) : NoteOrder(orderedType)
    class Color(orderedType: OrderedType) : NoteOrder(orderedType)
}