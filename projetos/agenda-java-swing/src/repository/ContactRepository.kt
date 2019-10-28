package repository

import entity.ContactEntity

class ContactRepository {

    companion object {
        private val contactList = mutableListOf<ContactEntity>()

        fun save(contact: ContactEntity) {
            contactList.add(contact)
        }

        fun delete(contact: ContactEntity) {

        }

        fun getContacts(): List<ContactEntity> {
            return contactList
        }

    }
}