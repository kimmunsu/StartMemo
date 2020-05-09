package com.example.startmemo

class GetMemoListUseCase(
    private val memoRepository: MemoRepository
) {
    operator fun invoke(): List<Memo> {
        return memoRepository.getMemoList()
    }
}