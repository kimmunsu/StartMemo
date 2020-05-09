package com.example.startmemo

interface MemoRepository {

    fun getMemoList(): List<Memo>
    fun insertMemo(memo: Memo) : Memo
    fun deleteMemo(id: Long)
    fun updateMemo(memo: Memo)
    
}