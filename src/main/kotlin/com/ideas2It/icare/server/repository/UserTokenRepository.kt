package com.ideas2It.icare.server.repository

import com.ideas2It.icare.server.model.entity.UserToken
import com.ideas2It.icare.server.model.entity.Role
import com.ideas2It.icare.server.model.entity.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserTokenRepository: JpaRepository<UserToken, Long> {

    fun findByToken(token: String?) : UserToken?
    
    fun findByName(name: String?):Role
}