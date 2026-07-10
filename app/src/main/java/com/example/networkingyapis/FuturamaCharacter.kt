package com.example.networkingyapis

data class CharacterResponse(
    val items: List<FuturamaCharacter>,
    val total: Int,
    val page: Int,
    val size: Int,
    val pages: Int
)
data class FuturamaCharacter(
    val id: Int,
    val name: String,
    val gender: String,
    val status: String,
    val species: String,
    val createdAt: String,
    val image: String
)
