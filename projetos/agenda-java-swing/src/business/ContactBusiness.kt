package business

import java.lang.Exception

class ContactBusiness {
    private fun validateOnSave(name: String, phone: String) {
        if (name.isNullOrBlank()) {
            throw Exception("Nome é obrigatório")
        }

        if (phone.isNullOrBlank()) {
            throw Exception("Telefone é obrigatório")
        }
    }

    private fun validateOnDelete(name: String, phone: String) {
        if (name.isNullOrBlank() || phone.isNullOrBlank()) {
            throw Exception("É necessário selecionar um contato antes de remover")
        }
    }

    fun save(name: String, phone: String) {
        validateOnSave(name, phone)
    }

    fun delete(name: String, phone: String) {
        validateOnDelete(name, phone)
    }
}