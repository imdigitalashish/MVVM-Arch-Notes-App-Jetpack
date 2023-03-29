package com.example.notesappcleanmvvm.feature_note.domain.util

sealed class OrderedType {
    object Ascending: OrderedType()
    object Descending: OrderedType()
}
