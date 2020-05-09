package com.example.startmemo.domain

class CreateMemoUseCase  (
    private val memoRepository: MemoRepository
){
    fun createMemo(memo: Memo) {
        memoRepository.insertMemo(memo)
    }
}