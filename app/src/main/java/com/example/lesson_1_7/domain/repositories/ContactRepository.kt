package com.example.lesson_1_7.domain.repositories

import androidx.room.*
import com.example.lesson_1_7.data.models.ContactEntity

interface ContactRepository {

   fun addContact(contactEntity: ContactEntity)


    fun getContacts():List<ContactEntity>


    fun updateContact(contactEntity: ContactEntity)


    fun deleteContact(contactEntity: ContactEntity)

}
