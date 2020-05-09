package com.example.startmemo.domain

import com.example.startmemo.domain.Memo
import com.example.startmemo.domain.MemoRepository

class GetMemoListUseCase(
    private val memoRepository: MemoRepository
) {
    operator fun invoke(): List<Memo> {
        return memoRepository.getMemoList()
    }
}