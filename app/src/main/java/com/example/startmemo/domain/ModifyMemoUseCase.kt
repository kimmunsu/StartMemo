package com.example.startmemo.domain

class ModifyMemoUseCase (
    private val memoRepository: MemoRepository
){
    fun modifyMemo(memo: Memo) {
        memoRepository.updateMemo(memo)
    }
}