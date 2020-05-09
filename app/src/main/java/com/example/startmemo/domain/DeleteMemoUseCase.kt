package com.example.startmemo.domain

class DeleteMemoUseCase (private val memoRepository: MemoRepository
){
    fun deleteMemo(id: Long) {
        memoRepository.deleteMemo(id)
    }
}